package com.example.gymhelper.db

import androidx.room.*

@Dao
interface TrainingProfilesExcersizesDao {

    @Insert
    fun insert(trainingProfileExcersize: TrainingProfileExcersize): Long?

    @Update
    fun update(trainingProfileExcersize: TrainingProfileExcersize)

    @Delete
    fun delete(trainingProfileExcersize: TrainingProfileExcersize)

    @Query("SELECT *FROM TrainingProfilesExcersizes WHERE TrainingProfileId=:trainingProfileId")
    fun getTrainingProfileExcersizes(trainingProfileId: Long): List<TrainingProfileExcersize>

    @Query("SELECT *FROM TrainingProfilesExcersizes WHERE TrainingProfileId=:trainingProfileId AND ExcersizeId=:excersizeId")
    fun getTrainingProfileExcersize(trainingProfileId: Long, excersizeId: Long): TrainingProfileExcersize

    @Query("DELETE FROM TrainingProfilesExcersizes WHERE TrainingProfileId=:trainingProfileId")
    fun deleteByTrainingProfileId(trainingProfileId: Long): Int
}