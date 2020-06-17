package com.example.gymhelper.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class ExcersizeDatabase_Impl extends ExcersizeDatabase {
  private volatile ExcersizeDao _excersizeDao;

  private volatile PhotoDao _photoDao;

  private volatile ExcercizePhotoDao _excercizePhotoDao;

  private volatile TrainingProgramDao _trainingProgramDao;

  private volatile TrainingProgramsExcercizesDao _trainingProgramsExcercizesDao;

  private volatile TrainingProgramDayDao _trainingProgramDayDao;

  private volatile TrainingProfileDao _trainingProfileDao;

  private volatile TrainingProfilesExcersizesDao _trainingProfilesExcersizesDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(11) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Excersizes` (`ExcersizeId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `Name` TEXT NOT NULL, `Group` TEXT NOT NULL, `Subgroup` TEXT NOT NULL, `Description` TEXT NOT NULL, `Level` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Photos` (`PhotoId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `Path` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ExcersizePhoto` (`Id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `ExcersizeId` INTEGER, `PhotoId` INTEGER)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `TrainingPrograms` (`TrainingProgramId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `Name` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `TrainingProgramsExcercizes` (`Id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `ExcersizeId` INTEGER, `DayId` INTEGER)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `TrainingProgramDays` (`TrainingProgramDayId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `trainingProgramId` INTEGER, `dayName` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `TrainingProfiles` (`TrainingProfileId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `Name` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `TrainingProfilesExcersizes` (`Id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `TrainingProfileId` INTEGER, `ExcersizeId` INTEGER)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"bfeed7072e55b0efc066e9160f4b4700\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Excersizes`");
        _db.execSQL("DROP TABLE IF EXISTS `Photos`");
        _db.execSQL("DROP TABLE IF EXISTS `ExcersizePhoto`");
        _db.execSQL("DROP TABLE IF EXISTS `TrainingPrograms`");
        _db.execSQL("DROP TABLE IF EXISTS `TrainingProgramsExcercizes`");
        _db.execSQL("DROP TABLE IF EXISTS `TrainingProgramDays`");
        _db.execSQL("DROP TABLE IF EXISTS `TrainingProfiles`");
        _db.execSQL("DROP TABLE IF EXISTS `TrainingProfilesExcersizes`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsExcersizes = new HashMap<String, TableInfo.Column>(6);
        _columnsExcersizes.put("ExcersizeId", new TableInfo.Column("ExcersizeId", "INTEGER", true, 1));
        _columnsExcersizes.put("Name", new TableInfo.Column("Name", "TEXT", true, 0));
        _columnsExcersizes.put("Group", new TableInfo.Column("Group", "TEXT", true, 0));
        _columnsExcersizes.put("Subgroup", new TableInfo.Column("Subgroup", "TEXT", true, 0));
        _columnsExcersizes.put("Description", new TableInfo.Column("Description", "TEXT", true, 0));
        _columnsExcersizes.put("Level", new TableInfo.Column("Level", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysExcersizes = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesExcersizes = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoExcersizes = new TableInfo("Excersizes", _columnsExcersizes, _foreignKeysExcersizes, _indicesExcersizes);
        final TableInfo _existingExcersizes = TableInfo.read(_db, "Excersizes");
        if (! _infoExcersizes.equals(_existingExcersizes)) {
          throw new IllegalStateException("Migration didn't properly handle Excersizes(com.example.gymhelper.db.Excersize).\n"
                  + " Expected:\n" + _infoExcersizes + "\n"
                  + " Found:\n" + _existingExcersizes);
        }
        final HashMap<String, TableInfo.Column> _columnsPhotos = new HashMap<String, TableInfo.Column>(2);
        _columnsPhotos.put("PhotoId", new TableInfo.Column("PhotoId", "INTEGER", true, 1));
        _columnsPhotos.put("Path", new TableInfo.Column("Path", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPhotos = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPhotos = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPhotos = new TableInfo("Photos", _columnsPhotos, _foreignKeysPhotos, _indicesPhotos);
        final TableInfo _existingPhotos = TableInfo.read(_db, "Photos");
        if (! _infoPhotos.equals(_existingPhotos)) {
          throw new IllegalStateException("Migration didn't properly handle Photos(com.example.gymhelper.db.Photo).\n"
                  + " Expected:\n" + _infoPhotos + "\n"
                  + " Found:\n" + _existingPhotos);
        }
        final HashMap<String, TableInfo.Column> _columnsExcersizePhoto = new HashMap<String, TableInfo.Column>(3);
        _columnsExcersizePhoto.put("Id", new TableInfo.Column("Id", "INTEGER", true, 1));
        _columnsExcersizePhoto.put("ExcersizeId", new TableInfo.Column("ExcersizeId", "INTEGER", false, 0));
        _columnsExcersizePhoto.put("PhotoId", new TableInfo.Column("PhotoId", "INTEGER", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysExcersizePhoto = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesExcersizePhoto = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoExcersizePhoto = new TableInfo("ExcersizePhoto", _columnsExcersizePhoto, _foreignKeysExcersizePhoto, _indicesExcersizePhoto);
        final TableInfo _existingExcersizePhoto = TableInfo.read(_db, "ExcersizePhoto");
        if (! _infoExcersizePhoto.equals(_existingExcersizePhoto)) {
          throw new IllegalStateException("Migration didn't properly handle ExcersizePhoto(com.example.gymhelper.db.ExcersizePhoto).\n"
                  + " Expected:\n" + _infoExcersizePhoto + "\n"
                  + " Found:\n" + _existingExcersizePhoto);
        }
        final HashMap<String, TableInfo.Column> _columnsTrainingPrograms = new HashMap<String, TableInfo.Column>(2);
        _columnsTrainingPrograms.put("TrainingProgramId", new TableInfo.Column("TrainingProgramId", "INTEGER", true, 1));
        _columnsTrainingPrograms.put("Name", new TableInfo.Column("Name", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTrainingPrograms = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTrainingPrograms = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTrainingPrograms = new TableInfo("TrainingPrograms", _columnsTrainingPrograms, _foreignKeysTrainingPrograms, _indicesTrainingPrograms);
        final TableInfo _existingTrainingPrograms = TableInfo.read(_db, "TrainingPrograms");
        if (! _infoTrainingPrograms.equals(_existingTrainingPrograms)) {
          throw new IllegalStateException("Migration didn't properly handle TrainingPrograms(com.example.gymhelper.db.TrainingProgram).\n"
                  + " Expected:\n" + _infoTrainingPrograms + "\n"
                  + " Found:\n" + _existingTrainingPrograms);
        }
        final HashMap<String, TableInfo.Column> _columnsTrainingProgramsExcercizes = new HashMap<String, TableInfo.Column>(3);
        _columnsTrainingProgramsExcercizes.put("Id", new TableInfo.Column("Id", "INTEGER", true, 1));
        _columnsTrainingProgramsExcercizes.put("ExcersizeId", new TableInfo.Column("ExcersizeId", "INTEGER", false, 0));
        _columnsTrainingProgramsExcercizes.put("DayId", new TableInfo.Column("DayId", "INTEGER", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTrainingProgramsExcercizes = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTrainingProgramsExcercizes = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTrainingProgramsExcercizes = new TableInfo("TrainingProgramsExcercizes", _columnsTrainingProgramsExcercizes, _foreignKeysTrainingProgramsExcercizes, _indicesTrainingProgramsExcercizes);
        final TableInfo _existingTrainingProgramsExcercizes = TableInfo.read(_db, "TrainingProgramsExcercizes");
        if (! _infoTrainingProgramsExcercizes.equals(_existingTrainingProgramsExcercizes)) {
          throw new IllegalStateException("Migration didn't properly handle TrainingProgramsExcercizes(com.example.gymhelper.db.TrainingProgramsExcersizes).\n"
                  + " Expected:\n" + _infoTrainingProgramsExcercizes + "\n"
                  + " Found:\n" + _existingTrainingProgramsExcercizes);
        }
        final HashMap<String, TableInfo.Column> _columnsTrainingProgramDays = new HashMap<String, TableInfo.Column>(3);
        _columnsTrainingProgramDays.put("TrainingProgramDayId", new TableInfo.Column("TrainingProgramDayId", "INTEGER", true, 1));
        _columnsTrainingProgramDays.put("trainingProgramId", new TableInfo.Column("trainingProgramId", "INTEGER", false, 0));
        _columnsTrainingProgramDays.put("dayName", new TableInfo.Column("dayName", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTrainingProgramDays = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTrainingProgramDays = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTrainingProgramDays = new TableInfo("TrainingProgramDays", _columnsTrainingProgramDays, _foreignKeysTrainingProgramDays, _indicesTrainingProgramDays);
        final TableInfo _existingTrainingProgramDays = TableInfo.read(_db, "TrainingProgramDays");
        if (! _infoTrainingProgramDays.equals(_existingTrainingProgramDays)) {
          throw new IllegalStateException("Migration didn't properly handle TrainingProgramDays(com.example.gymhelper.db.TrainingProgramDay).\n"
                  + " Expected:\n" + _infoTrainingProgramDays + "\n"
                  + " Found:\n" + _existingTrainingProgramDays);
        }
        final HashMap<String, TableInfo.Column> _columnsTrainingProfiles = new HashMap<String, TableInfo.Column>(2);
        _columnsTrainingProfiles.put("TrainingProfileId", new TableInfo.Column("TrainingProfileId", "INTEGER", true, 1));
        _columnsTrainingProfiles.put("Name", new TableInfo.Column("Name", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTrainingProfiles = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTrainingProfiles = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTrainingProfiles = new TableInfo("TrainingProfiles", _columnsTrainingProfiles, _foreignKeysTrainingProfiles, _indicesTrainingProfiles);
        final TableInfo _existingTrainingProfiles = TableInfo.read(_db, "TrainingProfiles");
        if (! _infoTrainingProfiles.equals(_existingTrainingProfiles)) {
          throw new IllegalStateException("Migration didn't properly handle TrainingProfiles(com.example.gymhelper.db.TrainingProfile).\n"
                  + " Expected:\n" + _infoTrainingProfiles + "\n"
                  + " Found:\n" + _existingTrainingProfiles);
        }
        final HashMap<String, TableInfo.Column> _columnsTrainingProfilesExcersizes = new HashMap<String, TableInfo.Column>(3);
        _columnsTrainingProfilesExcersizes.put("Id", new TableInfo.Column("Id", "INTEGER", true, 1));
        _columnsTrainingProfilesExcersizes.put("TrainingProfileId", new TableInfo.Column("TrainingProfileId", "INTEGER", false, 0));
        _columnsTrainingProfilesExcersizes.put("ExcersizeId", new TableInfo.Column("ExcersizeId", "INTEGER", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTrainingProfilesExcersizes = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTrainingProfilesExcersizes = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTrainingProfilesExcersizes = new TableInfo("TrainingProfilesExcersizes", _columnsTrainingProfilesExcersizes, _foreignKeysTrainingProfilesExcersizes, _indicesTrainingProfilesExcersizes);
        final TableInfo _existingTrainingProfilesExcersizes = TableInfo.read(_db, "TrainingProfilesExcersizes");
        if (! _infoTrainingProfilesExcersizes.equals(_existingTrainingProfilesExcersizes)) {
          throw new IllegalStateException("Migration didn't properly handle TrainingProfilesExcersizes(com.example.gymhelper.db.TrainingProfileExcersize).\n"
                  + " Expected:\n" + _infoTrainingProfilesExcersizes + "\n"
                  + " Found:\n" + _existingTrainingProfilesExcersizes);
        }
      }
    }, "bfeed7072e55b0efc066e9160f4b4700", "6895857fa2fb5c76b13e7c3f81f518f9");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "Excersizes","Photos","ExcersizePhoto","TrainingPrograms","TrainingProgramsExcercizes","TrainingProgramDays","TrainingProfiles","TrainingProfilesExcersizes");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Excersizes`");
      _db.execSQL("DELETE FROM `Photos`");
      _db.execSQL("DELETE FROM `ExcersizePhoto`");
      _db.execSQL("DELETE FROM `TrainingPrograms`");
      _db.execSQL("DELETE FROM `TrainingProgramsExcercizes`");
      _db.execSQL("DELETE FROM `TrainingProgramDays`");
      _db.execSQL("DELETE FROM `TrainingProfiles`");
      _db.execSQL("DELETE FROM `TrainingProfilesExcersizes`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public ExcersizeDao getExcersizeDao() {
    if (_excersizeDao != null) {
      return _excersizeDao;
    } else {
      synchronized(this) {
        if(_excersizeDao == null) {
          _excersizeDao = new ExcersizeDao_Impl(this);
        }
        return _excersizeDao;
      }
    }
  }

  @Override
  public PhotoDao getPhotoDao() {
    if (_photoDao != null) {
      return _photoDao;
    } else {
      synchronized(this) {
        if(_photoDao == null) {
          _photoDao = new PhotoDao_Impl(this);
        }
        return _photoDao;
      }
    }
  }

  @Override
  public ExcercizePhotoDao getExcercizePhotoDao() {
    if (_excercizePhotoDao != null) {
      return _excercizePhotoDao;
    } else {
      synchronized(this) {
        if(_excercizePhotoDao == null) {
          _excercizePhotoDao = new ExcercizePhotoDao_Impl(this);
        }
        return _excercizePhotoDao;
      }
    }
  }

  @Override
  public TrainingProgramDao getTrainingProgramDao() {
    if (_trainingProgramDao != null) {
      return _trainingProgramDao;
    } else {
      synchronized(this) {
        if(_trainingProgramDao == null) {
          _trainingProgramDao = new TrainingProgramDao_Impl(this);
        }
        return _trainingProgramDao;
      }
    }
  }

  @Override
  public TrainingProgramsExcercizesDao getTrainingProgramsExcercizesDao() {
    if (_trainingProgramsExcercizesDao != null) {
      return _trainingProgramsExcercizesDao;
    } else {
      synchronized(this) {
        if(_trainingProgramsExcercizesDao == null) {
          _trainingProgramsExcercizesDao = new TrainingProgramsExcercizesDao_Impl(this);
        }
        return _trainingProgramsExcercizesDao;
      }
    }
  }

  @Override
  public TrainingProgramDayDao getTrainingProgramDayDao() {
    if (_trainingProgramDayDao != null) {
      return _trainingProgramDayDao;
    } else {
      synchronized(this) {
        if(_trainingProgramDayDao == null) {
          _trainingProgramDayDao = new TrainingProgramDayDao_Impl(this);
        }
        return _trainingProgramDayDao;
      }
    }
  }

  @Override
  public TrainingProfileDao getTrainingProfileDao() {
    if (_trainingProfileDao != null) {
      return _trainingProfileDao;
    } else {
      synchronized(this) {
        if(_trainingProfileDao == null) {
          _trainingProfileDao = new TrainingProfileDao_Impl(this);
        }
        return _trainingProfileDao;
      }
    }
  }

  @Override
  public TrainingProfilesExcersizesDao getTrainingProfilesExcersizesDao() {
    if (_trainingProfilesExcersizesDao != null) {
      return _trainingProfilesExcersizesDao;
    } else {
      synchronized(this) {
        if(_trainingProfilesExcersizesDao == null) {
          _trainingProfilesExcersizesDao = new TrainingProfilesExcersizesDao_Impl(this);
        }
        return _trainingProfilesExcersizesDao;
      }
    }
  }
}
