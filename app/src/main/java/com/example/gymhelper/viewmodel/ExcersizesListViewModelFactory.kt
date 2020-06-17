package com.example.gymhelper.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.Factory
import com.example.gymhelper.db.Excersize
import com.example.gymhelper.db.ExcersizeDatabase

class ExcersizesListViewModelFactory(private val trainingDayId: Long, private val excersizes:MutableList<Excersize>,
                                     private val db: ExcersizeDatabase, private val application: Application): Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ExcersizesListViewModel::class.java))
            return ExcersizesListViewModel(
                trainingDayId,
                excersizes,
                db,
                application
            ) as T
        throw IllegalAccessException()
    }
}