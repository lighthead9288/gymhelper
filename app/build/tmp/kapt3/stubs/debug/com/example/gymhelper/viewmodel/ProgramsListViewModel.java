package com.example.gymhelper.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0019\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bJ\u0019\u0010\"\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0006\u0010#\u001a\u00020\u0016J\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lcom/example/gymhelper/viewmodel/ProgramsListViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_trainingProgramsList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/gymhelper/model/TrainingProgramWithDetails;", "db", "Lcom/example/gymhelper/db/ExcersizeDatabase;", "sharedPrefs", "Lcom/example/gymhelper/utils/SharedPrefs;", "trainingProgramsList", "Landroidx/lifecycle/LiveData;", "getTrainingProgramsList", "()Landroidx/lifecycle/LiveData;", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "addNewTrainingProgram", "", "name", "", "addNewTrainingProgramToDb", "trainingProgram", "Lcom/example/gymhelper/db/TrainingProgram;", "(Lcom/example/gymhelper/db/TrainingProgram;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkCurTrainingProgramSelection", "", "trainingProgramId", "", "deleteTrainingProgram", "deleteTrainingProgramFromDb", "getTrainingPrograms", "getTrainingProgramsFromDb", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ProgramsListViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.gymhelper.db.ExcersizeDatabase db = null;
    private kotlinx.coroutines.CompletableJob viewModelJob;
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    private com.example.gymhelper.utils.SharedPrefs sharedPrefs;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.gymhelper.model.TrainingProgramWithDetails>> _trainingProgramsList;
    private final android.app.Application application = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.gymhelper.model.TrainingProgramWithDetails>> getTrainingProgramsList() {
        return null;
    }
    
    public final boolean checkCurTrainingProgramSelection(long trainingProgramId) {
        return false;
    }
    
    public final void deleteTrainingProgram(@org.jetbrains.annotations.NotNull()
    com.example.gymhelper.db.TrainingProgram trainingProgram) {
    }
    
    public final void addNewTrainingProgram(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final void getTrainingPrograms() {
    }
    
    public ProgramsListViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}