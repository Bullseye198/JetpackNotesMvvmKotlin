package com.wiseassblog.jetpacknotesmvvmkotlin.note;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u0011\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0019H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u001aH\u0002J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u0019H\u0002R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/NoteViewModel;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/common/BaseViewModel;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notedetail/NoteDetailEvent;", "noteRepo", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/repository/INoteRepository;", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/repository/INoteRepository;Lkotlin/coroutines/CoroutineContext;)V", "deleted", "Landroidx/lifecycle/LiveData;", "", "getDeleted", "()Landroidx/lifecycle/LiveData;", "deletedState", "Landroidx/lifecycle/MutableLiveData;", "note", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/Note;", "getNote", "getNoteRepo", "()Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/repository/INoteRepository;", "noteState", "updated", "getUpdated", "updatedState", "getCalendarTime", "", "Lkotlinx/coroutines/Job;", "noteId", "handleEvent", "", "event", "newNote", "onDelete", "updateNote", "contents", "app_debug"})
public final class NoteViewModel extends com.wiseassblog.jetpacknotesmvvmkotlin.common.BaseViewModel<com.wiseassblog.jetpacknotesmvvmkotlin.note.notedetail.NoteDetailEvent> {
    private final androidx.lifecycle.MutableLiveData<com.wiseassblog.jetpacknotesmvvmkotlin.model.Note> noteState = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> deletedState = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> updatedState = null;
    @org.jetbrains.annotations.NotNull()
    private final com.wiseassblog.jetpacknotesmvvmkotlin.model.repository.INoteRepository noteRepo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.wiseassblog.jetpacknotesmvvmkotlin.model.Note> getNote() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getDeleted() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getUpdated() {
        return null;
    }
    
    @java.lang.Override()
    public void handleEvent(@org.jetbrains.annotations.NotNull()
    com.wiseassblog.jetpacknotesmvvmkotlin.note.notedetail.NoteDetailEvent event) {
    }
    
    private final kotlinx.coroutines.Job onDelete() {
        return null;
    }
    
    private final kotlinx.coroutines.Job updateNote(java.lang.String contents) {
        return null;
    }
    
    private final kotlinx.coroutines.Job getNote(java.lang.String noteId) {
        return null;
    }
    
    private final void newNote() {
    }
    
    private final java.lang.String getCalendarTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.wiseassblog.jetpacknotesmvvmkotlin.model.repository.INoteRepository getNoteRepo() {
        return null;
    }
    
    public NoteViewModel(@org.jetbrains.annotations.NotNull()
    com.wiseassblog.jetpacknotesmvvmkotlin.model.repository.INoteRepository noteRepo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext uiContext) {
        super(null);
    }
}