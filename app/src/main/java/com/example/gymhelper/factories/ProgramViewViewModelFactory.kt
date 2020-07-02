package com.example.gymhelper.factories

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.Factory
import com.example.gymhelper.viewmodel.ProgramViewViewModel
import java.lang.IllegalArgumentException

class ProgramViewViewModelFactory(val application: Application): Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProgramViewViewModel::class.java)) {
            return ProgramViewViewModel(
                application
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}