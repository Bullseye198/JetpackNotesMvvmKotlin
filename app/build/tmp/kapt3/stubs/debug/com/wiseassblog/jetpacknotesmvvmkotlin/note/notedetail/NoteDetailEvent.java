package com.wiseassblog.jetpacknotesmvvmkotlin.note.notedetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notedetail/NoteDetailEvent;", "", "()V", "OnDeleteClick", "OnDeleteConfirmed", "OnDoneClick", "OnStart", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notedetail/NoteDetailEvent$OnDoneClick;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notedetail/NoteDetailEvent$OnDeleteClick;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notedetail/NoteDetailEvent$OnDeleteConfirmed;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notedetail/NoteDetailEvent$OnStart;", "app_debug"})
public abstract class NoteDetailEvent {
    
    private NoteDetailEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notedetail/NoteDetailEvent$OnDoneClick;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notedetail/NoteDetailEvent;", "contents", "", "(Ljava/lang/String;)V", "getContents", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class OnDoneClick extends com.wiseassblog.jetpacknotesmvvmkotlin.note.notedetail.NoteDetailEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String contents = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getContents() {
            return null;
        }
        
        public OnDoneClick(@org.jetbrains.annotations.NotNull()
        java.lang.String contents) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wiseassblog.jetpacknotesmvvmkotlin.note.notedetail.NoteDetailEvent.OnDoneClick copy(@org.jetbrains.annotations.NotNull()
        java.lang.String contents) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notedetail/NoteDetailEvent$OnDeleteClick;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notedetail/NoteDetailEvent;", "()V", "app_debug"})
    public static final class OnDeleteClick extends com.wiseassblog.jetpacknotesmvvmkotlin.note.notedetail.NoteDetailEvent {
        public static final com.wiseassblog.jetpacknotesmvvmkotlin.note.notedetail.NoteDetailEvent.OnDeleteClick INSTANCE = null;
        
        private OnDeleteClick() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notedetail/NoteDetailEvent$OnDeleteConfirmed;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notedetail/NoteDetailEvent;", "()V", "app_debug"})
    public static final class OnDeleteConfirmed extends com.wiseassblog.jetpacknotesmvvmkotlin.note.notedetail.NoteDetailEvent {
        public static final com.wiseassblog.jetpacknotesmvvmkotlin.note.notedetail.NoteDetailEvent.OnDeleteConfirmed INSTANCE = null;
        
        private OnDeleteConfirmed() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notedetail/NoteDetailEvent$OnStart;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notedetail/NoteDetailEvent;", "noteId", "", "(Ljava/lang/String;)V", "getNoteId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class OnStart extends com.wiseassblog.jetpacknotesmvvmkotlin.note.notedetail.NoteDetailEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String noteId = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getNoteId() {
            return null;
        }
        
        public OnStart(@org.jetbrains.annotations.NotNull()
        java.lang.String noteId) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wiseassblog.jetpacknotesmvvmkotlin.note.notedetail.NoteDetailEvent.OnStart copy(@org.jetbrains.annotations.NotNull()
        java.lang.String noteId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}