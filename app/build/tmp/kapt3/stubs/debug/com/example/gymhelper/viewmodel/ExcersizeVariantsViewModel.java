package com.example.gymhelper.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0019H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0003H\u0002J\u0011\u0010\u001c\u001a\u00020\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0006\u0010\u0010\u001a\u00020\u001dJ\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010\u001f\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/example/gymhelper/viewmodel/ExcersizeVariantsViewModel;", "Landroidx/lifecycle/ViewModel;", "excersizeId", "", "application", "Landroid/app/Application;", "(Ljava/lang/Long;Landroid/app/Application;)V", "_excersizeVariants", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/gymhelper/db/Excersize;", "db", "Lcom/example/gymhelper/db/ExcersizeDatabase;", "Ljava/lang/Long;", "excersizeVariants", "Landroidx/lifecycle/LiveData;", "getExcersizeVariants", "()Landroidx/lifecycle/LiveData;", "sharedPrefs", "Lcom/example/gymhelper/utils/SharedPrefs;", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "getAllExsFromDb", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurProfileId", "getExcersizeByIdFromDB", "", "getExcersizesByProfileId", "curProfileId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ExcersizeVariantsViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.gymhelper.db.ExcersizeDatabase db = null;
    private final kotlinx.coroutines.CompletableJob viewModelJob = null;
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    private com.example.gymhelper.utils.SharedPrefs sharedPrefs;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.gymhelper.db.Excersize>> _excersizeVariants;
    private final java.lang.Long excersizeId = null;
    private final android.app.Application application = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.gymhelper.db.Excersize>> getExcersizeVariants() {
        return null;
    }
    
    public final void getExcersizeVariants() {
    }
    
    private final long getCurProfileId() {
        return 0L;
    }
    
    public ExcersizeVariantsViewModel(@org.jetbrains.annotations.Nullable()
    java.lang.Long excersizeId, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}