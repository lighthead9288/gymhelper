package com.example.gymhelper.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0019\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eJ\u0019\u0010%\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0006\u0010&\u001a\u00020\u0019J\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006)"}, d2 = {"Lcom/example/gymhelper/viewmodel/ProfilesListViewModel;", "Landroidx/lifecycle/ViewModel;", "dataSource", "Lcom/example/gymhelper/db/ExcersizeDatabase;", "application", "Landroid/app/Application;", "(Lcom/example/gymhelper/db/ExcersizeDatabase;Landroid/app/Application;)V", "_trainingProfilesList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/gymhelper/model/TrainingProfileWithDetails;", "db", "getDb", "()Lcom/example/gymhelper/db/ExcersizeDatabase;", "sharedPrefs", "Lcom/example/gymhelper/SharedPrefs;", "trainingProfilesList", "Landroidx/lifecycle/LiveData;", "getTrainingProfilesList", "()Landroidx/lifecycle/LiveData;", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelJob", "Lkotlinx/coroutines/Job;", "addNewTrainingProfile", "", "name", "", "addNewTrainingProfileToDb", "trainingProfile", "Lcom/example/gymhelper/db/TrainingProfile;", "(Lcom/example/gymhelper/db/TrainingProfile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkCurTrainingProfileSelection", "", "trainingProfileId", "", "deleteTrainingProfile", "deleteTrainingProfileFromDb", "getTrainingProfiles", "getTrainingProfilesFromDb", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ProfilesListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.gymhelper.db.ExcersizeDatabase db = null;
    private kotlinx.coroutines.Job viewModelJob;
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    private com.example.gymhelper.SharedPrefs sharedPrefs;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.gymhelper.model.TrainingProfileWithDetails>> _trainingProfilesList;
    private final com.example.gymhelper.db.ExcersizeDatabase dataSource = null;
    private final android.app.Application application = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.gymhelper.db.ExcersizeDatabase getDb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.gymhelper.model.TrainingProfileWithDetails>> getTrainingProfilesList() {
        return null;
    }
    
    public final boolean checkCurTrainingProfileSelection(long trainingProfileId) {
        return false;
    }
    
    public final void deleteTrainingProfile(@org.jetbrains.annotations.NotNull()
    com.example.gymhelper.db.TrainingProfile trainingProfile) {
    }
    
    public final void addNewTrainingProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final void getTrainingProfiles() {
    }
    
    public ProfilesListViewModel(@org.jetbrains.annotations.NotNull()
    com.example.gymhelper.db.ExcersizeDatabase dataSource, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}