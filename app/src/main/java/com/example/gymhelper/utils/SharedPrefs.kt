package com.example.gymhelper.utils

import android.content.Context
import android.content.SharedPreferences

class SharedPrefs(context: Context) {
    val PREFS_FILENAME = "com.example.gymhelper.curDataPrefs"
    val prefs: SharedPreferences = context.getSharedPreferences(PREFS_FILENAME, 0);

    var curTrainingProgramId: Long
        get() = prefs.getLong("curTrainingProgramId", 0L)
        set(value) = prefs.edit().putLong("curTrainingProgramId", value).apply()

    var curProfileProgramId: Long
        get() = prefs.getLong("curProfileProgramId", 0L)
        set(value) = prefs.edit().putLong("curProfileProgramId", value).apply()
}