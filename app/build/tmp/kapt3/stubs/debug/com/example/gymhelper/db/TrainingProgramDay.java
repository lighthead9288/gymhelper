package com.example.gymhelper.db;

import java.lang.System;

@androidx.room.Entity(tableName = "TrainingProgramDays")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lcom/example/gymhelper/db/TrainingProgramDay;", "", "TrainingProgramDayId", "", "trainingProgramId", "DayName", "", "(JLjava/lang/Long;Ljava/lang/String;)V", "getDayName", "()Ljava/lang/String;", "getTrainingProgramDayId", "()J", "setTrainingProgramDayId", "(J)V", "getTrainingProgramId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(JLjava/lang/Long;Ljava/lang/String;)Lcom/example/gymhelper/db/TrainingProgramDay;", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class TrainingProgramDay {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long TrainingProgramDayId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "trainingProgramId")
    private final java.lang.Long trainingProgramId = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "dayName")
    private final java.lang.String DayName = null;
    
    public final long getTrainingProgramDayId() {
        return 0L;
    }
    
    public final void setTrainingProgramDayId(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getTrainingProgramId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDayName() {
        return null;
    }
    
    public TrainingProgramDay(long TrainingProgramDayId, @org.jetbrains.annotations.Nullable()
    java.lang.Long trainingProgramId, @org.jetbrains.annotations.NotNull()
    java.lang.String DayName) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.gymhelper.db.TrainingProgramDay copy(long TrainingProgramDayId, @org.jetbrains.annotations.Nullable()
    java.lang.Long trainingProgramId, @org.jetbrains.annotations.NotNull()
    java.lang.String DayName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}