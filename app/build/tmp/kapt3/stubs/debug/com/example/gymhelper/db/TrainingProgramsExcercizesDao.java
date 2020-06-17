package com.example.gymhelper.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\'J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\'J\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\nH\'\u00a2\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\'J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0015"}, d2 = {"Lcom/example/gymhelper/db/TrainingProgramsExcercizesDao;", "", "clear", "", "delete", "trainingProgramsExcersizes", "Lcom/example/gymhelper/db/TrainingProgramsExcersizes;", "deleteByTrainingDayId", "", "trainingDayId", "", "deleteExersizeFromTrainingDay", "exId", "getAll", "", "getById", "(Ljava/lang/Long;)Ljava/util/List;", "getDayExcersizeById", "excersizeId", "getDayExcersizesById", "insert", "app_debug"})
public abstract interface TrainingProgramsExcercizesDao {
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.gymhelper.db.TrainingProgramsExcersizes trainingProgramsExcersizes);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.example.gymhelper.db.TrainingProgramsExcersizes trainingProgramsExcersizes);
    
    @androidx.room.Query(value = "DELETE FROM TrainingProgramsExcercizes")
    public abstract void clear();
    
    @androidx.room.Query(value = "DELETE FROM TrainingProgramsExcercizes WHERE ExcersizeId=:exId AND DayId=:trainingDayId")
    public abstract int deleteExersizeFromTrainingDay(long exId, long trainingDayId);
    
    @androidx.room.Query(value = "DELETE FROM TrainingProgramsExcercizes WHERE DayId=:trainingDayId")
    public abstract int deleteByTrainingDayId(long trainingDayId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT *FROM TrainingProgramsExcercizes WHERE DayId=:trainingDayId")
    public abstract java.util.List<com.example.gymhelper.db.TrainingProgramsExcersizes> getById(@org.jetbrains.annotations.Nullable()
    java.lang.Long trainingDayId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT *FROM TrainingProgramsExcercizes WHERE DayId=:trainingDayId")
    public abstract java.util.List<com.example.gymhelper.db.TrainingProgramsExcersizes> getDayExcersizesById(long trainingDayId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT *FROM TrainingProgramsExcercizes WHERE DayId=:trainingDayId AND ExcersizeId=:excersizeId")
    public abstract com.example.gymhelper.db.TrainingProgramsExcersizes getDayExcersizeById(long trainingDayId, long excersizeId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT *FROM TrainingProgramsExcercizes")
    public abstract java.util.List<com.example.gymhelper.db.TrainingProgramsExcersizes> getAll();
}