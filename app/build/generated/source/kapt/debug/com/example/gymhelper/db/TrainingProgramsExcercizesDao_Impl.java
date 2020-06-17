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
public final class TrainingProgramsExcercizesDao_Impl implements TrainingProgramsExcercizesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfTrainingProgramsExcersizes;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfTrainingProgramsExcersizes;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  private final SharedSQLiteStatement __preparedStmtOfDeleteExersizeFromTrainingDay;

  private final SharedSQLiteStatement __preparedStmtOfDeleteByTrainingDayId;

  public TrainingProgramsExcercizesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTrainingProgramsExcersizes = new EntityInsertionAdapter<TrainingProgramsExcersizes>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `TrainingProgramsExcercizes`(`Id`,`ExcersizeId`,`DayId`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TrainingProgramsExcersizes value) {
        stmt.bindLong(1, value.getId());
        if (value.getExcersizeId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getExcersizeId());
        }
        if (value.getDayId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getDayId());
        }
      }
    };
    this.__deletionAdapterOfTrainingProgramsExcersizes = new EntityDeletionOrUpdateAdapter<TrainingProgramsExcersizes>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `TrainingProgramsExcercizes` WHERE `Id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TrainingProgramsExcersizes value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM TrainingProgramsExcercizes";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteExersizeFromTrainingDay = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM TrainingProgramsExcercizes WHERE ExcersizeId=? AND DayId=?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteByTrainingDayId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM TrainingProgramsExcercizes WHERE DayId=?";
        return _query;
      }
    };
  }

  @Override
  public void insert(TrainingProgramsExcersizes trainingProgramsExcersizes) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfTrainingProgramsExcersizes.insert(trainingProgramsExcersizes);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(TrainingProgramsExcersizes trainingProgramsExcersizes) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfTrainingProgramsExcersizes.handle(trainingProgramsExcersizes);
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
  public int deleteExersizeFromTrainingDay(long exId, long trainingDayId) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteExersizeFromTrainingDay.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, exId);
      _argIndex = 2;
      _stmt.bindLong(_argIndex, trainingDayId);
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteExersizeFromTrainingDay.release(_stmt);
    }
  }

  @Override
  public int deleteByTrainingDayId(long trainingDayId) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteByTrainingDayId.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, trainingDayId);
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteByTrainingDayId.release(_stmt);
    }
  }

  @Override
  public List<TrainingProgramsExcersizes> getById(Long trainingDayId) {
    final String _sql = "SELECT *FROM TrainingProgramsExcercizes WHERE DayId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (trainingDayId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, trainingDayId);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("Id");
      final int _cursorIndexOfExcersizeId = _cursor.getColumnIndexOrThrow("ExcersizeId");
      final int _cursorIndexOfDayId = _cursor.getColumnIndexOrThrow("DayId");
      final List<TrainingProgramsExcersizes> _result = new ArrayList<TrainingProgramsExcersizes>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TrainingProgramsExcersizes _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final Long _tmpExcersizeId;
        if (_cursor.isNull(_cursorIndexOfExcersizeId)) {
          _tmpExcersizeId = null;
        } else {
          _tmpExcersizeId = _cursor.getLong(_cursorIndexOfExcersizeId);
        }
        final Long _tmpDayId;
        if (_cursor.isNull(_cursorIndexOfDayId)) {
          _tmpDayId = null;
        } else {
          _tmpDayId = _cursor.getLong(_cursorIndexOfDayId);
        }
        _item = new TrainingProgramsExcersizes(_tmpId,_tmpExcersizeId,_tmpDayId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<TrainingProgramsExcersizes> getDayExcersizesById(long trainingDayId) {
    final String _sql = "SELECT *FROM TrainingProgramsExcercizes WHERE DayId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, trainingDayId);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("Id");
      final int _cursorIndexOfExcersizeId = _cursor.getColumnIndexOrThrow("ExcersizeId");
      final int _cursorIndexOfDayId = _cursor.getColumnIndexOrThrow("DayId");
      final List<TrainingProgramsExcersizes> _result = new ArrayList<TrainingProgramsExcersizes>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TrainingProgramsExcersizes _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final Long _tmpExcersizeId;
        if (_cursor.isNull(_cursorIndexOfExcersizeId)) {
          _tmpExcersizeId = null;
        } else {
          _tmpExcersizeId = _cursor.getLong(_cursorIndexOfExcersizeId);
        }
        final Long _tmpDayId;
        if (_cursor.isNull(_cursorIndexOfDayId)) {
          _tmpDayId = null;
        } else {
          _tmpDayId = _cursor.getLong(_cursorIndexOfDayId);
        }
        _item = new TrainingProgramsExcersizes(_tmpId,_tmpExcersizeId,_tmpDayId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public TrainingProgramsExcersizes getDayExcersizeById(long trainingDayId, long excersizeId) {
    final String _sql = "SELECT *FROM TrainingProgramsExcercizes WHERE DayId=? AND ExcersizeId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, trainingDayId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, excersizeId);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("Id");
      final int _cursorIndexOfExcersizeId = _cursor.getColumnIndexOrThrow("ExcersizeId");
      final int _cursorIndexOfDayId = _cursor.getColumnIndexOrThrow("DayId");
      final TrainingProgramsExcersizes _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final Long _tmpExcersizeId;
        if (_cursor.isNull(_cursorIndexOfExcersizeId)) {
          _tmpExcersizeId = null;
        } else {
          _tmpExcersizeId = _cursor.getLong(_cursorIndexOfExcersizeId);
        }
        final Long _tmpDayId;
        if (_cursor.isNull(_cursorIndexOfDayId)) {
          _tmpDayId = null;
        } else {
          _tmpDayId = _cursor.getLong(_cursorIndexOfDayId);
        }
        _result = new TrainingProgramsExcersizes(_tmpId,_tmpExcersizeId,_tmpDayId);
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
  public List<TrainingProgramsExcersizes> getAll() {
    final String _sql = "SELECT *FROM TrainingProgramsExcercizes";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("Id");
      final int _cursorIndexOfExcersizeId = _cursor.getColumnIndexOrThrow("ExcersizeId");
      final int _cursorIndexOfDayId = _cursor.getColumnIndexOrThrow("DayId");
      final List<TrainingProgramsExcersizes> _result = new ArrayList<TrainingProgramsExcersizes>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TrainingProgramsExcersizes _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final Long _tmpExcersizeId;
        if (_cursor.isNull(_cursorIndexOfExcersizeId)) {
          _tmpExcersizeId = null;
        } else {
          _tmpExcersizeId = _cursor.getLong(_cursorIndexOfExcersizeId);
        }
        final Long _tmpDayId;
        if (_cursor.isNull(_cursorIndexOfDayId)) {
          _tmpDayId = null;
        } else {
          _tmpDayId = _cursor.getLong(_cursorIndexOfDayId);
        }
        _item = new TrainingProgramsExcersizes(_tmpId,_tmpExcersizeId,_tmpDayId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
