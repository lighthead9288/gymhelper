package com.example.gymhelper.factories

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.gymhelper.viewmodel.ProfilesListViewModel

class ProfilesListViewModelFactory (private val application: Application) : ViewModelProvider.Factory {

    @Suppress("unchecked_cast")
    override fun<T: ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProfilesListViewModel::class.java)) {
            return ProfilesListViewModel(
                application
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}