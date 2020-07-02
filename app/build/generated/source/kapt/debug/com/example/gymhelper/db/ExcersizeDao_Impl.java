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
public final class ExcersizeDao_Impl implements ExcersizeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Excersize> __insertionAdapterOfExcersize;

  private final EntityDeletionOrUpdateAdapter<Excersize> __deletionAdapterOfExcersize;

  private final EntityDeletionOrUpdateAdapter<Excersize> __updateAdapterOfExcersize;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  public ExcersizeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfExcersize = new EntityInsertionAdapter<Excersize>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Excersizes` (`ExcersizeId`,`Name`,`Group`,`Subgroup`,`Description`,`Level`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Excersize value) {
        stmt.bindLong(1, value.getExcersizeId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getGroup() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getGroup());
        }
        if (value.getSubgroup() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSubgroup());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDescription());
        }
        if (value.getLevel() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getLevel());
        }
      }
    };
    this.__deletionAdapterOfExcersize = new EntityDeletionOrUpdateAdapter<Excersize>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Excersizes` WHERE `ExcersizeId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Excersize value) {
        stmt.bindLong(1, value.getExcersizeId());
      }
    };
    this.__updateAdapterOfExcersize = new EntityDeletionOrUpdateAdapter<Excersize>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Excersizes` SET `ExcersizeId` = ?,`Name` = ?,`Group` = ?,`Subgroup` = ?,`Description` = ?,`Level` = ? WHERE `ExcersizeId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Excersize value) {
        stmt.bindLong(1, value.getExcersizeId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getGroup() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getGroup());
        }
        if (value.getSubgroup() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSubgroup());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDescription());
        }
        if (value.getLevel() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getLevel());
        }
        stmt.bindLong(7, value.getExcersizeId());
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Excersizes";
        return _query;
      }
    };
  }

  @Override
  public Long insert(final Excersize excersize) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfExcersize.insertAndReturnId(excersize);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int delete(final Excersize excersize) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfExcersize.handle(excersize);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Excersize excersize) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfExcersize.handle(excersize);
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
  public Excersize get(final Long id) {
    final String _sql = "SELECT * FROM Excersizes WHERE ExcersizeId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, id);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfExcersizeId = CursorUtil.getColumnIndexOrThrow(_cursor, "ExcersizeId");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "Name");
      final int _cursorIndexOfGroup = CursorUtil.getColumnIndexOrThrow(_cursor, "Group");
      final int _cursorIndexOfSubgroup = CursorUtil.getColumnIndexOrThrow(_cursor, "Subgroup");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "Description");
      final int _cursorIndexOfLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "Level");
      final Excersize _result;
      if(_cursor.moveToFirst()) {
        final long _tmpExcersizeId;
        _tmpExcersizeId = _cursor.getLong(_cursorIndexOfExcersizeId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpGroup;
        _tmpGroup = _cursor.getString(_cursorIndexOfGroup);
        final String _tmpSubgroup;
        _tmpSubgroup = _cursor.getString(_cursorIndexOfSubgroup);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpLevel;
        _tmpLevel = _cursor.getString(_cursorIndexOfLevel);
        _result = new Excersize(_tmpExcersizeId,_tmpName,_tmpGroup,_tmpSubgroup,_tmpDescription,_tmpLevel);
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
  public List<Excersize> getAll() {
    final String _sql = "SELECT * FROM Excersizes";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfExcersizeId = CursorUtil.getColumnIndexOrThrow(_cursor, "ExcersizeId");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "Name");
      final int _cursorIndexOfGroup = CursorUtil.getColumnIndexOrThrow(_cursor, "Group");
      final int _cursorIndexOfSubgroup = CursorUtil.getColumnIndexOrThrow(_cursor, "Subgroup");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "Description");
      final int _cursorIndexOfLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "Level");
      final List<Excersize> _result = new ArrayList<Excersize>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Excersize _item;
        final long _tmpExcersizeId;
        _tmpExcersizeId = _cursor.getLong(_cursorIndexOfExcersizeId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpGroup;
        _tmpGroup = _cursor.getString(_cursorIndexOfGroup);
        final String _tmpSubgroup;
        _tmpSubgroup = _cursor.getString(_cursorIndexOfSubgroup);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpLevel;
        _tmpLevel = _cursor.getString(_cursorIndexOfLevel);
        _item = new Excersize(_tmpExcersizeId,_tmpName,_tmpGroup,_tmpSubgroup,_tmpDescription,_tmpLevel);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
