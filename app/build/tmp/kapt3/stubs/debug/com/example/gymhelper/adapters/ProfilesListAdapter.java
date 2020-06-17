package com.example.gymhelper.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/example/gymhelper/adapters/ProfilesListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/gymhelper/model/TrainingProfileWithDetails;", "Lcom/example/gymhelper/adapters/ProfilesListAdapter$ViewHolder;", "profListClickListener", "Lcom/example/gymhelper/adapters/ProfileListClickListener;", "deleteProfileClickListener", "Lcom/example/gymhelper/adapters/DeleteProfileClickListener;", "(Lcom/example/gymhelper/adapters/ProfileListClickListener;Lcom/example/gymhelper/adapters/DeleteProfileClickListener;)V", "getDeleteProfileClickListener", "()Lcom/example/gymhelper/adapters/DeleteProfileClickListener;", "getProfListClickListener", "()Lcom/example/gymhelper/adapters/ProfileListClickListener;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ProfilesListAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.gymhelper.model.TrainingProfileWithDetails, com.example.gymhelper.adapters.ProfilesListAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.gymhelper.adapters.ProfileListClickListener profListClickListener = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.gymhelper.adapters.DeleteProfileClickListener deleteProfileClickListener = null;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.gymhelper.adapters.ProfilesListAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.gymhelper.adapters.ProfilesListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.gymhelper.adapters.ProfileListClickListener getProfListClickListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.gymhelper.adapters.DeleteProfileClickListener getDeleteProfileClickListener() {
        return null;
    }
    
    public ProfilesListAdapter(@org.jetbrains.annotations.NotNull()
    com.example.gymhelper.adapters.ProfileListClickListener profListClickListener, @org.jetbrains.annotations.NotNull()
    com.example.gymhelper.adapters.DeleteProfileClickListener deleteProfileClickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/gymhelper/adapters/ProfilesListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/gymhelper/databinding/ProfilesListItemBinding;", "(Lcom/example/gymhelper/databinding/ProfilesListItemBinding;)V", "bind", "", "profListClickListener", "Lcom/example/gymhelper/adapters/ProfileListClickListener;", "deleteProfileClickListener", "Lcom/example/gymhelper/adapters/DeleteProfileClickListener;", "item", "Lcom/example/gymhelper/model/TrainingProfileWithDetails;", "Companion", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.example.gymhelper.databinding.ProfilesListItemBinding binding;
        public static final com.example.gymhelper.adapters.ProfilesListAdapter.ViewHolder.Companion Companion = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.gymhelper.adapters.ProfileListClickListener profListClickListener, @org.jetbrains.annotations.NotNull()
        com.example.gymhelper.adapters.DeleteProfileClickListener deleteProfileClickListener, @org.jetbrains.annotations.NotNull()
        com.example.gymhelper.model.TrainingProfileWithDetails item) {
        }
        
        private ViewHolder(com.example.gymhelper.databinding.ProfilesListItemBinding binding) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/gymhelper/adapters/ProfilesListAdapter$ViewHolder$Companion;", "", "()V", "from", "Lcom/example/gymhelper/adapters/ProfilesListAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.gymhelper.adapters.ProfilesListAdapter.ViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}