package com.example.gymhelper.fragments;

import java.lang.System;

/**
 * A simple [Fragment] subclass.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/gymhelper/fragments/ExcersizesListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/gymhelper/databinding/FragmentExcersizesListBinding;", "excersizes", "", "Lcom/example/gymhelper/db/Excersize;", "trainingDayId", "", "viewModel", "Lcom/example/gymhelper/viewmodel/ExcersizesListViewModel;", "initBinding", "", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "initObservables", "application", "Landroid/app/Application;", "initViewModel", "onCreateView", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "app_debug"})
public final class ExcersizesListFragment extends androidx.fragment.app.Fragment {
    private com.example.gymhelper.databinding.FragmentExcersizesListBinding binding;
    private com.example.gymhelper.viewmodel.ExcersizesListViewModel viewModel;
    private java.util.List<com.example.gymhelper.db.Excersize> excersizes;
    private long trainingDayId = 0L;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void initObservables(android.app.Application application) {
    }
    
    private final void initBinding(android.view.LayoutInflater inflater, android.view.ViewGroup container) {
    }
    
    private final void initViewModel(android.app.Application application) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    public ExcersizesListFragment() {
        super();
    }
}