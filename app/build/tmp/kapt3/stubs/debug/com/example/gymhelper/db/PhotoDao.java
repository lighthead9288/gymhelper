package com.example.gymhelper.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0017\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\'\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\'J\u0017\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u0007H\'\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\u0011"}, d2 = {"Lcom/example/gymhelper/db/PhotoDao;", "", "clear", "", "delete", "", "photo", "Lcom/example/gymhelper/db/Photo;", "get", "id", "", "(Ljava/lang/Long;)Lcom/example/gymhelper/db/Photo;", "getAll", "", "insert", "(Lcom/example/gymhelper/db/Photo;)Ljava/lang/Long;", "update", "app_debug"})
public abstract interface PhotoDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Long insert(@org.jetbrains.annotations.NotNull()
    com.example.gymhelper.db.Photo photo);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.example.gymhelper.db.Photo photo);
    
    @androidx.room.Delete()
    public abstract int delete(@org.jetbrains.annotations.NotNull()
    com.example.gymhelper.db.Photo photo);
    
    @androidx.room.Query(value = "DELETE FROM Photos")
    public abstract void clear();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Photos WHERE PhotoId=:id")
    public abstract com.example.gymhelper.db.Photo get(@org.jetbrains.annotations.Nullable()
    java.lang.Long id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Photos")
    public abstract java.util.List<com.example.gymhelper.db.Photo> getAll();
}