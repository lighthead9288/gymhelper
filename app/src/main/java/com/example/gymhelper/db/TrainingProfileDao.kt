package com.example.gymhelper.db

import androidx.room.*

@Dao
interface TrainingProfileDao {

    @Insert
    fun insert(trainingProfile: TrainingProfile): Long?

    @Update
    fun update(trainingProfile: TrainingProfile)

    @Delete
    fun delete(trainingProfile: TrainingProfile): Int

    @Query("DELETE FROM TrainingProfiles")
    fun clear():Unit

    @Query("SELECT *FROM TrainingProfiles WHERE TrainingProfileId=:id")
    fun get(id: Long): TrainingProfile

    @Query("SELECT *FROM TrainingProfiles")
    fun getAll(): List<TrainingProfile>
}