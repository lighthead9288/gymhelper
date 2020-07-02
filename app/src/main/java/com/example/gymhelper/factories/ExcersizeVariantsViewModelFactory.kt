package com.example.gymhelper.factories

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.Factory
import com.example.gymhelper.viewmodel.ExcersizeVariantsViewModel

class ExcersizeVariantsViewModelFactory(
    val excersizeId: Long?,
    private val application: Application
) : Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ExcersizeVariantsViewModel::class.java)) {
            return ExcersizeVariantsViewModel(
                excersizeId,
                application
            ) as T
        }
        throw IllegalAccessException()
    }

}