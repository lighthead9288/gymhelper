package com.example.gymhelper.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.gymhelper.utils.SharedPrefs
import com.example.gymhelper.db.ExcersizeDatabase
import com.example.gymhelper.db.TrainingProgram
import com.example.gymhelper.model.TrainingProgramWithDetails
import kotlinx.coroutines.*

class ProgramsListViewModel(private val application: Application): ViewModel() {

    private val db = ExcersizeDatabase.getInstance(application)
    private var viewModelJob = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)
    private var sharedPrefs: SharedPrefs? = null

    private var _trainingProgramsList =  MutableLiveData<List<TrainingProgramWithDetails>>()
    val trainingProgramsList: LiveData<List<TrainingProgramWithDetails>>
        get() = _trainingProgramsList

    init {
        getTrainingPrograms()
    }

    fun checkCurTrainingProgramSelection(trainingProgramId: Long): Boolean {
        sharedPrefs = SharedPrefs(application)
        val progId = sharedPrefs!!.curTrainingProgramId
        return (progId==trainingProgramId)
    }

    fun deleteTrainingProgram(trainingProgram: TrainingProgram) {
        uiScope.launch {
            deleteTrainingProgramFromDb(trainingProgram)
            _trainingProgramsList.value = getTrainingProgramsFromDb()
        }
    }

    fun addNewTrainingProgram(name: String) {
        uiScope.launch {
            addNewTrainingProgramToDb(TrainingProgram(Name = name))
            _trainingProgramsList.value = getTrainingProgramsFromDb()
        }
    }

    fun getTrainingPrograms() {
        uiScope.launch {
            _trainingProgramsList.value = getTrainingProgramsFromDb()
        }
    }


    private suspend fun deleteTrainingProgramFromDb(trainingProgram: TrainingProgram) {
        withContext(Dispatchers.IO) {
            val daysForDelete
                    = db.trainingProgramDayDao.getTrainingProgramDays(trainingProgram.TrainingProgramId)
            for(day in daysForDelete) {
                db.trainingProgramsExcercizesDao.deleteByTrainingDayId(day.TrainingProgramDayId)
            }
            db.trainingProgramDayDao.deleteByTrainingProgramId(trainingProgram.TrainingProgramId)
            db.trainingProgramDao.delete(trainingProgram)
        }
    }

    private suspend fun addNewTrainingProgramToDb(trainingProgram: TrainingProgram) {
        withContext(Dispatchers.IO) {
            db.trainingProgramDao.insert(trainingProgram)
        }
    }

    private suspend fun getTrainingProgramsFromDb(): List<TrainingProgramWithDetails> {
        return withContext(Dispatchers.IO) {
            val programs = db.trainingProgramDao.getAll()
            var programsWithDetails
                    = mutableListOf<TrainingProgramWithDetails>()
            for(program in programs) {
                val isChecked = checkCurTrainingProgramSelection(program.TrainingProgramId)
                programsWithDetails.add(
                    TrainingProgramWithDetails(trainingProgram = program, isChecked = isChecked)
                )
            }
            programsWithDetails
        }
    }

}