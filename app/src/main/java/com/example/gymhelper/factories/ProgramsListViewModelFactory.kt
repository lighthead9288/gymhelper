package com.example.gymhelper.factories

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.Factory
import com.example.gymhelper.viewmodel.ProgramsListViewModel

class ProgramsListViewModelFactory(private val application: Application): Factory {

    @Suppress("unchecked_cast")
    override fun<T: ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProgramsListViewModel::class.java)) {
            return ProgramsListViewModel(
                application
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}