package com.wiseassblog.jetpacknotesmvvmkotlin.model;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/NoteDao;", "", "deleteNote", "", "note", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/RoomNote;", "(Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/RoomNote;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNoteById", "creationDate", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNotes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertOrUpdateNote", "", "app_debug"})
public abstract interface NoteDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM notes")
    public abstract java.lang.Object getNotes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.wiseassblog.jetpacknotesmvvmkotlin.model.RoomNote>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM notes WHERE creation_date = :creationDate")
    public abstract java.lang.Object getNoteById(@org.jetbrains.annotations.NotNull()
    java.lang.String creationDate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wiseassblog.jetpacknotesmvvmkotlin.model.RoomNote> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteNote(@org.jetbrains.annotations.NotNull()
    com.wiseassblog.jetpacknotesmvvmkotlin.model.RoomNote note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertOrUpdateNote(@org.jetbrains.annotations.NotNull()
    com.wiseassblog.jetpacknotesmvvmkotlin.model.RoomNote note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> p1);
}