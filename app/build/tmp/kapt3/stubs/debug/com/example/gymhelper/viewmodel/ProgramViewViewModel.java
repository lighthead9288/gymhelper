package com.example.gymhelper.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0018R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/example/gymhelper/viewmodel/ProgramViewViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_curTrainingProgram", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/gymhelper/model/ProgramByDays;", "getApplication", "()Landroid/app/Application;", "curTrainingProgram", "Landroidx/lifecycle/LiveData;", "getCurTrainingProgram", "()Landroidx/lifecycle/LiveData;", "db", "Lcom/example/gymhelper/db/ExcersizeDatabase;", "sharedPrefs", "Lcom/example/gymhelper/utils/SharedPrefs;", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "getCurTrainingProgramFromDb", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentTrainingProgram", "", "getCurrentTrainingProgramId", "app_debug"})
public final class ProgramViewViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.gymhelper.db.ExcersizeDatabase db = null;
    private kotlinx.coroutines.CompletableJob viewModelJob;
    private kotlinx.coroutines.CoroutineScope uiScope;
    private com.example.gymhelper.utils.SharedPrefs sharedPrefs;
    private final androidx.lifecycle.MutableLiveData<com.example.gymhelper.model.ProgramByDays> _curTrainingProgram = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application application = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.gymhelper.model.ProgramByDays> getCurTrainingProgram() {
        return null;
    }
    
    public final void getCurrentTrainingProgram() {
    }
    
    public final long getCurrentTrainingProgramId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApplication() {
        return null;
    }
    
    public ProgramViewViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}