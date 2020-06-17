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
public final class PhotoDao_Impl implements PhotoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfPhoto;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfPhoto;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfPhoto;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  public PhotoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPhoto = new EntityInsertionAdapter<Photo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Photos`(`PhotoId`,`Path`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Photo value) {
        stmt.bindLong(1, value.getPhotoId());
        if (value.getPath() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPath());
        }
      }
    };
    this.__deletionAdapterOfPhoto = new EntityDeletionOrUpdateAdapter<Photo>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Photos` WHERE `PhotoId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Photo value) {
        stmt.bindLong(1, value.getPhotoId());
      }
    };
    this.__updateAdapterOfPhoto = new EntityDeletionOrUpdateAdapter<Photo>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Photos` SET `PhotoId` = ?,`Path` = ? WHERE `PhotoId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Photo value) {
        stmt.bindLong(1, value.getPhotoId());
        if (value.getPath() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPath());
        }
        stmt.bindLong(3, value.getPhotoId());
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Photos";
        return _query;
      }
    };
  }

  @Override
  public Long insert(Photo photo) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfPhoto.insertAndReturnId(photo);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int delete(Photo photo) {
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfPhoto.handle(photo);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(Photo photo) {
    __db.beginTransaction();
    try {
      __updateAdapterOfPhoto.handle(photo);
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
  public Photo get(Long id) {
    final String _sql = "SELECT * FROM Photos WHERE PhotoId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, id);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfPhotoId = _cursor.getColumnIndexOrThrow("PhotoId");
      final int _cursorIndexOfPath = _cursor.getColumnIndexOrThrow("Path");
      final Photo _result;
      if(_cursor.moveToFirst()) {
        final long _tmpPhotoId;
        _tmpPhotoId = _cursor.getLong(_cursorIndexOfPhotoId);
        final String _tmpPath;
        _tmpPath = _cursor.getString(_cursorIndexOfPath);
        _result = new Photo(_tmpPhotoId,_tmpPath);
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
  public List<Photo> getAll() {
    final String _sql = "SELECT * FROM Photos";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfPhotoId = _cursor.getColumnIndexOrThrow("PhotoId");
      final int _cursorIndexOfPath = _cursor.getColumnIndexOrThrow("Path");
      final List<Photo> _result = new ArrayList<Photo>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Photo _item;
        final long _tmpPhotoId;
        _tmpPhotoId = _cursor.getLong(_cursorIndexOfPhotoId);
        final String _tmpPath;
        _tmpPath = _cursor.getString(_cursorIndexOfPath);
        _item = new Photo(_tmpPhotoId,_tmpPath);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
