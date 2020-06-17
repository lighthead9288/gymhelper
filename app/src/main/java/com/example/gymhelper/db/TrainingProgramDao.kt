package com.example.gymhelper.db

import androidx.room.*

@Dao
interface TrainingProgramDao {

    @Insert
    fun insert(trainingProgram: TrainingProgram): Long?

    @Update
    fun update(trainingProgram: TrainingProgram)

    @Delete
    fun delete(trainingProgram: TrainingProgram): Int

    @Query("DELETE FROM TrainingPrograms")
    fun clear():Unit

    @Query("SELECT *FROM TrainingPrograms WHERE TrainingProgramId=:id")
    fun get(id: Long): TrainingProgram

    @Query("SELECT *FROM TrainingPrograms")
    fun getAll(): List<TrainingProgram>
}