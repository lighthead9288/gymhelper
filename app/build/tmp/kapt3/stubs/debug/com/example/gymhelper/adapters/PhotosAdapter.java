package com.example.gymhelper.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/example/gymhelper/adapters/PhotosAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "", "Lcom/example/gymhelper/adapters/PhotosAdapter$PhotoViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffCallback", "PhotoViewHolder", "app_debug"})
public final class PhotosAdapter extends androidx.recyclerview.widget.ListAdapter<java.lang.String, com.example.gymhelper.adapters.PhotosAdapter.PhotoViewHolder> {
    public static final com.example.gymhelper.adapters.PhotosAdapter.DiffCallback DiffCallback = null;
    
    /**
     * Create new [RecyclerView] item views (invoked by the layout manager)
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.gymhelper.adapters.PhotosAdapter.PhotoViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    /**
     * Replaces the contents of a view (invoked by the layout manager)
     */
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.gymhelper.adapters.PhotosAdapter.PhotoViewHolder holder, int position) {
    }
    
    public PhotosAdapter() {
        super(null);
    }
    
    /**
     * The MarsPropertyViewHolder constructor takes the binding variable from the associated
     * GridViewItem, which nicely gives it access to the full [MarsProperty] information.
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/gymhelper/adapters/PhotosAdapter$PhotoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/gymhelper/databinding/PhotoItemBinding;", "(Lcom/example/gymhelper/databinding/PhotoItemBinding;)V", "bind", "", "path", "", "app_debug"})
    public static final class PhotoViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.example.gymhelper.databinding.PhotoItemBinding binding;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        java.lang.String path) {
        }
        
        public PhotoViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.gymhelper.databinding.PhotoItemBinding binding) {
            super(null);
        }
    }
    
    /**
     * Allows the RecyclerView to determine which items have changed when the [List] of [MarsProperty]
     * has been updated.
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/gymhelper/adapters/PhotosAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<java.lang.String> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        java.lang.String oldItem, @org.jetbrains.annotations.NotNull()
        java.lang.String newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        java.lang.String oldItem, @org.jetbrains.annotations.NotNull()
        java.lang.String newItem) {
            return false;
        }
        
        private DiffCallback() {
            super();
        }
    }
}