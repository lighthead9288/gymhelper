package com.example.gymhelper.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.Factory
import com.example.gymhelper.db.ExcersizeDatabase

class ProgramEditViewModelFactory(private val trainingProgramId: Long, private val db: ExcersizeDatabase, private val application: Application): Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProgramEditViewModel::class.java))
            return ProgramEditViewModel(
                trainingProgramId,
                db,
                application
            ) as T
        throw IllegalArgumentException("Unknown ViewModel class")
    }


}