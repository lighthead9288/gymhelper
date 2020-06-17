package com.example.gymhelper.db;

import java.lang.System;

@androidx.room.Database(entities = {com.example.gymhelper.db.Excersize.class, com.example.gymhelper.db.Photo.class, com.example.gymhelper.db.ExcersizePhoto.class, com.example.gymhelper.db.TrainingProgram.class, com.example.gymhelper.db.TrainingProgramsExcersizes.class, com.example.gymhelper.db.TrainingProgramDay.class, com.example.gymhelper.db.TrainingProfile.class, com.example.gymhelper.db.TrainingProfileExcersize.class}, version = 11)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0018X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u001cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0012\u0010\u001f\u001a\u00020 X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"\u00a8\u0006$"}, d2 = {"Lcom/example/gymhelper/db/ExcersizeDatabase;", "Landroidx/room/RoomDatabase;", "()V", "excercizePhotoDao", "Lcom/example/gymhelper/db/ExcercizePhotoDao;", "getExcercizePhotoDao", "()Lcom/example/gymhelper/db/ExcercizePhotoDao;", "excersizeDao", "Lcom/example/gymhelper/db/ExcersizeDao;", "getExcersizeDao", "()Lcom/example/gymhelper/db/ExcersizeDao;", "photoDao", "Lcom/example/gymhelper/db/PhotoDao;", "getPhotoDao", "()Lcom/example/gymhelper/db/PhotoDao;", "trainingProfileDao", "Lcom/example/gymhelper/db/TrainingProfileDao;", "getTrainingProfileDao", "()Lcom/example/gymhelper/db/TrainingProfileDao;", "trainingProfilesExcersizesDao", "Lcom/example/gymhelper/db/TrainingProfilesExcersizesDao;", "getTrainingProfilesExcersizesDao", "()Lcom/example/gymhelper/db/TrainingProfilesExcersizesDao;", "trainingProgramDao", "Lcom/example/gymhelper/db/TrainingProgramDao;", "getTrainingProgramDao", "()Lcom/example/gymhelper/db/TrainingProgramDao;", "trainingProgramDayDao", "Lcom/example/gymhelper/db/TrainingProgramDayDao;", "getTrainingProgramDayDao", "()Lcom/example/gymhelper/db/TrainingProgramDayDao;", "trainingProgramsExcercizesDao", "Lcom/example/gymhelper/db/TrainingProgramsExcercizesDao;", "getTrainingProgramsExcercizesDao", "()Lcom/example/gymhelper/db/TrainingProgramsExcercizesDao;", "Companion", "app_debug"})
public abstract class ExcersizeDatabase extends androidx.room.RoomDatabase {
    private static volatile com.example.gymhelper.db.ExcersizeDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull()
    public static java.io.OutputStream outputStream;
    public static final com.example.gymhelper.db.ExcersizeDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.gymhelper.db.ExcersizeDao getExcersizeDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.gymhelper.db.PhotoDao getPhotoDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.gymhelper.db.ExcercizePhotoDao getExcercizePhotoDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.gymhelper.db.TrainingProgramDao getTrainingProgramDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.gymhelper.db.TrainingProgramsExcercizesDao getTrainingProgramsExcercizesDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.gymhelper.db.TrainingProgramDayDao getTrainingProgramDayDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.gymhelper.db.TrainingProfileDao getTrainingProfileDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.gymhelper.db.TrainingProfilesExcersizesDao getTrainingProfilesExcersizesDao();
    
    public ExcersizeDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J3\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004J\u001e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001aR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u001d"}, d2 = {"Lcom/example/gymhelper/db/ExcersizeDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/example/gymhelper/db/ExcersizeDatabase;", "outputStream", "Ljava/io/OutputStream;", "getOutputStream", "()Ljava/io/OutputStream;", "setOutputStream", "(Ljava/io/OutputStream;)V", "fillSingleExcersizeInfo", "", "context", "Landroid/content/Context;", "db", "excersize", "Lcom/example/gymhelper/db/Excersize;", "photosResources", "", "", "(Landroid/content/Context;Lcom/example/gymhelper/db/ExcersizeDatabase;Lcom/example/gymhelper/db/Excersize;Ljava/util/List;)Ljava/lang/Long;", "getInstance", "prefillDb", "", "saveImageToFolder", "", "resId", "name", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.gymhelper.db.ExcersizeDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        public final void prefillDb(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.example.gymhelper.db.ExcersizeDatabase db) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long fillSingleExcersizeInfo(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.example.gymhelper.db.ExcersizeDatabase db, @org.jetbrains.annotations.NotNull()
        com.example.gymhelper.db.Excersize excersize, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Integer> photosResources) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.io.OutputStream getOutputStream() {
            return null;
        }
        
        public final void setOutputStream(@org.jetbrains.annotations.NotNull()
        java.io.OutputStream p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String saveImageToFolder(@org.jetbrains.annotations.NotNull()
        android.content.Context context, int resId, @org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}