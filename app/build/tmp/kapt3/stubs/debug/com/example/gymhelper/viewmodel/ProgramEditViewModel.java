package com.example.gymhelper.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!J\u001b\u0010\"\u001a\u0004\u0018\u00010\u00032\u0006\u0010#\u001a\u00020$H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u0006\u0010&\u001a\u00020\u001fJ\u0006\u0010\'\u001a\u00020\u001fJ\u000e\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u0003J\u0019\u0010*\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\u0006\u0010\u0013\u001a\u00020\u001fJ\u0011\u0010,\u001a\u00020\u000bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006."}, d2 = {"Lcom/example/gymhelper/viewmodel/ProgramEditViewModel;", "Landroidx/lifecycle/ViewModel;", "trainingProgramId", "", "db", "Lcom/example/gymhelper/db/ExcersizeDatabase;", "application", "Landroid/app/Application;", "(JLcom/example/gymhelper/db/ExcersizeDatabase;Landroid/app/Application;)V", "_curTrainingProgram", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/gymhelper/model/ProgramByDays;", "_isCurTrainingProgramSelected", "", "_newTrainingDay", "getApplication", "()Landroid/app/Application;", "curTrainingProgram", "Landroidx/lifecycle/LiveData;", "getCurTrainingProgram", "()Landroidx/lifecycle/LiveData;", "isCurTrainingProgramSelected", "newTrainingDay", "getNewTrainingDay", "sharedPrefs", "Lcom/example/gymhelper/SharedPrefs;", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelJob", "Lkotlinx/coroutines/Job;", "addNewTrainingDay", "", "dayName", "", "addNewTrainingDayToDb", "trainingProgramDay", "Lcom/example/gymhelper/db/TrainingProgramDay;", "(Lcom/example/gymhelper/db/TrainingProgramDay;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "assignCurTrainingProgram", "checkCurTrainingProgramSelection", "deleteTrainingDay", "trainingDayId", "deleteTrainingDayFromDb", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurTrainingProgramFromDb", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ProgramEditViewModel extends androidx.lifecycle.ViewModel {
    private kotlinx.coroutines.Job viewModelJob;
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    private com.example.gymhelper.SharedPrefs sharedPrefs;
    private final androidx.lifecycle.MutableLiveData<com.example.gymhelper.model.ProgramByDays> _curTrainingProgram = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> _newTrainingDay = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isCurTrainingProgramSelected = null;
    private final long trainingProgramId = 0L;
    private final com.example.gymhelper.db.ExcersizeDatabase db = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application application = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.gymhelper.model.ProgramByDays> getCurTrainingProgram() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getNewTrainingDay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isCurTrainingProgramSelected() {
        return null;
    }
    
    public final void checkCurTrainingProgramSelection() {
    }
    
    public final void assignCurTrainingProgram() {
    }
    
    public final void deleteTrainingDay(long trainingDayId) {
    }
    
    public final void addNewTrainingDay(long trainingProgramId, @org.jetbrains.annotations.NotNull()
    java.lang.String dayName) {
    }
    
    public final void getCurTrainingProgram() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApplication() {
        return null;
    }
    
    public ProgramEditViewModel(long trainingProgramId, @org.jetbrains.annotations.NotNull()
    com.example.gymhelper.db.ExcersizeDatabase db, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}