package com.example.gymhelper.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\b\u001a\u00020\tH\'J\u0017\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0011"}, d2 = {"Lcom/example/gymhelper/db/TrainingProfilesExcersizesDao;", "", "delete", "", "trainingProfileExcersize", "Lcom/example/gymhelper/db/TrainingProfileExcersize;", "deleteByTrainingProfileId", "", "trainingProfileId", "", "getTrainingProfileExcersize", "excersizeId", "getTrainingProfileExcersizes", "", "insert", "(Lcom/example/gymhelper/db/TrainingProfileExcersize;)Ljava/lang/Long;", "update", "app_debug"})
public abstract interface TrainingProfilesExcersizesDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Long insert(@org.jetbrains.annotations.NotNull()
    com.example.gymhelper.db.TrainingProfileExcersize trainingProfileExcersize);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.example.gymhelper.db.TrainingProfileExcersize trainingProfileExcersize);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.example.gymhelper.db.TrainingProfileExcersize trainingProfileExcersize);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT *FROM TrainingProfilesExcersizes WHERE TrainingProfileId=:trainingProfileId")
    public abstract java.util.List<com.example.gymhelper.db.TrainingProfileExcersize> getTrainingProfileExcersizes(long trainingProfileId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT *FROM TrainingProfilesExcersizes WHERE TrainingProfileId=:trainingProfileId AND ExcersizeId=:excersizeId")
    public abstract com.example.gymhelper.db.TrainingProfileExcersize getTrainingProfileExcersize(long trainingProfileId, long excersizeId);
    
    @androidx.room.Query(value = "DELETE FROM TrainingProfilesExcersizes WHERE TrainingProfileId=:trainingProfileId")
    public abstract int deleteByTrainingProfileId(long trainingProfileId);
}