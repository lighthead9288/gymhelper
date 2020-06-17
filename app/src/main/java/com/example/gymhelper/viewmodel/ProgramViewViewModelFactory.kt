package com.example.gymhelper.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.Factory
import com.example.gymhelper.db.ExcersizeDatabase
import java.lang.IllegalArgumentException

class ProgramViewViewModelFactory(private val dataSource: ExcersizeDatabase, val application: Application): Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProgramViewViewModel::class.java))
            return ProgramViewViewModel(
                dataSource,
                application
            ) as T
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}