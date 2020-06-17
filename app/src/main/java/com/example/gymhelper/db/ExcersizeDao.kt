package com.example.gymhelper.db

import androidx.room.*

@Dao
interface ExcersizeDao {

    @Insert
    fun insert(excersize: Excersize):Long?

    @Update
    fun update(excersize: Excersize)

    @Delete
    fun delete(excersize: Excersize): Int

    @Query("DELETE FROM Excersizes")
    fun clear(): Unit

    @Query("SELECT * FROM Excersizes WHERE ExcersizeId=:id")
    fun get(id: Long?): Excersize

    @Query("SELECT * FROM Excersizes")
    fun getAll(): List<Excersize>
}