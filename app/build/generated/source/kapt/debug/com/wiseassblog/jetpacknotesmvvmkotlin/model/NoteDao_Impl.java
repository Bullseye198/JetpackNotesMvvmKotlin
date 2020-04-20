package com.wiseassblog.jetpacknotesmvvmkotlin.model;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NoteDao_Impl implements NoteDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RoomNote> __insertionAdapterOfRoomNote;

  private final EntityDeletionOrUpdateAdapter<RoomNote> __deletionAdapterOfRoomNote;

  public NoteDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRoomNote = new EntityInsertionAdapter<RoomNote>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `notes` (`creation_date`,`contents`,`up_votes`,`image_url`,`creator_id`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RoomNote value) {
        if (value.getCreationDate() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCreationDate());
        }
        if (value.getContents() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getContents());
        }
        stmt.bindLong(3, value.getUpVotes());
        if (value.getImageUrl() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getImageUrl());
        }
        if (value.getCreatorId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCreatorId());
        }
      }
    };
    this.__deletionAdapterOfRoomNote = new EntityDeletionOrUpdateAdapter<RoomNote>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `notes` WHERE `creation_date` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RoomNote value) {
        if (value.getCreationDate() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCreationDate());
        }
      }
    };
  }

  @Override
  public Object insertOrUpdateNote(final RoomNote note, final Continuation<? super Long> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfRoomNote.insertAndReturnId(note);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteNote(final RoomNote note, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfRoomNote.handle(note);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getNotes(final Continuation<? super List<RoomNote>> p0) {
    final String _sql = "SELECT * FROM notes";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<RoomNote>>() {
      @Override
      public List<RoomNote> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCreationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "creation_date");
          final int _cursorIndexOfContents = CursorUtil.getColumnIndexOrThrow(_cursor, "contents");
          final int _cursorIndexOfUpVotes = CursorUtil.getColumnIndexOrThrow(_cursor, "up_votes");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "image_url");
          final int _cursorIndexOfCreatorId = CursorUtil.getColumnIndexOrThrow(_cursor, "creator_id");
          final List<RoomNote> _result = new ArrayList<RoomNote>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final RoomNote _item;
            final String _tmpCreationDate;
            _tmpCreationDate = _cursor.getString(_cursorIndexOfCreationDate);
            final String _tmpContents;
            _tmpContents = _cursor.getString(_cursorIndexOfContents);
            final int _tmpUpVotes;
            _tmpUpVotes = _cursor.getInt(_cursorIndexOfUpVotes);
            final String _tmpImageUrl;
            _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
            final String _tmpCreatorId;
            _tmpCreatorId = _cursor.getString(_cursorIndexOfCreatorId);
            _item = new RoomNote(_tmpCreationDate,_tmpContents,_tmpUpVotes,_tmpImageUrl,_tmpCreatorId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getNoteById(final String creationDate, final Continuation<? super RoomNote> p1) {
    final String _sql = "SELECT * FROM notes WHERE creation_date = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (creationDate == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, creationDate);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<RoomNote>() {
      @Override
      public RoomNote call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCreationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "creation_date");
          final int _cursorIndexOfContents = CursorUtil.getColumnIndexOrThrow(_cursor, "contents");
          final int _cursorIndexOfUpVotes = CursorUtil.getColumnIndexOrThrow(_cursor, "up_votes");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "image_url");
          final int _cursorIndexOfCreatorId = CursorUtil.getColumnIndexOrThrow(_cursor, "creator_id");
          final RoomNote _result;
          if(_cursor.moveToFirst()) {
            final String _tmpCreationDate;
            _tmpCreationDate = _cursor.getString(_cursorIndexOfCreationDate);
            final String _tmpContents;
            _tmpContents = _cursor.getString(_cursorIndexOfContents);
            final int _tmpUpVotes;
            _tmpUpVotes = _cursor.getInt(_cursorIndexOfUpVotes);
            final String _tmpImageUrl;
            _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
            final String _tmpCreatorId;
            _tmpCreatorId = _cursor.getString(_cursorIndexOfCreatorId);
            _result = new RoomNote(_tmpCreationDate,_tmpContents,_tmpUpVotes,_tmpImageUrl,_tmpCreatorId);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }
}
