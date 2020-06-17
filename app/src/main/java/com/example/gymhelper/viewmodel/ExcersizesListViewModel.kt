package com.example.gymhelper.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.gymhelper.db.Excersize
import com.example.gymhelper.db.ExcersizeDatabase
import com.example.gymhelper.db.TrainingProgramsExcersizes
import com.example.gymhelper.model.ExcersizeGroup
import com.example.gymhelper.model.ExcersizesByGroups
import kotlinx.coroutines.*

class ExcersizesListViewModel(private val trainingDayId: Long, private val excersizes:MutableList<Excersize>,
                              private val db: ExcersizeDatabase, private val application: Application): ViewModel() {

    private var viewModelJob = Job()

    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    val excersizesByGroups: LiveData<ExcersizesByGroups>
    get() = _excersizesByGroups

    var _excersizesByGroups = MutableLiveData<ExcersizesByGroups>()

    val _dayName = MutableLiveData<String>()
    val dayName: LiveData<String>
    get() = _dayName

    init {
        getTrainingDay()
        getAllExcersizes()
    }

   /* fun changeTrainingDayName() {
        val name = dayName.value
    }*/

    fun getAllExcersizes() {
        uiScope.launch {
            _excersizesByGroups.value = getAllExcersizesFromDb()
        }
    }

    fun getTrainingDay() {
        uiScope.launch {
            _dayName.value = getCurTrainingDay()
        }

    }

    fun onExcersizeChecked(trainingDayId: Long, excersizeId: Long) {
        val ex = TrainingProgramsExcersizes(DayId = trainingDayId, excersizeId = excersizeId)
        uiScope.launch {
                addExcersizeToTrainingProgram(ex)
        }

    }

    fun onExcersizeUnchecked(trainingDayId: Long, excersizeId: Long) {
        uiScope.launch {
            deleteExcersizeFromTrainingProgram(trainingDayId, excersizeId)
        }
    }

    private suspend fun getCurTrainingDay(): String {
        return withContext(Dispatchers.IO) {
            val day = db.trainingProgramDayDao.getTrainingProgramDayById(trainingDayId)
            day.DayName
        }
    }

    private suspend fun addExcersizeToTrainingProgram(trainingProgramExcersize: TrainingProgramsExcersizes) {
        withContext(Dispatchers.IO) {
            db.trainingProgramsExcercizesDao.insert(trainingProgramExcersize)
        }
    }

    private suspend fun deleteExcersizeFromTrainingProgram(trainingDayId: Long, excersizeId: Long) {
        withContext(Dispatchers.IO) {
            val trProgrEx = db.trainingProgramsExcercizesDao.getDayExcersizeById(trainingDayId, excersizeId)
           // val rows = db.trainingProgramsExcercizesDao.deleteExersizeFromTrainingProgram(trainingProgramId, excersizeId)
            db.trainingProgramsExcercizesDao.delete(trProgrEx)
        }
    }

    private suspend fun getAllExcersizesFromDb():ExcersizesByGroups {
        return withContext(Dispatchers.IO) {
            val excersizes = db.excersizeDao.getAll()
            val groups = excersizes.map { it.Group }.distinct()

            val groupedExcersizes = mutableListOf<ExcersizeGroup>()
            for (group in groups) {
                val curGroupExs = excersizes.filter { x->x.Group==group }
                groupedExcersizes.add(ExcersizeGroup(group, curGroupExs))
            }

            val result = ExcersizesByGroups(groupedExcersizes)
            result
        }
    }




}