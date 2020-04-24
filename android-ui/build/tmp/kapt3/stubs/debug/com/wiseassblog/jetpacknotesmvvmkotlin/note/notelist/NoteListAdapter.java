package com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0015\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eH\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notelist/NoteListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/domain/note/model/Note;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notelist/NoteListAdapter$NoteViewHolder;", "event", "Landroidx/lifecycle/MutableLiveData;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notelist/NoteListEvent;", "(Landroidx/lifecycle/MutableLiveData;)V", "getEvent", "()Landroidx/lifecycle/MutableLiveData;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "NoteViewHolder", "android-ui_debug"})
public final class NoteListAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.domain.note.model.Note, com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist.NoteListAdapter.NoteViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist.NoteListEvent> event = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist.NoteListAdapter.NoteViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist.NoteListAdapter.NoteViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist.NoteListEvent> getEvent() {
        return null;
    }
    
    public NoteListAdapter(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist.NoteListEvent> event) {
        super(null);
    }
    
    public NoteListAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notelist/NoteListAdapter$NoteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "root", "Landroid/view/View;", "(Landroid/view/View;)V", "content", "Landroid/widget/TextView;", "getContent", "()Landroid/widget/TextView;", "setContent", "(Landroid/widget/TextView;)V", "date", "getDate", "setDate", "android-ui_debug"})
    public static final class NoteViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView content;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView date;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getContent() {
            return null;
        }
        
        public final void setContent(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDate() {
            return null;
        }
        
        public final void setDate(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        public NoteViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View root) {
            super(null);
        }
    }
}