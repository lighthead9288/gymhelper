package com.example.gymhelper.db;

import java.lang.System;

@androidx.room.Entity(tableName = "TrainingProgramsExcercizes")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ0\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000e\u0010\b\u00a8\u0006\u001b"}, d2 = {"Lcom/example/gymhelper/db/TrainingProgramsExcersizes;", "", "Id", "", "excersizeId", "DayId", "(JLjava/lang/Long;Ljava/lang/Long;)V", "getDayId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "()J", "setId", "(J)V", "getExcersizeId", "component1", "component2", "component3", "copy", "(JLjava/lang/Long;Ljava/lang/Long;)Lcom/example/gymhelper/db/TrainingProgramsExcersizes;", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class TrainingProgramsExcersizes {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long Id;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "ExcersizeId")
    private final java.lang.Long excersizeId = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "DayId")
    private final java.lang.Long DayId = null;
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getExcersizeId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDayId() {
        return null;
    }
    
    public TrainingProgramsExcersizes(long Id, @org.jetbrains.annotations.Nullable()
    java.lang.Long excersizeId, @org.jetbrains.annotations.Nullable()
    java.lang.Long DayId) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.gymhelper.db.TrainingProgramsExcersizes copy(long Id, @org.jetbrains.annotations.Nullable()
    java.lang.Long excersizeId, @org.jetbrains.annotations.Nullable()
    java.lang.Long DayId) {
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