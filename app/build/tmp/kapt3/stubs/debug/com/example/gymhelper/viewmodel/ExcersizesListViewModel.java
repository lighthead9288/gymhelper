package com.example.gymhelper.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J!\u0010\"\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0006\u0010%\u001a\u00020\u001eJ\u0011\u0010&\u001a\u00020\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0011\u0010(\u001a\u00020\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0006\u0010)\u001a\u00020\u001eJ\u0016\u0010*\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003J\u0016\u0010+\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006,"}, d2 = {"Lcom/example/gymhelper/viewmodel/ExcersizesListViewModel;", "Landroidx/lifecycle/ViewModel;", "trainingDayId", "", "application", "Landroid/app/Application;", "(JLandroid/app/Application;)V", "_dayName", "Landroidx/lifecycle/MutableLiveData;", "", "get_dayName", "()Landroidx/lifecycle/MutableLiveData;", "_excersizesByGroups", "Lcom/example/gymhelper/model/ExcersizesByGroups;", "get_excersizesByGroups", "set_excersizesByGroups", "(Landroidx/lifecycle/MutableLiveData;)V", "dayName", "Landroidx/lifecycle/LiveData;", "getDayName", "()Landroidx/lifecycle/LiveData;", "db", "Lcom/example/gymhelper/db/ExcersizeDatabase;", "excersizesByGroups", "getExcersizesByGroups", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "addExcersizeToTrainingProgram", "", "trainingProgramExcersize", "Lcom/example/gymhelper/db/TrainingProgramsExcersizes;", "(Lcom/example/gymhelper/db/TrainingProgramsExcersizes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteExcersizeFromTrainingProgram", "excersizeId", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllExcersizes", "getAllExcersizesFromDb", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurTrainingDay", "getTrainingDay", "onExcersizeChecked", "onExcersizeUnchecked", "app_debug"})
public final class ExcersizesListViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.gymhelper.db.ExcersizeDatabase db = null;
    private kotlinx.coroutines.CompletableJob viewModelJob;
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.gymhelper.model.ExcersizesByGroups> _excersizesByGroups;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _dayName = null;
    private final long trainingDayId = 0L;
    private final android.app.Application application = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.gymhelper.model.ExcersizesByGroups> getExcersizesByGroups() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.gymhelper.model.ExcersizesByGroups> get_excersizesByGroups() {
        return null;
    }
    
    public final void set_excersizesByGroups(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.gymhelper.model.ExcersizesByGroups> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> get_dayName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getDayName() {
        return null;
    }
    
    public final void getAllExcersizes() {
    }
    
    public final void getTrainingDay() {
    }
    
    public final void onExcersizeChecked(long trainingDayId, long excersizeId) {
    }
    
    public final void onExcersizeUnchecked(long trainingDayId, long excersizeId) {
    }
    
    public ExcersizesListViewModel(long trainingDayId, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}