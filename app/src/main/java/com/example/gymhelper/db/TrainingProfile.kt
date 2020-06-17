package com.example.gymhelper.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TrainingProfiles")
data class TrainingProfile (
    @PrimaryKey(autoGenerate = true)
    var TrainingProfileId: Long = 0L,

    @ColumnInfo(name = "Name")
    val Name: String
)