package com.example.gymhelper.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.gymhelper.db.ExcersizeDatabase

class ProfileEditViewModelFactory (private val trainingProfileId: Long, private val db: ExcersizeDatabase, private val application: Application):
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProfileEditViewModel::class.java))
            return ProfileEditViewModel(
                trainingProfileId,
                db,
                application
            ) as T
        throw IllegalArgumentException("Unknown ViewModel class")
    }


}