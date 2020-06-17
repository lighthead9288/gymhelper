package com.example.gymhelper.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J!\u0010%\u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0006\u0010(\u001a\u00020!J\u0011\u0010)\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u0011\u0010+\u001a\u00020\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u0006\u0010,\u001a\u00020!J\u0016\u0010-\u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003J\u0016\u0010.\u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006/"}, d2 = {"Lcom/example/gymhelper/viewmodel/ExcersizesListViewModel;", "Landroidx/lifecycle/ViewModel;", "trainingDayId", "", "excersizes", "", "Lcom/example/gymhelper/db/Excersize;", "db", "Lcom/example/gymhelper/db/ExcersizeDatabase;", "application", "Landroid/app/Application;", "(JLjava/util/List;Lcom/example/gymhelper/db/ExcersizeDatabase;Landroid/app/Application;)V", "_dayName", "Landroidx/lifecycle/MutableLiveData;", "", "get_dayName", "()Landroidx/lifecycle/MutableLiveData;", "_excersizesByGroups", "Lcom/example/gymhelper/model/ExcersizesByGroups;", "get_excersizesByGroups", "set_excersizesByGroups", "(Landroidx/lifecycle/MutableLiveData;)V", "dayName", "Landroidx/lifecycle/LiveData;", "getDayName", "()Landroidx/lifecycle/LiveData;", "excersizesByGroups", "getExcersizesByGroups", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelJob", "Lkotlinx/coroutines/Job;", "addExcersizeToTrainingProgram", "", "trainingProgramExcersize", "Lcom/example/gymhelper/db/TrainingProgramsExcersizes;", "(Lcom/example/gymhelper/db/TrainingProgramsExcersizes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteExcersizeFromTrainingProgram", "excersizeId", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllExcersizes", "getAllExcersizesFromDb", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurTrainingDay", "getTrainingDay", "onExcersizeChecked", "onExcersizeUnchecked", "app_debug"})
public final class ExcersizesListViewModel extends androidx.lifecycle.ViewModel {
    private kotlinx.coroutines.Job viewModelJob;
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.gymhelper.model.ExcersizesByGroups> _excersizesByGroups;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _dayName = null;
    private final long trainingDayId = 0L;
    private final java.util.List<com.example.gymhelper.db.Excersize> excersizes = null;
    private final com.example.gymhelper.db.ExcersizeDatabase db = null;
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
    java.util.List<com.example.gymhelper.db.Excersize> excersizes, @org.jetbrains.annotations.NotNull()
    com.example.gymhelper.db.ExcersizeDatabase db, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}