package com.example.gymhelper.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/example/gymhelper/utils/SharedPrefs;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "PREFS_FILENAME", "", "getPREFS_FILENAME", "()Ljava/lang/String;", "value", "", "curProfileProgramId", "getCurProfileProgramId", "()J", "setCurProfileProgramId", "(J)V", "curTrainingProgramId", "getCurTrainingProgramId", "setCurTrainingProgramId", "prefs", "Landroid/content/SharedPreferences;", "getPrefs", "()Landroid/content/SharedPreferences;", "app_debug"})
public final class SharedPrefs {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String PREFS_FILENAME = "com.example.gymhelper.curDataPrefs";
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences prefs = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPREFS_FILENAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getPrefs() {
        return null;
    }
    
    public final long getCurTrainingProgramId() {
        return 0L;
    }
    
    public final void setCurTrainingProgramId(long value) {
    }
    
    public final long getCurProfileProgramId() {
        return 0L;
    }
    
    public final void setCurProfileProgramId(long value) {
    }
    
    public SharedPrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}