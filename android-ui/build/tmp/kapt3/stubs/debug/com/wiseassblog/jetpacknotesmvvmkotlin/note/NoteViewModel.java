package com.wiseassblog.jetpacknotesmvvmkotlin.note;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u0015\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u001cH\u0002J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u001bH\u0002R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/NoteViewModel;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/common/BaseViewModel;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notedetail/NoteDetailEvent;", "onDeleteNoteUseCase", "Lcom/example/domain/usecases/OnDeleteNoteUseCase;", "onUpdateNoteUseCase", "Lcom/example/domain/usecases/OnUpdateNoteUseCase;", "onGetNoteByIdUseCase", "Lcom/example/domain/usecases/OnGetNoteByIdUseCase;", "coroutineDispatchers", "Lcom/example/domain/AppCoroutineDispatchers;", "(Lcom/example/domain/usecases/OnDeleteNoteUseCase;Lcom/example/domain/usecases/OnUpdateNoteUseCase;Lcom/example/domain/usecases/OnGetNoteByIdUseCase;Lcom/example/domain/AppCoroutineDispatchers;)V", "deleted", "Landroidx/lifecycle/LiveData;", "", "getDeleted", "()Landroidx/lifecycle/LiveData;", "deletedState", "Landroidx/lifecycle/MutableLiveData;", "note", "Lcom/example/domain/note/model/Note;", "getNote", "noteState", "updated", "getUpdated", "updatedState", "getCalendarTime", "", "Lkotlinx/coroutines/Job;", "noteId", "handleEvent", "", "event", "newNote", "onDelete", "updateNote", "contents", "android-ui_debug"})
public final class NoteViewModel extends com.wiseassblog.jetpacknotesmvvmkotlin.common.BaseViewModel<com.wiseassblog.jetpacknotesmvvmkotlin.note.notedetail.NoteDetailEvent> {
    private final androidx.lifecycle.MutableLiveData<com.example.domain.note.model.Note> noteState = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> deletedState = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> updatedState = null;
    private final com.example.domain.usecases.OnDeleteNoteUseCase onDeleteNoteUseCase = null;
    private final com.example.domain.usecases.OnUpdateNoteUseCase onUpdateNoteUseCase = null;
    private final com.example.domain.usecases.OnGetNoteByIdUseCase onGetNoteByIdUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.domain.note.model.Note> getNote() {
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
    
    @javax.inject.Inject()
    public NoteViewModel(@org.jetbrains.annotations.NotNull()
    com.example.domain.usecases.OnDeleteNoteUseCase onDeleteNoteUseCase, @org.jetbrains.annotations.NotNull()
    com.example.domain.usecases.OnUpdateNoteUseCase onUpdateNoteUseCase, @org.jetbrains.annotations.NotNull()
    com.example.domain.usecases.OnGetNoteByIdUseCase onGetNoteByIdUseCase, @org.jetbrains.annotations.NotNull()
    com.example.domain.AppCoroutineDispatchers coroutineDispatchers) {
        super(null);
    }
}