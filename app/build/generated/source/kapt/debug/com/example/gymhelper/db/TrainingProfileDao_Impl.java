package com.example.gymhelper.db;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class TrainingProfileDao_Impl implements TrainingProfileDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfTrainingProfile;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfTrainingProfile;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfTrainingProfile;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  public TrainingProfileDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTrainingProfile = new EntityInsertionAdapter<TrainingProfile>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `TrainingProfiles`(`TrainingProfileId`,`Name`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TrainingProfile value) {
        stmt.bindLong(1, value.getTrainingProfileId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
      }
    };
    this.__deletionAdapterOfTrainingProfile = new EntityDeletionOrUpdateAdapter<TrainingProfile>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `TrainingProfiles` WHERE `TrainingProfileId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TrainingProfile value) {
        stmt.bindLong(1, value.getTrainingProfileId());
      }
    };
    this.__updateAdapterOfTrainingProfile = new EntityDeletionOrUpdateAdapter<TrainingProfile>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `TrainingProfiles` SET `TrainingProfileId` = ?,`Name` = ? WHERE `TrainingProfileId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TrainingProfile value) {
        stmt.bindLong(1, value.getTrainingProfileId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindLong(3, value.getTrainingProfileId());
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM TrainingProfiles";
        return _query;
      }
    };
  }

  @Override
  public Long insert(TrainingProfile trainingProfile) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfTrainingProfile.insertAndReturnId(trainingProfile);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int delete(TrainingProfile trainingProfile) {
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfTrainingProfile.handle(trainingProfile);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(TrainingProfile trainingProfile) {
    __db.beginTransaction();
    try {
      __updateAdapterOfTrainingProfile.handle(trainingProfile);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void clear() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfClear.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClear.release(_stmt);
    }
  }

  @Override
  public TrainingProfile get(long id) {
    final String _sql = "SELECT *FROM TrainingProfiles WHERE TrainingProfileId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfTrainingProfileId = _cursor.getColumnIndexOrThrow("TrainingProfileId");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("Name");
      final TrainingProfile _result;
      if(_cursor.moveToFirst()) {
        final long _tmpTrainingProfileId;
        _tmpTrainingProfileId = _cursor.getLong(_cursorIndexOfTrainingProfileId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _result = new TrainingProfile(_tmpTrainingProfileId,_tmpName);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<TrainingProfile> getAll() {
    final String _sql = "SELECT *FROM TrainingProfiles";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfTrainingProfileId = _cursor.getColumnIndexOrThrow("TrainingProfileId");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("Name");
      final List<TrainingProfile> _result = new ArrayList<TrainingProfile>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TrainingProfile _item;
        final long _tmpTrainingProfileId;
        _tmpTrainingProfileId = _cursor.getLong(_cursorIndexOfTrainingProfileId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _item = new TrainingProfile(_tmpTrainingProfileId,_tmpName);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
