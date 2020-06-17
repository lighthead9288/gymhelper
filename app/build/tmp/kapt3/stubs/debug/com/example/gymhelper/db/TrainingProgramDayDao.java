package com.example.gymhelper.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u0017\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\'\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\b\u001a\u00020\tH\'J\u0017\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/example/gymhelper/db/TrainingProgramDayDao;", "", "delete", "", "day", "Lcom/example/gymhelper/db/TrainingProgramDay;", "deleteByTrainingProgramId", "", "trainingProgramId", "", "getTrainingProgramDayById", "trainingProgramDayId", "(Ljava/lang/Long;)Lcom/example/gymhelper/db/TrainingProgramDay;", "getTrainingProgramDays", "", "insert", "(Lcom/example/gymhelper/db/TrainingProgramDay;)Ljava/lang/Long;", "update", "app_debug"})
public abstract interface TrainingProgramDayDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Long insert(@org.jetbrains.annotations.NotNull()
    com.example.gymhelper.db.TrainingProgramDay day);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.example.gymhelper.db.TrainingProgramDay day);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.example.gymhelper.db.TrainingProgramDay day);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT *FROM TrainingProgramDays WHERE trainingProgramId=:trainingProgramId")
    public abstract java.util.List<com.example.gymhelper.db.TrainingProgramDay> getTrainingProgramDays(long trainingProgramId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT *FROM TrainingProgramDays WHERE TrainingProgramDayId=:trainingProgramDayId")
    public abstract com.example.gymhelper.db.TrainingProgramDay getTrainingProgramDayById(@org.jetbrains.annotations.Nullable()
    java.lang.Long trainingProgramDayId);
    
    @androidx.room.Query(value = "DELETE FROM TrainingProgramDays WHERE trainingProgramId=:trainingProgramId")
    public abstract int deleteByTrainingProgramId(long trainingProgramId);
}