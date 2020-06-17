package com.example.gymhelper.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/example/gymhelper/adapters/ExcersizeVariantsListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/gymhelper/db/Excersize;", "Lcom/example/gymhelper/adapters/ExcersizeVariantsListAdapter$ViewHolder;", "exVariantClickListener", "Lcom/example/gymhelper/adapters/ExcersizeVariantClickListener;", "(Lcom/example/gymhelper/adapters/ExcersizeVariantClickListener;)V", "getExVariantClickListener", "()Lcom/example/gymhelper/adapters/ExcersizeVariantClickListener;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ExcersizeVariantsListAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.gymhelper.db.Excersize, com.example.gymhelper.adapters.ExcersizeVariantsListAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.gymhelper.adapters.ExcersizeVariantClickListener exVariantClickListener = null;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.gymhelper.adapters.ExcersizeVariantsListAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.gymhelper.adapters.ExcersizeVariantsListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.gymhelper.adapters.ExcersizeVariantClickListener getExVariantClickListener() {
        return null;
    }
    
    public ExcersizeVariantsListAdapter(@org.jetbrains.annotations.NotNull()
    com.example.gymhelper.adapters.ExcersizeVariantClickListener exVariantClickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/gymhelper/adapters/ExcersizeVariantsListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/gymhelper/databinding/ExcersizeVariantsListItemBinding;", "(Lcom/example/gymhelper/databinding/ExcersizeVariantsListItemBinding;)V", "bind", "", "exVariantClickListener", "Lcom/example/gymhelper/adapters/ExcersizeVariantClickListener;", "item", "Lcom/example/gymhelper/db/Excersize;", "Companion", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.example.gymhelper.databinding.ExcersizeVariantsListItemBinding binding;
        public static final com.example.gymhelper.adapters.ExcersizeVariantsListAdapter.ViewHolder.Companion Companion = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.gymhelper.adapters.ExcersizeVariantClickListener exVariantClickListener, @org.jetbrains.annotations.NotNull()
        com.example.gymhelper.db.Excersize item) {
        }
        
        private ViewHolder(com.example.gymhelper.databinding.ExcersizeVariantsListItemBinding binding) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/gymhelper/adapters/ExcersizeVariantsListAdapter$ViewHolder$Companion;", "", "()V", "from", "Lcom/example/gymhelper/adapters/ExcersizeVariantsListAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.gymhelper.adapters.ExcersizeVariantsListAdapter.ViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}