package com.example.gymhelper.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TrainingPrograms")
data class TrainingProgram (

    @PrimaryKey(autoGenerate = true)
    var TrainingProgramId: Long = 0L,

    @ColumnInfo(name = "Name")
    val Name: String
)