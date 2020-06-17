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
public final class TrainingProgramDao_Impl implements TrainingProgramDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfTrainingProgram;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfTrainingProgram;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfTrainingProgram;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  public TrainingProgramDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTrainingProgram = new EntityInsertionAdapter<TrainingProgram>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `TrainingPrograms`(`TrainingProgramId`,`Name`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TrainingProgram value) {
        stmt.bindLong(1, value.getTrainingProgramId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
      }
    };
    this.__deletionAdapterOfTrainingProgram = new EntityDeletionOrUpdateAdapter<TrainingProgram>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `TrainingPrograms` WHERE `TrainingProgramId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TrainingProgram value) {
        stmt.bindLong(1, value.getTrainingProgramId());
      }
    };
    this.__updateAdapterOfTrainingProgram = new EntityDeletionOrUpdateAdapter<TrainingProgram>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `TrainingPrograms` SET `TrainingProgramId` = ?,`Name` = ? WHERE `TrainingProgramId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TrainingProgram value) {
        stmt.bindLong(1, value.getTrainingProgramId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindLong(3, value.getTrainingProgramId());
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM TrainingPrograms";
        return _query;
      }
    };
  }

  @Override
  public Long insert(TrainingProgram trainingProgram) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfTrainingProgram.insertAndReturnId(trainingProgram);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int delete(TrainingProgram trainingProgram) {
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfTrainingProgram.handle(trainingProgram);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(TrainingProgram trainingProgram) {
    __db.beginTransaction();
    try {
      __updateAdapterOfTrainingProgram.handle(trainingProgram);
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
  public TrainingProgram get(long id) {
    final String _sql = "SELECT *FROM TrainingPrograms WHERE TrainingProgramId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfTrainingProgramId = _cursor.getColumnIndexOrThrow("TrainingProgramId");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("Name");
      final TrainingProgram _result;
      if(_cursor.moveToFirst()) {
        final long _tmpTrainingProgramId;
        _tmpTrainingProgramId = _cursor.getLong(_cursorIndexOfTrainingProgramId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _result = new TrainingProgram(_tmpTrainingProgramId,_tmpName);
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
  public List<TrainingProgram> getAll() {
    final String _sql = "SELECT *FROM TrainingPrograms";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfTrainingProgramId = _cursor.getColumnIndexOrThrow("TrainingProgramId");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("Name");
      final List<TrainingProgram> _result = new ArrayList<TrainingProgram>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TrainingProgram _item;
        final long _tmpTrainingProgramId;
        _tmpTrainingProgramId = _cursor.getLong(_cursorIndexOfTrainingProgramId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _item = new TrainingProgram(_tmpTrainingProgramId,_tmpName);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
