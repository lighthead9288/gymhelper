package com.example.gymhelper.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TrainingProgramDays")
data class TrainingProgramDay(
    @PrimaryKey(autoGenerate = true)
    var TrainingProgramDayId: Long = 0L,

    @ColumnInfo(name = "trainingProgramId")
    val trainingProgramId: Long?,

    @ColumnInfo(name = "dayName")
    val DayName: String
)