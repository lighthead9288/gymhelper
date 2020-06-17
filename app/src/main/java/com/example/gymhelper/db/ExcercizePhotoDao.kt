package com.example.gymhelper.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ExcercizePhotoDao {

    @Insert
    fun insert(excersizePhoto: ExcersizePhoto)

    @Delete
    fun delete(excersizePhoto: ExcersizePhoto)

    @Query("DELETE FROM ExcersizePhoto")
    fun clear()

    @Query("DELETE FROM ExcersizePhoto WHERE ExcersizeId=:exId")
    fun deleteByExersizeId(exId: Long)

    @Query("SELECT * FROM ExcersizePhoto")
    fun getAll(): List<ExcersizePhoto>

    @Query("SELECT *FROM ExcersizePhoto WHERE ExcersizeId=:excersizeId")
    fun getByExcersizeId(excersizeId: Long): List<ExcersizePhoto>
}