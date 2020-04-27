package com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notelist/NoteListEvent;", "", "()V", "OnDelete", "OnNewNoteClick", "OnNoteItemClick", "OnStart", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notelist/NoteListEvent$OnNoteItemClick;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notelist/NoteListEvent$OnNewNoteClick;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notelist/NoteListEvent$OnStart;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notelist/NoteListEvent$OnDelete;", "android-ui_debug"})
public abstract class NoteListEvent {
    
    private NoteListEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notelist/NoteListEvent$OnNoteItemClick;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notelist/NoteListEvent;", "position", "", "(I)V", "getPosition", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "android-ui_debug"})
    public static final class OnNoteItemClick extends com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist.NoteListEvent {
        private final int position = 0;
        
        public final int getPosition() {
            return 0;
        }
        
        public OnNoteItemClick(int position) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist.NoteListEvent.OnNoteItemClick copy(int position) {
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
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notelist/NoteListEvent$OnNewNoteClick;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notelist/NoteListEvent;", "()V", "android-ui_debug"})
    public static final class OnNewNoteClick extends com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist.NoteListEvent {
        public static final com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist.NoteListEvent.OnNewNoteClick INSTANCE = null;
        
        private OnNewNoteClick() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notelist/NoteListEvent$OnStart;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notelist/NoteListEvent;", "()V", "android-ui_debug"})
    public static final class OnStart extends com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist.NoteListEvent {
        public static final com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist.NoteListEvent.OnStart INSTANCE = null;
        
        private OnStart() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notelist/NoteListEvent$OnDelete;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notelist/NoteListEvent;", "()V", "android-ui_debug"})
    public static final class OnDelete extends com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist.NoteListEvent {
        public static final com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist.NoteListEvent.OnDelete INSTANCE = null;
        
        private OnDelete() {
            super();
        }
    }
}