package com.example.gymhelper.db

import androidx.room.*

@Dao
interface PhotoDao {

    @Insert
    fun insert(photo: Photo): Long?

    @Update
    fun update(photo: Photo)

    @Delete
    fun delete(photo: Photo): Int

    @Query("DELETE FROM Photos")
    fun clear(): Unit

    @Query("SELECT * FROM Photos WHERE PhotoId=:id")
    fun get(id: Long?): Photo

    @Query("SELECT * FROM Photos")
    fun getAll(): List<Photo>

}