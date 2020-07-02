package com.example.gymhelper.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.gymhelper.utils.SharedPrefs
import com.example.gymhelper.db.ExcersizeDatabase
import com.example.gymhelper.db.Photo
import com.example.gymhelper.model.ExcersizeWithDetails
import kotlinx.coroutines.*

class ExcersizeViewViewModel(val excersizeId: Long,  private val application: Application): ViewModel() {

    private val db = ExcersizeDatabase.getInstance(application)
    private val viewModelJob = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    private var _excersize = MutableLiveData<ExcersizeWithDetails>()
    val excersize: LiveData<ExcersizeWithDetails>
    get() = _excersize

    private var _photos = MutableLiveData<List<String>>()
    val photos: LiveData<List<String>>
    get() = _photos


    init {
        getExcersizeWithDetails()
    }

    fun getExcersizeWithDetails() {
        uiScope.launch {
            val excersizeFromDb = getExcersizeWithDetailsFromDb()
            _excersize.value = excersizeFromDb
            _photos.value = excersizeFromDb.photos.map { it.path }
        }
    }

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