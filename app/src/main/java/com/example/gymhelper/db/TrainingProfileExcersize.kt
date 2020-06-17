package com.example.gymhelper.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TrainingProfilesExcersizes")
data class TrainingProfileExcersize (

    @PrimaryKey(autoGenerate = true)
    val Id: Long = 0L,

    @ColumnInfo(name = "TrainingProfileId")
    val trainingProfileId: Long?,

    @ColumnInfo(name = "ExcersizeId")
    val excersizeId: Long?

)