package com.wiseassblog.jetpacknotesmvvmkotlin.note;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\n\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0002H\u0016R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/NoteListViewModel;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/common/BaseViewModel;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notelist/NoteListEvent;", "onGetNotesUseCase", "Lcom/example/domain/usecases/OnGetNotesUseCase;", "onDeleteAllNotesUseCase", "Lcom/example/domain/usecases/OnDeleteAllNotesUseCase;", "uiContext", "Lcom/example/domain/AppCoroutineDispatchers;", "(Lcom/example/domain/usecases/OnGetNotesUseCase;Lcom/example/domain/usecases/OnDeleteAllNotesUseCase;Lcom/example/domain/AppCoroutineDispatchers;)V", "editNote", "Landroidx/lifecycle/LiveData;", "", "getEditNote", "()Landroidx/lifecycle/LiveData;", "editNoteState", "Landroidx/lifecycle/MutableLiveData;", "noteList", "", "Lcom/example/domain/note/model/Note;", "getNoteList", "noteListState", "deleteAllNotes", "Lkotlinx/coroutines/Job;", "", "position", "", "getNotes", "handleEvent", "event", "android-ui_debug"})
public final class NoteListViewModel extends com.wiseassblog.jetpacknotesmvvmkotlin.common.BaseViewModel<com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist.NoteListEvent> {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.domain.note.model.Note>> noteListState = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> editNoteState = null;
    private final com.example.domain.usecases.OnGetNotesUseCase onGetNotesUseCase = null;
    private final com.example.domain.usecases.OnDeleteAllNotesUseCase onDeleteAllNotesUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.domain.note.model.Note>> getNoteList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getEditNote() {
        return null;
    }
    
    @java.lang.Override()
    public void handleEvent(@org.jetbrains.annotations.NotNull()
    com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist.NoteListEvent event) {
    }
    
    private final void editNote(int position) {
    }
    
    private final kotlinx.coroutines.Job getNotes() {
        return null;
    }
    
    private final kotlinx.coroutines.Job deleteAllNotes() {
        return null;
    }
    
    @javax.inject.Inject()
    public NoteListViewModel(@org.jetbrains.annotations.NotNull()
    com.example.domain.usecases.OnGetNotesUseCase onGetNotesUseCase, @org.jetbrains.annotations.NotNull()
    com.example.domain.usecases.OnDeleteAllNotesUseCase onDeleteAllNotesUseCase, @org.jetbrains.annotations.NotNull()
    com.example.domain.AppCoroutineDispatchers uiContext) {
        super(null);
    }
}