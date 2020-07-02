package com.example.gymhelper.factories

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.Factory
import com.example.gymhelper.viewmodel.ProgramEditViewModel

class ProgramEditViewModelFactory(
    private val trainingProgramId: Long,
    private val application: Application
) : Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProgramEditViewModel::class.java)) {
            return ProgramEditViewModel(
                trainingProgramId,
                application
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }


}