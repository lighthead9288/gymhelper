package com.example.gymhelper.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.gymhelper.utils.SharedPrefs
import com.example.gymhelper.db.Excersize
import com.example.gymhelper.db.ExcersizeDatabase
import com.example.gymhelper.model.ExcersizeVariantsSearchHelper
import kotlinx.coroutines.*

class ExcersizeVariantsViewModel(private val excersizeId: Long?, private val application: Application
) : ViewModel() {

    private val db = ExcersizeDatabase.getInstance(application)
    private val viewModelJob = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)
    private var sharedPrefs: SharedPrefs? = null

    private var _excersizeVariants = MutableLiveData<MutableList<Excersize>>()
    val excersizeVariants: LiveData<MutableList<Excersize>>
        get() = _excersizeVariants

    init {
        getExcersizeVariants()
    }

    fun getExcersizeVariants() {
        uiScope.launch {
            val curProfileId = getCurProfileId()
            var source = mutableListOf<Excersize>()

            if (curProfileId==0L) {
                source = getAllExsFromDb().toMutableList()
            } else {
                source = getExcersizesByProfileId(curProfileId).toMutableList()
            }

            val excersizeFromDb = getExcersizeByIdFromDB()
            _excersizeVariants.value = ExcersizeVariantsSearchHelper(
                source.toMutableList()
            ).getSortedExcersizeVariantsList(excersizeFromDb)
        }
    }

    private fun getCurProfileId():Long {
        sharedPrefs = SharedPrefs(application)
        return sharedPrefs!!.curProfileProgramId
    }

    private suspend fun getAllExsFromDb():List<Excersize> {
        return withContext(Dispatchers.IO) {
            db.excersizeDao.getAll()
        }
    }

    private suspend fun getExcersizesByProfileId(curProfileId: Long): List<Excersize> {
        return withContext(Dispatchers.IO) {
            val items
                    = db.trainingProfilesExcersizesDao.getTrainingProfileExcersizes(curProfileId)
            val exs = mutableListOf<Excersize>()
            for(item in items) {
                exs.add(db.excersizeDao.get(item.excersizeId))
            }
            exs
        }
    }

    private suspend fun getExcersizeByIdFromDB(): Excersize {
        return withContext(Dispatchers.IO) {
            db.excersizeDao.get(excersizeId)
        }
    }
}