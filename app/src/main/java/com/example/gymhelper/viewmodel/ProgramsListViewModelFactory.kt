package com.example.gymhelper.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.Factory
import com.example.gymhelper.db.ExcersizeDatabase

class ProgramsListViewModelFactory(private val dataSource: ExcersizeDatabase, private val application: Application): Factory {

    @Suppress("unchecked_cast")
    override fun<T: ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProgramsListViewModel::class.java)) {
            return ProgramsListViewModel(
                dataSource,
                application
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}