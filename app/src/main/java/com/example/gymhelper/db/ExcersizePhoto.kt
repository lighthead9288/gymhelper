package com.example.gymhelper.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ExcersizePhoto")
data class ExcersizePhoto (

    @PrimaryKey(autoGenerate = true)
    var Id: Long = 0L,

    @ColumnInfo(name = "ExcersizeId")
    val excersizeId: Long?,

    @ColumnInfo(name = "PhotoId")
    val photoId: Long?
)