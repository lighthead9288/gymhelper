package com.example.gymhelper.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.gymhelper.db.ExcersizeDatabase

class ProfilesListViewModelFactory (private val dataSource: ExcersizeDatabase, private val application: Application):
    ViewModelProvider.Factory {

    @Suppress("unchecked_cast")
    override fun<T: ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProfilesListViewModel::class.java)) {
            return ProfilesListViewModel(
                dataSource,
                application
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}