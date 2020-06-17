package com.example.gymhelper.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.gymhelper.SharedPrefs
import com.example.gymhelper.db.ExcersizeDatabase
import com.example.gymhelper.db.TrainingProfile
import com.example.gymhelper.model.TrainingProfileWithDetails
import kotlinx.coroutines.*

class ProfilesListViewModel(private val dataSource: ExcersizeDatabase, private val application: Application): ViewModel() {

    val db = dataSource

    private var viewModelJob = Job()

    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    private var sharedPrefs: SharedPrefs? = null

    private var _trainingProfilesList =  MutableLiveData<List<TrainingProfileWithDetails>>()
    val trainingProfilesList: LiveData<List<TrainingProfileWithDetails>>
        get() = _trainingProfilesList

    init {
        getTrainingProfiles()
    }

    fun checkCurTrainingProfileSelection(trainingProfileId: Long): Boolean {
        sharedPrefs = SharedPrefs(application)
        val profId = sharedPrefs!!.curProfileProgramId
        return (profId==trainingProfileId)
    }

    fun deleteTrainingProfile(trainingProfile: TrainingProfile) {
        uiScope.launch {
            deleteTrainingProfileFromDb(trainingProfile)
            _trainingProfilesList.value = getTrainingProfilesFromDb()

        }
    }

    fun addNewTrainingProfile(name: String) {
        uiScope.launch {
            addNewTrainingProfileToDb(TrainingProfile(Name = name))
            _trainingProfilesList.value = getTrainingProfilesFromDb()
        }
    }

    fun getTrainingProfiles() {

        uiScope.launch {
            _trainingProfilesList.value = getTrainingProfilesFromDb()
        }
    }


    private suspend fun deleteTrainingProfileFromDb(trainingProfile: TrainingProfile) {
        withContext(Dispatchers.IO) {
            db.trainingProfilesExcersizesDao.deleteByTrainingProfileId(trainingProfile.TrainingProfileId)
            db.trainingProfileDao.delete(trainingProfile)
        }
    }

    private suspend fun addNewTrainingProfileToDb(trainingProfile: TrainingProfile) {
        withContext(Dispatchers.IO) {
            db.trainingProfileDao.insert(trainingProfile)
        }
    }

    private suspend fun getTrainingProfilesFromDb(): List<TrainingProfileWithDetails> {

        return withContext(Dispatchers.IO) {

            val profiles = db.trainingProfileDao.getAll()
            var trainingProfilesWithDetails = mutableListOf<TrainingProfileWithDetails>()
            for(profile in profiles) {
                val isChecked = checkCurTrainingProfileSelection(profile.TrainingProfileId)
                trainingProfilesWithDetails.add(TrainingProfileWithDetails(trainingProfile = profile, isChecked = isChecked))
            }

            trainingProfilesWithDetails
        }
    }
}