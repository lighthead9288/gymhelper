package com.example.gymhelper.db;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TrainingProgramDayDao_Impl implements TrainingProgramDayDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TrainingProgramDay> __insertionAdapterOfTrainingProgramDay;

  private final EntityDeletionOrUpdateAdapter<TrainingProgramDay> __deletionAdapterOfTrainingProgramDay;

  private final EntityDeletionOrUpdateAdapter<TrainingProgramDay> __updateAdapterOfTrainingProgramDay;

  private final SharedSQLiteStatement __preparedStmtOfDeleteByTrainingProgramId;

  public TrainingProgramDayDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTrainingProgramDay = new EntityInsertionAdapter<TrainingProgramDay>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `TrainingProgramDays` (`TrainingProgramDayId`,`trainingProgramId`,`dayName`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TrainingProgramDay value) {
        stmt.bindLong(1, value.getTrainingProgramDayId());
        if (value.getTrainingProgramId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getTrainingProgramId());
        }
        if (value.getDayName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDayName());
        }
      }
    };
    this.__deletionAdapterOfTrainingProgramDay = new EntityDeletionOrUpdateAdapter<TrainingProgramDay>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `TrainingProgramDays` WHERE `TrainingProgramDayId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TrainingProgramDay value) {
        stmt.bindLong(1, value.getTrainingProgramDayId());
      }
    };
    this.__updateAdapterOfTrainingProgramDay = new EntityDeletionOrUpdateAdapter<TrainingProgramDay>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `TrainingProgramDays` SET `TrainingProgramDayId` = ?,`trainingProgramId` = ?,`dayName` = ? WHERE `TrainingProgramDayId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TrainingProgramDay value) {
        stmt.bindLong(1, value.getTrainingProgramDayId());
        if (value.getTrainingProgramId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getTrainingProgramId());
        }
        if (value.getDayName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDayName());
        }
        stmt.bindLong(4, value.getTrainingProgramDayId());
      }
    };
    this.__preparedStmtOfDeleteByTrainingProgramId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM TrainingProgramDays WHERE trainingProgramId=?";
        return _query;
      }
    };
  }

  @Override
  public Long insert(final TrainingProgramDay day) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfTrainingProgramDay.insertAndReturnId(day);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final TrainingProgramDay day) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfTrainingProgramDay.handle(day);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final TrainingProgramDay day) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTrainingProgramDay.handle(day);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteByTrainingProgramId(final long trainingProgramId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteByTrainingProgramId.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, trainingProgramId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteByTrainingProgramId.release(_stmt);
    }
  }

  @Override
  public List<TrainingProgramDay> getTrainingProgramDays(final long trainingProgramId) {
    final String _sql = "SELECT *FROM TrainingProgramDays WHERE trainingProgramId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, trainingProgramId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTrainingProgramDayId = CursorUtil.getColumnIndexOrThrow(_cursor, "TrainingProgramDayId");
      final int _cursorIndexOfTrainingProgramId = CursorUtil.getColumnIndexOrThrow(_cursor, "trainingProgramId");
      final int _cursorIndexOfDayName = CursorUtil.getColumnIndexOrThrow(_cursor, "dayName");
      final List<TrainingProgramDay> _result = new ArrayList<TrainingProgramDay>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TrainingProgramDay _item;
        final long _tmpTrainingProgramDayId;
        _tmpTrainingProgramDayId = _cursor.getLong(_cursorIndexOfTrainingProgramDayId);
        final Long _tmpTrainingProgramId;
        if (_cursor.isNull(_cursorIndexOfTrainingProgramId)) {
          _tmpTrainingProgramId = null;
        } else {
          _tmpTrainingProgramId = _cursor.getLong(_cursorIndexOfTrainingProgramId);
        }
        final String _tmpDayName;
        _tmpDayName = _cursor.getString(_cursorIndexOfDayName);
        _item = new TrainingProgramDay(_tmpTrainingProgramDayId,_tmpTrainingProgramId,_tmpDayName);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public TrainingProgramDay getTrainingProgramDayById(final Long trainingProgramDayId) {
    final String _sql = "SELECT *FROM TrainingProgramDays WHERE TrainingProgramDayId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (trainingProgramDayId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, trainingProgramDayId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTrainingProgramDayId = CursorUtil.getColumnIndexOrThrow(_cursor, "TrainingProgramDayId");
      final int _cursorIndexOfTrainingProgramId = CursorUtil.getColumnIndexOrThrow(_cursor, "trainingProgramId");
      final int _cursorIndexOfDayName = CursorUtil.getColumnIndexOrThrow(_cursor, "dayName");
      final TrainingProgramDay _result;
      if(_cursor.moveToFirst()) {
        final long _tmpTrainingProgramDayId;
        _tmpTrainingProgramDayId = _cursor.getLong(_cursorIndexOfTrainingProgramDayId);
        final Long _tmpTrainingProgramId;
        if (_cursor.isNull(_cursorIndexOfTrainingProgramId)) {
          _tmpTrainingProgramId = null;
        } else {
          _tmpTrainingProgramId = _cursor.getLong(_cursorIndexOfTrainingProgramId);
        }
        final String _tmpDayName;
        _tmpDayName = _cursor.getString(_cursorIndexOfDayName);
        _result = new TrainingProgramDay(_tmpTrainingProgramDayId,_tmpTrainingProgramId,_tmpDayName);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
