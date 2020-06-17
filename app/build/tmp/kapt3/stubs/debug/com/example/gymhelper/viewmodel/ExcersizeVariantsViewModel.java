package com.example.gymhelper.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001cH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0003H\u0002J\u0011\u0010\u001f\u001a\u00020\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0006\u0010\u0011\u001a\u00020 J\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\u0006\u0010\"\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lcom/example/gymhelper/viewmodel/ExcersizeVariantsViewModel;", "Landroidx/lifecycle/ViewModel;", "excersizeId", "", "db", "Lcom/example/gymhelper/db/ExcersizeDatabase;", "application", "Landroid/app/Application;", "(JLcom/example/gymhelper/db/ExcersizeDatabase;Landroid/app/Application;)V", "_excersizeVariants", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/gymhelper/db/Excersize;", "getExcersizeId", "()J", "excersizeVariants", "Landroidx/lifecycle/LiveData;", "getExcersizeVariants", "()Landroidx/lifecycle/LiveData;", "sharedPrefs", "Lcom/example/gymhelper/SharedPrefs;", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelJob", "Lkotlinx/coroutines/Job;", "getViewModelJob", "()Lkotlinx/coroutines/Job;", "getAllExsFromDb", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurProfileId", "getExcersizeByIdFromDB", "", "getExcersizesByProfileId", "curProfileId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ExcersizeVariantsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.Job viewModelJob = null;
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.gymhelper.db.Excersize>> _excersizeVariants;
    private com.example.gymhelper.SharedPrefs sharedPrefs;
    private final long excersizeId = 0L;
    private final com.example.gymhelper.db.ExcersizeDatabase db = null;
    private final android.app.Application application = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getViewModelJob() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.gymhelper.db.Excersize>> getExcersizeVariants() {
        return null;
    }
    
    public final void getExcersizeVariants() {
    }
    
    private final long getCurProfileId() {
        return 0L;
    }
    
    public final long getExcersizeId() {
        return 0L;
    }
    
    public ExcersizeVariantsViewModel(long excersizeId, @org.jetbrains.annotations.NotNull()
    com.example.gymhelper.db.ExcersizeDatabase db, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}