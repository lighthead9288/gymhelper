package com.example.gymhelper.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.gymhelper.SharedPrefs
import com.example.gymhelper.db.ExcersizeDatabase
import com.example.gymhelper.db.Photo
import com.example.gymhelper.model.ExcersizeWithDetails
import kotlinx.coroutines.*

class ExcersizeViewViewModel(val excersizeId: Long, private val db: ExcersizeDatabase, private val application: Application): ViewModel() {

    val viewModelJob = Job()

    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    private var _excersize = MutableLiveData<ExcersizeWithDetails>()
    val excersize: LiveData<ExcersizeWithDetails>
    get() = _excersize

    private var _photos = MutableLiveData<List<String>>()
    val photos: LiveData<List<String>>
    get() = _photos

   /* private var _excersizeVariants = MutableLiveData<MutableList<Excersize>>()
    val excersizeVariants: LiveData<MutableList<Excersize>>
        get() = _excersizeVariants*/

    private var sharedPrefs: SharedPrefs? = null


    init {
        getExcersizeWithDetails()
       // getExcersizeVariants()
    }

    fun getExcersizeWithDetails() {
        uiScope.launch {
            val excersizeFromDb = getExcersizeWithDetailsFromDb()
            _excersize.value = excersizeFromDb
            _photos.value = excersizeFromDb.photos.map { it.path }
        }
    }

  /*  fun getExcersizeVariants() {
        uiScope.launch {
            val curProfileId = getCurProfileId()

            var source = mutableListOf<Excersize>()

            if (curProfileId==0L)
                source = getAllExsFromDb().toMutableList()
            else
                source = getExcersizesByProfileId(curProfileId).toMutableList()

            val excersizeFromDb = getExcersizeWithDetailsFromDb()

            _excersizeVariants.value = ExcersizeVariantsSearchHelper(source.toMutableList()).getSortedExcersizeVariantsList(excersizeFromDb.excersize)
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
            val items = db.trainingProfilesExcersizesDao.getTrainingProfileExcersizes(curProfileId)
            val exs = mutableListOf<Excersize>()
            for(item in items) {
                exs.add(db.excersizeDao.get(item.excersizeId))
            }
            exs
        }
    }*/


    private suspend fun getExcersizeWithDetailsFromDb(): ExcersizeWithDetails {
        return withContext(Dispatchers.IO) {
            val excersize = db.excersizeDao.get(excersizeId)
            val photosIds = db.excercizePhotoDao.getByExcersizeId(excersizeId).map { it.photoId }
            val photos = mutableListOf<Photo>()
            for (id in photosIds) {
                photos.add(db.photoDao.get(id))
            }
            ExcersizeWithDetails(excersize, photos)
        }
    }
}