package com.example.gymhelper.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.gymhelper.SharedPrefs
import com.example.gymhelper.db.*
import com.example.gymhelper.model.ExcersizeGroup
import com.example.gymhelper.model.ExcersizesByGroups
import kotlinx.coroutines.*

class ProfileEditViewModel(private val trainingProfileId: Long, private val db: ExcersizeDatabase, val application: Application): ViewModel() {

    private var viewModelJob = Job()

    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    private var sharedPrefs: SharedPrefs? = null

    private val _excersizesByGroups = MutableLiveData<ExcersizesByGroups>()
    val excersizesByGroups: LiveData<ExcersizesByGroups>
        get() = _excersizesByGroups

    private val _isCurTrainingProfileSelected = MutableLiveData<Boolean>()
    val isCurTrainingProfileSelected: LiveData<Boolean>
        get() = _isCurTrainingProfileSelected

    private val _curTrainingProfile = MutableLiveData<MutableList<Excersize>>()
    val curTrainingProfile: LiveData<MutableList<Excersize>>
        get() = _curTrainingProfile

    init {
        checkCurTrainingProfileSelection()
       // getCurTrainingProfile()
        getAllExcersizes()
    }

    fun checkCurTrainingProfileSelection() {
        sharedPrefs = SharedPrefs(application)
        val profileId = sharedPrefs!!.curProfileProgramId
        _isCurTrainingProfileSelected.value = (profileId!=trainingProfileId)
    }

    fun assignCurTrainingProfile() {
        sharedPrefs!!.curProfileProgramId = trainingProfileId
        checkCurTrainingProfileSelection()
    }

    fun onExcersizeChecked(trainingProfileId: Long, excersizeId: Long) {
        val ex = TrainingProfileExcersize(trainingProfileId = trainingProfileId, excersizeId = excersizeId)
        uiScope.launch {
            addExcersizeToTrainingProfile(ex)
        }

    }

    fun onExcersizeUnchecked(trainingProfileId: Long, excersizeId: Long) {
        uiScope.launch {
            deleteExcersizeFromTrainingProfile(trainingProfileId, excersizeId)
        }
    }


   /* fun getCurTrainingProfile() {
        uiScope.launch {
            _curTrainingProfile.value = getCurProfileExcersizesFromDb()
        }
    }*/

    fun getAllExcersizes() {
        uiScope.launch {
            _curTrainingProfile.value = getCurProfileExcersizesFromDb()
            _excersizesByGroups.value = getAllExcersizesFromDb()
        }
    }

    private suspend fun addExcersizeToTrainingProfile(trainingProfileExcersize: TrainingProfileExcersize) {
        withContext(Dispatchers.IO) {
            db.trainingProfilesExcersizesDao.insert(trainingProfileExcersize)
        }
    }

    private suspend fun deleteExcersizeFromTrainingProfile(trainingProfileId: Long, excersizeId: Long) {
        withContext(Dispatchers.IO) {
            val trProgrEx = db.trainingProfilesExcersizesDao.getTrainingProfileExcersize(trainingProfileId, excersizeId)
            db.trainingProfilesExcersizesDao.delete(trProgrEx)
        }
    }

    private suspend fun getCurProfileExcersizesFromDb(): MutableList<Excersize> {
        return withContext(Dispatchers.IO) {
            val items = db.trainingProfilesExcersizesDao.getTrainingProfileExcersizes(trainingProfileId)
            val exs = mutableListOf<Excersize>()
            for(item in items) {
                exs.add(db.excersizeDao.get(item.excersizeId))
            }
            exs.distinctBy { it.ExcersizeId }.toMutableList()
        }
    }

    private suspend fun getAllExcersizesFromDb(): ExcersizesByGroups {
        return withContext(Dispatchers.IO) {
            val excersizes = db.excersizeDao.getAll()
            val groups = excersizes.map { it.Group }.distinct()

            val groupedExcersizes = mutableListOf<ExcersizeGroup>()
            for (group in groups) {
                val curGroupExs = excersizes.filter { x->x.Group==group }.distinctBy { it.ExcersizeId }
                groupedExcersizes.add(ExcersizeGroup(group, curGroupExs))
            }

            val result = ExcersizesByGroups(groupedExcersizes)
            result
        }
    }

}