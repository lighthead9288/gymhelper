package com.example.gymhelper.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.Factory
import com.example.gymhelper.db.ExcersizeDatabase

class ExcersizeVariantsViewModelFactory(val excersizeId: Long, private val db: ExcersizeDatabase, private val application: Application): Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ExcersizeVariantsViewModel::class.java))
            return ExcersizeVariantsViewModel(
                excersizeId,
                db,
                application
            ) as T
        throw IllegalAccessException()
    }

}