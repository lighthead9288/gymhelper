package com.example.gymhelper.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TrainingProgramsExcercizesDao {

    @Insert
    fun insert(trainingProgramsExcersizes: TrainingProgramsExcersizes)

    @Delete
    fun delete(trainingProgramsExcersizes: TrainingProgramsExcersizes)

    @Query("DELETE FROM TrainingProgramsExcercizes")
    fun clear()

    @Query("DELETE FROM TrainingProgramsExcercizes WHERE ExcersizeId=:exId AND DayId=:trainingDayId")
    fun deleteExersizeFromTrainingDay(exId: Long, trainingDayId: Long): Int

    @Query("DELETE FROM TrainingProgramsExcercizes WHERE DayId=:trainingDayId")
    fun deleteByTrainingDayId(trainingDayId: Long): Int

    @Query("SELECT *FROM TrainingProgramsExcercizes WHERE DayId=:trainingDayId")
    fun getById(trainingDayId: Long?): List<TrainingProgramsExcersizes>

    @Query("SELECT *FROM TrainingProgramsExcercizes WHERE DayId=:trainingDayId")
    fun getDayExcersizesById(trainingDayId: Long): List<TrainingProgramsExcersizes>

    @Query("SELECT *FROM TrainingProgramsExcercizes WHERE DayId=:trainingDayId AND ExcersizeId=:excersizeId")
    fun getDayExcersizeById(trainingDayId: Long, excersizeId: Long): TrainingProgramsExcersizes

    @Query("SELECT *FROM TrainingProgramsExcercizes")
    fun getAll(): List<TrainingProgramsExcersizes>
}