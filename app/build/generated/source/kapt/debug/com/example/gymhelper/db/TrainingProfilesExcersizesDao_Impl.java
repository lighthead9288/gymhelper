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
public final class TrainingProfilesExcersizesDao_Impl implements TrainingProfilesExcersizesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TrainingProfileExcersize> __insertionAdapterOfTrainingProfileExcersize;

  private final EntityDeletionOrUpdateAdapter<TrainingProfileExcersize> __deletionAdapterOfTrainingProfileExcersize;

  private final EntityDeletionOrUpdateAdapter<TrainingProfileExcersize> __updateAdapterOfTrainingProfileExcersize;

  private final SharedSQLiteStatement __preparedStmtOfDeleteByTrainingProfileId;

  public TrainingProfilesExcersizesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTrainingProfileExcersize = new EntityInsertionAdapter<TrainingProfileExcersize>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `TrainingProfilesExcersizes` (`Id`,`TrainingProfileId`,`ExcersizeId`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TrainingProfileExcersize value) {
        stmt.bindLong(1, value.getId());
        if (value.getTrainingProfileId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getTrainingProfileId());
        }
        if (value.getExcersizeId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getExcersizeId());
        }
      }
    };
    this.__deletionAdapterOfTrainingProfileExcersize = new EntityDeletionOrUpdateAdapter<TrainingProfileExcersize>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `TrainingProfilesExcersizes` WHERE `Id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TrainingProfileExcersize value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfTrainingProfileExcersize = new EntityDeletionOrUpdateAdapter<TrainingProfileExcersize>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `TrainingProfilesExcersizes` SET `Id` = ?,`TrainingProfileId` = ?,`ExcersizeId` = ? WHERE `Id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TrainingProfileExcersize value) {
        stmt.bindLong(1, value.getId());
        if (value.getTrainingProfileId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getTrainingProfileId());
        }
        if (value.getExcersizeId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getExcersizeId());
        }
        stmt.bindLong(4, value.getId());
      }
    };
    this.__preparedStmtOfDeleteByTrainingProfileId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM TrainingProfilesExcersizes WHERE TrainingProfileId=?";
        return _query;
      }
    };
  }

  @Override
  public Long insert(final TrainingProfileExcersize trainingProfileExcersize) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfTrainingProfileExcersize.insertAndReturnId(trainingProfileExcersize);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final TrainingProfileExcersize trainingProfileExcersize) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfTrainingProfileExcersize.handle(trainingProfileExcersize);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final TrainingProfileExcersize trainingProfileExcersize) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTrainingProfileExcersize.handle(trainingProfileExcersize);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteByTrainingProfileId(final long trainingProfileId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteByTrainingProfileId.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, trainingProfileId);
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteByTrainingProfileId.release(_stmt);
    }
  }

  @Override
  public List<TrainingProfileExcersize> getTrainingProfileExcersizes(final long trainingProfileId) {
    final String _sql = "SELECT *FROM TrainingProfilesExcersizes WHERE TrainingProfileId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, trainingProfileId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "Id");
      final int _cursorIndexOfTrainingProfileId = CursorUtil.getColumnIndexOrThrow(_cursor, "TrainingProfileId");
      final int _cursorIndexOfExcersizeId = CursorUtil.getColumnIndexOrThrow(_cursor, "ExcersizeId");
      final List<TrainingProfileExcersize> _result = new ArrayList<TrainingProfileExcersize>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TrainingProfileExcersize _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final Long _tmpTrainingProfileId;
        if (_cursor.isNull(_cursorIndexOfTrainingProfileId)) {
          _tmpTrainingProfileId = null;
        } else {
          _tmpTrainingProfileId = _cursor.getLong(_cursorIndexOfTrainingProfileId);
        }
        final Long _tmpExcersizeId;
        if (_cursor.isNull(_cursorIndexOfExcersizeId)) {
          _tmpExcersizeId = null;
        } else {
          _tmpExcersizeId = _cursor.getLong(_cursorIndexOfExcersizeId);
        }
        _item = new TrainingProfileExcersize(_tmpId,_tmpTrainingProfileId,_tmpExcersizeId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public TrainingProfileExcersize getTrainingProfileExcersize(final long trainingProfileId,
      final long excersizeId) {
    final String _sql = "SELECT *FROM TrainingProfilesExcersizes WHERE TrainingProfileId=? AND ExcersizeId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, trainingProfileId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, excersizeId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "Id");
      final int _cursorIndexOfTrainingProfileId = CursorUtil.getColumnIndexOrThrow(_cursor, "TrainingProfileId");
      final int _cursorIndexOfExcersizeId = CursorUtil.getColumnIndexOrThrow(_cursor, "ExcersizeId");
      final TrainingProfileExcersize _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final Long _tmpTrainingProfileId;
        if (_cursor.isNull(_cursorIndexOfTrainingProfileId)) {
          _tmpTrainingProfileId = null;
        } else {
          _tmpTrainingProfileId = _cursor.getLong(_cursorIndexOfTrainingProfileId);
        }
        final Long _tmpExcersizeId;
        if (_cursor.isNull(_cursorIndexOfExcersizeId)) {
          _tmpExcersizeId = null;
        } else {
          _tmpExcersizeId = _cursor.getLong(_cursorIndexOfExcersizeId);
        }
        _result = new TrainingProfileExcersize(_tmpId,_tmpTrainingProfileId,_tmpExcersizeId);
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
