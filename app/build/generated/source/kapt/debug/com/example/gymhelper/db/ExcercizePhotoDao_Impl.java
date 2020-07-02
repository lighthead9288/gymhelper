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
public final class ExcercizePhotoDao_Impl implements ExcercizePhotoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ExcersizePhoto> __insertionAdapterOfExcersizePhoto;

  private final EntityDeletionOrUpdateAdapter<ExcersizePhoto> __deletionAdapterOfExcersizePhoto;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  private final SharedSQLiteStatement __preparedStmtOfDeleteByExersizeId;

  public ExcercizePhotoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfExcersizePhoto = new EntityInsertionAdapter<ExcersizePhoto>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `ExcersizePhoto` (`Id`,`ExcersizeId`,`PhotoId`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ExcersizePhoto value) {
        stmt.bindLong(1, value.getId());
        if (value.getExcersizeId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getExcersizeId());
        }
        if (value.getPhotoId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getPhotoId());
        }
      }
    };
    this.__deletionAdapterOfExcersizePhoto = new EntityDeletionOrUpdateAdapter<ExcersizePhoto>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `ExcersizePhoto` WHERE `Id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ExcersizePhoto value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM ExcersizePhoto";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteByExersizeId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM ExcersizePhoto WHERE ExcersizeId=?";
        return _query;
      }
    };
  }

  @Override
  public void insert(final ExcersizePhoto excersizePhoto) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfExcersizePhoto.insert(excersizePhoto);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final ExcersizePhoto excersizePhoto) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfExcersizePhoto.handle(excersizePhoto);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void clear() {
    __db.assertNotSuspendingTransaction();
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
  public void deleteByExersizeId(final long exId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteByExersizeId.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, exId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteByExersizeId.release(_stmt);
    }
  }

  @Override
  public List<ExcersizePhoto> getAll() {
    final String _sql = "SELECT * FROM ExcersizePhoto";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "Id");
      final int _cursorIndexOfExcersizeId = CursorUtil.getColumnIndexOrThrow(_cursor, "ExcersizeId");
      final int _cursorIndexOfPhotoId = CursorUtil.getColumnIndexOrThrow(_cursor, "PhotoId");
      final List<ExcersizePhoto> _result = new ArrayList<ExcersizePhoto>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ExcersizePhoto _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final Long _tmpExcersizeId;
        if (_cursor.isNull(_cursorIndexOfExcersizeId)) {
          _tmpExcersizeId = null;
        } else {
          _tmpExcersizeId = _cursor.getLong(_cursorIndexOfExcersizeId);
        }
        final Long _tmpPhotoId;
        if (_cursor.isNull(_cursorIndexOfPhotoId)) {
          _tmpPhotoId = null;
        } else {
          _tmpPhotoId = _cursor.getLong(_cursorIndexOfPhotoId);
        }
        _item = new ExcersizePhoto(_tmpId,_tmpExcersizeId,_tmpPhotoId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<ExcersizePhoto> getByExcersizeId(final long excersizeId) {
    final String _sql = "SELECT *FROM ExcersizePhoto WHERE ExcersizeId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, excersizeId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "Id");
      final int _cursorIndexOfExcersizeId = CursorUtil.getColumnIndexOrThrow(_cursor, "ExcersizeId");
      final int _cursorIndexOfPhotoId = CursorUtil.getColumnIndexOrThrow(_cursor, "PhotoId");
      final List<ExcersizePhoto> _result = new ArrayList<ExcersizePhoto>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ExcersizePhoto _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final Long _tmpExcersizeId;
        if (_cursor.isNull(_cursorIndexOfExcersizeId)) {
          _tmpExcersizeId = null;
        } else {
          _tmpExcersizeId = _cursor.getLong(_cursorIndexOfExcersizeId);
        }
        final Long _tmpPhotoId;
        if (_cursor.isNull(_cursorIndexOfPhotoId)) {
          _tmpPhotoId = null;
        } else {
          _tmpPhotoId = _cursor.getLong(_cursorIndexOfPhotoId);
        }
        _item = new ExcersizePhoto(_tmpId,_tmpExcersizeId,_tmpPhotoId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
