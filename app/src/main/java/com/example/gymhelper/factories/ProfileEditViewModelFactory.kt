package com.example.gymhelper.factories

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.gymhelper.viewmodel.ProfileEditViewModel

class ProfileEditViewModelFactory(
    private val trainingProfileId: Long,
    private val application: Application
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProfileEditViewModel::class.java)) {
            return ProfileEditViewModel(
                trainingProfileId,
                application
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }


}