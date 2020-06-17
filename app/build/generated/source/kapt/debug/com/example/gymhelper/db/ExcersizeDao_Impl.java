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
public final class ExcersizeDao_Impl implements ExcersizeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfExcersize;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfExcersize;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfExcersize;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  public ExcersizeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfExcersize = new EntityInsertionAdapter<Excersize>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Excersizes`(`ExcersizeId`,`Name`,`Group`,`Subgroup`,`Description`,`Level`) VALUES (nullif(?, 0),?,?,?,?,?)";
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
  public Long insert(Excersize excersize) {
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
  public int delete(Excersize excersize) {
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
  public void update(Excersize excersize) {
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
  public Excersize get(Long id) {
    final String _sql = "SELECT * FROM Excersizes WHERE ExcersizeId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, id);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfExcersizeId = _cursor.getColumnIndexOrThrow("ExcersizeId");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("Name");
      final int _cursorIndexOfGroup = _cursor.getColumnIndexOrThrow("Group");
      final int _cursorIndexOfSubgroup = _cursor.getColumnIndexOrThrow("Subgroup");
      final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("Description");
      final int _cursorIndexOfLevel = _cursor.getColumnIndexOrThrow("Level");
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
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfExcersizeId = _cursor.getColumnIndexOrThrow("ExcersizeId");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("Name");
      final int _cursorIndexOfGroup = _cursor.getColumnIndexOrThrow("Group");
      final int _cursorIndexOfSubgroup = _cursor.getColumnIndexOrThrow("Subgroup");
      final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("Description");
      final int _cursorIndexOfLevel = _cursor.getColumnIndexOrThrow("Level");
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
