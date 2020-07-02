package com.example.gymhelper.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.gymhelper.utils.SharedPrefs
import com.example.gymhelper.db.Excersize
import com.example.gymhelper.db.ExcersizeDatabase
import com.example.gymhelper.db.TrainingProgramDay
import com.example.gymhelper.model.ProgramByDays
import com.example.gymhelper.model.TrainingDay
import kotlinx.coroutines.*

class ProgramEditViewModel(private val trainingProgramId: Long, val application: Application): ViewModel() {

    private val db = ExcersizeDatabase.getInstance(application)
    private var viewModelJob = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)
    private var sharedPrefs: SharedPrefs? = null

    private val _curTrainingProgram = MutableLiveData<ProgramByDays>()
    val curTrainingProgram: LiveData<ProgramByDays>
        get() = _curTrainingProgram

    private val _newTrainingDay = MutableLiveData<Long>()
    val newTrainingDay: LiveData<Long>
        get() = _newTrainingDay

    private val _isCurTrainingProgramSelected = MutableLiveData<Boolean>()
    val isCurTrainingProgramSelected: LiveData<Boolean>
        get() = _isCurTrainingProgramSelected

    init {
        checkCurTrainingProgramSelection()
        getCurTrainingProgram()
    }

    fun checkCurTrainingProgramSelection() {
        sharedPrefs = SharedPrefs(application)
        val progId = sharedPrefs!!.curTrainingProgramId
        _isCurTrainingProgramSelected.value = (progId!=trainingProgramId)
    }

    fun assignCurTrainingProgram() {
        sharedPrefs!!.curTrainingProgramId = trainingProgramId
        checkCurTrainingProgramSelection()
    }

    fun deleteTrainingDay(trainingDayId: Long) {
        uiScope.launch {
            deleteTrainingDayFromDb(trainingDayId)
            _curTrainingProgram.value = getCurTrainingProgramFromDb()
        }
    }

    fun addNewTrainingDay(trainingProgramId: Long, dayName: String) {
        uiScope.launch {
            _newTrainingDay.value = addNewTrainingDayToDb(
                TrainingProgramDay(trainingProgramId = trainingProgramId, DayName = dayName)
            )
            _curTrainingProgram.value = getCurTrainingProgramFromDb()
        }
    }

    fun getCurTrainingProgram() {
        uiScope.launch {
            _curTrainingProgram.value = getCurTrainingProgramFromDb()
        }
    }

    private suspend fun deleteTrainingDayFromDb(trainingDayId: Long) {
        withContext(Dispatchers.IO) {
            val day = db.trainingProgramDayDao.getTrainingProgramDayById(trainingDayId)
            db.trainingProgramDayDao.delete(day)
            db.trainingProgramsExcercizesDao.deleteByTrainingDayId(trainingDayId)
        }
    }

    private suspend fun addNewTrainingDayToDb(trainingProgramDay: TrainingProgramDay): Long? {
        return withContext(Dispatchers.IO) {
            val dayId = db.trainingProgramDayDao.insert(trainingProgramDay)
            dayId
        }
    }

    private suspend fun getCurTrainingProgramFromDb():ProgramByDays  {

        return withContext(Dispatchers.IO) {
            val trainingProgramDays
                    = db.trainingProgramDayDao.getTrainingProgramDays(trainingProgramId)

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
                trainingDays.add(
                    TrainingDay(
                        trainingProgramDay,
                        curDayExList.distinctBy {
                            it.ExcersizeId
                        }
                    )
                )
            }

            val trainingProgramByDays = ProgramByDays(trainingDays)
            trainingProgramByDays
        }
    }


}

