package com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/dependencyInjection/NoteUIModule;", "", "contributesNoteDetailView", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notedetail/NoteDetailView;", "contributesNoteListFragment", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notelist/NoteListFragment;", "android-ui_debug"})
@dagger.Module()
public abstract interface NoteUIModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist.NoteListFragment contributesNoteListFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.wiseassblog.jetpacknotesmvvmkotlin.note.notedetail.NoteDetailView contributesNoteDetailView();
}