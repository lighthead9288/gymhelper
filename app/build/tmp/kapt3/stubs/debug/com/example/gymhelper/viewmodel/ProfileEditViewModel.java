package com.example.gymhelper.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0006\u0010%\u001a\u00020!J\u0006\u0010&\u001a\u00020!J!\u0010\'\u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u0006\u0010*\u001a\u00020!J\u0011\u0010+\u001a\u00020\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,J\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,J\u0016\u0010.\u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0003J\u0016\u0010/\u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0003R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00060"}, d2 = {"Lcom/example/gymhelper/viewmodel/ProfileEditViewModel;", "Landroidx/lifecycle/ViewModel;", "trainingProfileId", "", "application", "Landroid/app/Application;", "(JLandroid/app/Application;)V", "_curTrainingProfile", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/gymhelper/db/Excersize;", "_excersizesByGroups", "Lcom/example/gymhelper/model/ExcersizesByGroups;", "_isCurTrainingProfileSelected", "", "getApplication", "()Landroid/app/Application;", "curTrainingProfile", "Landroidx/lifecycle/LiveData;", "getCurTrainingProfile", "()Landroidx/lifecycle/LiveData;", "db", "Lcom/example/gymhelper/db/ExcersizeDatabase;", "excersizesByGroups", "getExcersizesByGroups", "isCurTrainingProfileSelected", "sharedPrefs", "Lcom/example/gymhelper/utils/SharedPrefs;", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "addExcersizeToTrainingProfile", "", "trainingProfileExcersize", "Lcom/example/gymhelper/db/TrainingProfileExcersize;", "(Lcom/example/gymhelper/db/TrainingProfileExcersize;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "assignCurTrainingProfile", "checkCurTrainingProfileSelection", "deleteExcersizeFromTrainingProfile", "excersizeId", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllExcersizes", "getAllExcersizesFromDb", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurProfileExcersizesFromDb", "onExcersizeChecked", "onExcersizeUnchecked", "app_debug"})
public final class ProfileEditViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.gymhelper.db.ExcersizeDatabase db = null;
    private kotlinx.coroutines.CompletableJob viewModelJob;
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    private com.example.gymhelper.utils.SharedPrefs sharedPrefs;
    private final androidx.lifecycle.MutableLiveData<com.example.gymhelper.model.ExcersizesByGroups> _excersizesByGroups = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isCurTrainingProfileSelected = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.gymhelper.db.Excersize>> _curTrainingProfile = null;
    private final long trainingProfileId = 0L;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application application = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.gymhelper.model.ExcersizesByGroups> getExcersizesByGroups() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isCurTrainingProfileSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.gymhelper.db.Excersize>> getCurTrainingProfile() {
        return null;
    }
    
    public final void checkCurTrainingProfileSelection() {
    }
    
    public final void assignCurTrainingProfile() {
    }
    
    public final void onExcersizeChecked(long trainingProfileId, long excersizeId) {
    }
    
    public final void onExcersizeUnchecked(long trainingProfileId, long excersizeId) {
    }
    
    public final void getAllExcersizes() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApplication() {
        return null;
    }
    
    public ProfileEditViewModel(long trainingProfileId, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}