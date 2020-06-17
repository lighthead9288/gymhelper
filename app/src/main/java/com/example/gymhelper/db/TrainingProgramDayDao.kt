package com.example.gymhelper.db

import androidx.room.*

@Dao
interface TrainingProgramDayDao {

    @Insert
    fun insert(day: TrainingProgramDay): Long?

    @Update
    fun update(day: TrainingProgramDay)

    @Delete
    fun delete(day: TrainingProgramDay)

    @Query("SELECT *FROM TrainingProgramDays WHERE trainingProgramId=:trainingProgramId")
    fun getTrainingProgramDays(trainingProgramId: Long): List<TrainingProgramDay>

    @Query("SELECT *FROM TrainingProgramDays WHERE TrainingProgramDayId=:trainingProgramDayId")
    fun getTrainingProgramDayById(trainingProgramDayId: Long?): TrainingProgramDay

    @Query("DELETE FROM TrainingProgramDays WHERE trainingProgramId=:trainingProgramId")
    fun deleteByTrainingProgramId(trainingProgramId: Long): Int

}