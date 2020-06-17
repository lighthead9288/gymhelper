package com.example.gymhelper.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0081\u0001\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00126\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0010\u00a2\u0006\u0002\u0010\u0018J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\n2\u0006\u0010\'\u001a\u00020\nH\u0016J\u0018\u0010(\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\n2\u0006\u0010\'\u001a\u00020\nH\u0016J4\u0010)\u001a\u00020*2\u0006\u0010&\u001a\u00020\n2\u0006\u0010\'\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u00152\b\u0010,\u001a\u0004\u0018\u00010*2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0010\u0010/\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nH\u0016J\u0010\u00100\u001a\u00020%2\u0006\u0010&\u001a\u00020\nH\u0016J\b\u00101\u001a\u00020\nH\u0016J\u0010\u00102\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\nH\u0016J,\u00103\u001a\u00020*2\u0006\u0010&\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00152\b\u0010,\u001a\u0004\u0018\u00010*2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u00105\u001a\u00020\u0015H\u0016J\u0018\u00106\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\n2\u0006\u0010\'\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cRA\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001c\u00a8\u00067"}, d2 = {"Lcom/example/gymhelper/adapters/ExcersizesListExpandableListAdapter;", "Landroid/widget/BaseExpandableListAdapter;", "context", "Landroid/content/Context;", "groups", "", "", "groupedExcersizes", "Lcom/example/gymhelper/model/ExcersizeGroup;", "groupLayout", "", "excersizesLayout", "curDayExcersizes", "", "Lcom/example/gymhelper/db/Excersize;", "excersizeCheckingCallback", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "exId", "", "selected", "", "(Landroid/content/Context;Ljava/util/List;Ljava/util/List;IILjava/util/List;Lkotlin/jvm/functions/Function2;)V", "getContext", "()Landroid/content/Context;", "getCurDayExcersizes", "()Ljava/util/List;", "getExcersizeCheckingCallback", "()Lkotlin/jvm/functions/Function2;", "getExcersizesLayout", "()I", "getGroupLayout", "getGroupedExcersizes", "getGroups", "getChild", "", "groupPosition", "childPosition", "getChildId", "getChildView", "Landroid/view/View;", "isLastChild", "convertView", "parent", "Landroid/view/ViewGroup;", "getChildrenCount", "getGroup", "getGroupCount", "getGroupId", "getGroupView", "isExpanded", "hasStableIds", "isChildSelectable", "app_debug"})
public final class ExcersizesListExpandableListAdapter extends android.widget.BaseExpandableListAdapter {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> groups = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.gymhelper.model.ExcersizeGroup> groupedExcersizes = null;
    private final int groupLayout = 0;
    private final int excersizesLayout = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.gymhelper.db.Excersize> curDayExcersizes = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<java.lang.Long, java.lang.Boolean, kotlin.Unit> excersizeCheckingCallback = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Object getGroup(int groupPosition) {
        return null;
    }
    
    @java.lang.Override()
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
    
    @java.lang.Override()
    public boolean hasStableIds() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getGroupView(int groupPosition, boolean isExpanded, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public int getChildrenCount(int groupPosition) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Object getChild(int groupPosition, int childPosition) {
        return null;
    }
    
    @java.lang.Override()
    public long getGroupId(int groupPosition) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getChildView(int groupPosition, int childPosition, boolean isLastChild, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public long getChildId(int groupPosition, int childPosition) {
        return 0L;
    }
    
    @java.lang.Override()
    public int getGroupCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getGroups() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.gymhelper.model.ExcersizeGroup> getGroupedExcersizes() {
        return null;
    }
    
    public final int getGroupLayout() {
        return 0;
    }
    
    public final int getExcersizesLayout() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.gymhelper.db.Excersize> getCurDayExcersizes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.lang.Long, java.lang.Boolean, kotlin.Unit> getExcersizeCheckingCallback() {
        return null;
    }
    
    public ExcersizesListExpandableListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> groups, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.gymhelper.model.ExcersizeGroup> groupedExcersizes, int groupLayout, int excersizesLayout, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.gymhelper.db.Excersize> curDayExcersizes, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Boolean, kotlin.Unit> excersizeCheckingCallback) {
        super();
    }
}