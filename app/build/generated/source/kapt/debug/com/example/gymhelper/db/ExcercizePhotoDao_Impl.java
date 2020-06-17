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
public final class ExcercizePhotoDao_Impl implements ExcercizePhotoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfExcersizePhoto;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfExcersizePhoto;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  private final SharedSQLiteStatement __preparedStmtOfDeleteByExersizeId;

  public ExcercizePhotoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfExcersizePhoto = new EntityInsertionAdapter<ExcersizePhoto>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `ExcersizePhoto`(`Id`,`ExcersizeId`,`PhotoId`) VALUES (nullif(?, 0),?,?)";
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
  public void insert(ExcersizePhoto excersizePhoto) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfExcersizePhoto.insert(excersizePhoto);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(ExcersizePhoto excersizePhoto) {
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
  public void deleteByExersizeId(long exId) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteByExersizeId.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, exId);
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
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("Id");
      final int _cursorIndexOfExcersizeId = _cursor.getColumnIndexOrThrow("ExcersizeId");
      final int _cursorIndexOfPhotoId = _cursor.getColumnIndexOrThrow("PhotoId");
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
  public List<ExcersizePhoto> getByExcersizeId(long excersizeId) {
    final String _sql = "SELECT *FROM ExcersizePhoto WHERE ExcersizeId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, excersizeId);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("Id");
      final int _cursorIndexOfExcersizeId = _cursor.getColumnIndexOrThrow("ExcersizeId");
      final int _cursorIndexOfPhotoId = _cursor.getColumnIndexOrThrow("PhotoId");
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
