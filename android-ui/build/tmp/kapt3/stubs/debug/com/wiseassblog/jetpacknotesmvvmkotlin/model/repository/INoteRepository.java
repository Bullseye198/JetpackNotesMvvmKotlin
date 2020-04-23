package com.wiseassblog.jetpacknotesmvvmkotlin.model.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ)\u0010\n\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000b\u001a\u00020\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\'\u0010\u000e\u001a\u0018\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J)\u0010\u0011\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/repository/INoteRepository;", "", "deleteNote", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/common/Result;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "note", "Lcom/example/domain/note/Note;", "(Lcom/example/domain/note/Note;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNoteById", "noteId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNotes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateNote", "app_debug"})
public abstract interface INoteRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getNoteById(@org.jetbrains.annotations.NotNull()
    java.lang.String noteId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wiseassblog.jetpacknotesmvvmkotlin.common.Result<? extends java.lang.Exception, com.example.domain.note.Note>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getNotes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wiseassblog.jetpacknotesmvvmkotlin.common.Result<? extends java.lang.Exception, ? extends java.util.List<com.example.domain.note.Note>>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteNote(@org.jetbrains.annotations.NotNull()
    com.example.domain.note.Note note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wiseassblog.jetpacknotesmvvmkotlin.common.Result<? extends java.lang.Exception, kotlin.Unit>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateNote(@org.jetbrains.annotations.NotNull()
    com.example.domain.note.Note note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wiseassblog.jetpacknotesmvvmkotlin.common.Result<? extends java.lang.Exception, kotlin.Unit>> p1);
}