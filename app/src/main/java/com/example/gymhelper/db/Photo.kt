package com.example.gymhelper.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Photos")
data class Photo (

    @PrimaryKey(autoGenerate = true)
    var PhotoId: Long = 0L,

    @ColumnInfo(name = "Path")
    val path: String
)