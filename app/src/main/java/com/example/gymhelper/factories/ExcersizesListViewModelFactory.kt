package com.example.gymhelper.factories

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.Factory
import com.example.gymhelper.db.Excersize
import com.example.gymhelper.viewmodel.ExcersizesListViewModel

class ExcersizesListViewModelFactory(
    private val trainingDayId: Long,
    private val application: Application
) : Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ExcersizesListViewModel::class.java)) {
            return ExcersizesListViewModel(
                trainingDayId,
                application
            ) as T
        }
        throw IllegalAccessException()
    }
}