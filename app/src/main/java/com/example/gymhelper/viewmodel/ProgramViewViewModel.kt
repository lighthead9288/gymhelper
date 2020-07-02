package com.example.gymhelper.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.gymhelper.utils.SharedPrefs
import com.example.gymhelper.db.Excersize
import com.example.gymhelper.db.ExcersizeDatabase
import com.example.gymhelper.model.ProgramByDays
import com.example.gymhelper.model.TrainingDay
import kotlinx.coroutines.*

class ProgramViewViewModel(val application: Application): ViewModel() {

    private val db = ExcersizeDatabase.getInstance(application)
    private var viewModelJob = Job()
    private var uiScope = CoroutineScope(Dispatchers.Main +  viewModelJob)
    private var sharedPrefs: SharedPrefs? = null

    private val _curTrainingProgram = MutableLiveData<ProgramByDays>()
    val curTrainingProgram: LiveData<ProgramByDays>
        get() = _curTrainingProgram

    init {
        getCurrentTrainingProgram()
    }

    fun getCurrentTrainingProgram() {
        val id = getCurrentTrainingProgramId()
        uiScope.launch {
            _curTrainingProgram.value = getCurTrainingProgramFromDb(id)
        }
    }

    fun getCurrentTrainingProgramId(): Long {
        sharedPrefs = SharedPrefs(application)
        return sharedPrefs!!.curTrainingProgramId
    }

    private suspend fun getCurTrainingProgramFromDb(id: Long): ProgramByDays {
        return withContext(Dispatchers.IO) {
            val trainingProgramDays
                    = db.trainingProgramDayDao.getTrainingProgramDays(id)
            val trainingDays = mutableListOf<TrainingDay>()
            for (trainingProgramDay in trainingProgramDays) {
                val excersizes
                        = db.trainingProgramsExcercizesDao.getById(trainingProgramDay.TrainingProgramDayId)
                val sortedExcercizes = excersizes.sortedBy { x->x.DayId }
                val curDayExList = mutableListOf<Excersize>()
                for (ex in sortedExcercizes) {
                    val excersize = db.excersizeDao.get(ex.excersizeId)
                    curDayExList.add(excersize)
                }
                trainingDays.add(TrainingDay(trainingProgramDay, curDayExList))
            }
            val trainingProgramByDays = ProgramByDays(trainingDays)

            trainingProgramByDays
        }
    }


}