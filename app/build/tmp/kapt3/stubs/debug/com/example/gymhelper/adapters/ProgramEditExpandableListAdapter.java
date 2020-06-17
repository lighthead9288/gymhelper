package com.example.gymhelper.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0096\u0001\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\r\u00126\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00120\u0014\u00a2\u0006\u0002\u0010\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0016J\u0018\u0010&\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0016J4\u0010\'\u001a\u00020(2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010(2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010.\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010/\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020\nH\u0016J\b\u00100\u001a\u00020\nH\u0016J\u0010\u00101\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\nH\u0016J,\u00102\u001a\u00020(2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u00103\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010(2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u00104\u001a\u00020*H\u0016J\u0018\u00105\u001a\u00020*2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR,\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fRA\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00120\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001d\u00a8\u00066"}, d2 = {"Lcom/example/gymhelper/adapters/ProgramEditExpandableListAdapter;", "Landroid/widget/BaseExpandableListAdapter;", "context", "Landroid/content/Context;", "groups", "", "Lcom/example/gymhelper/db/TrainingProgramDay;", "trainingDays", "Lcom/example/gymhelper/model/TrainingDay;", "dayLayout", "", "excersizeLayout", "trainingDayDeletingCallback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "trainingDayId", "", "trainingDayEditCallback", "Lkotlin/Function2;", "groupPosition", "(Landroid/content/Context;Ljava/util/List;Ljava/util/List;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "getContext", "()Landroid/content/Context;", "getDayLayout", "()I", "getExcersizeLayout", "getGroups", "()Ljava/util/List;", "getTrainingDayDeletingCallback", "()Lkotlin/jvm/functions/Function1;", "getTrainingDayEditCallback", "()Lkotlin/jvm/functions/Function2;", "getTrainingDays", "getChild", "", "childPosition", "getChildId", "getChildView", "Landroid/view/View;", "isLastChild", "", "convertView", "parent", "Landroid/view/ViewGroup;", "getChildrenCount", "getGroup", "getGroupCount", "getGroupId", "getGroupView", "isExpanded", "hasStableIds", "isChildSelectable", "app_debug"})
public final class ProgramEditExpandableListAdapter extends android.widget.BaseExpandableListAdapter {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.gymhelper.db.TrainingProgramDay> groups = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.gymhelper.model.TrainingDay> trainingDays = null;
    private final int dayLayout = 0;
    private final int excersizeLayout = 0;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> trainingDayDeletingCallback = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<java.lang.Long, java.lang.Integer, kotlin.Unit> trainingDayEditCallback = null;
    
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
    public final java.util.List<com.example.gymhelper.db.TrainingProgramDay> getGroups() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.gymhelper.model.TrainingDay> getTrainingDays() {
        return null;
    }
    
    public final int getDayLayout() {
        return 0;
    }
    
    public final int getExcersizeLayout() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> getTrainingDayDeletingCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.lang.Long, java.lang.Integer, kotlin.Unit> getTrainingDayEditCallback() {
        return null;
    }
    
    public ProgramEditExpandableListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.gymhelper.db.TrainingProgramDay> groups, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.gymhelper.model.TrainingDay> trainingDays, int dayLayout, int excersizeLayout, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> trainingDayDeletingCallback, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Integer, kotlin.Unit> trainingDayEditCallback) {
        super();
    }
}