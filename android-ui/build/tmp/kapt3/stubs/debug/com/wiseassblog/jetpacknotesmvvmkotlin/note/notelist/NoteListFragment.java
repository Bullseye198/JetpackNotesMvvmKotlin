package com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0002J\u0012\u0010\u001a\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u000eH\u0002J\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001cH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006 "}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notelist/NoteListFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "adapter", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/notelist/NoteListAdapter;", "viewModel", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/note/NoteListViewModel;", "viewModelFactory", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/dependencyInjection/ViewModelFactory;", "getViewModelFactory", "()Lcom/wiseassblog/jetpacknotesmvvmkotlin/dependencyInjection/ViewModelFactory;", "setViewModelFactory", "(Lcom/wiseassblog/jetpacknotesmvvmkotlin/dependencyInjection/ViewModelFactory;)V", "observeViewModel", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onStart", "setUpAdapter", "showErrorState", "errorMessage", "", "showLoadingState", "startNoteDetailWithArgs", "noteId", "android-ui_debug"})
public final class NoteListFragment extends dagger.android.support.DaggerFragment {
    private com.wiseassblog.jetpacknotesmvvmkotlin.note.NoteListViewModel viewModel;
    private com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist.NoteListAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection.ViewModelFactory viewModelFactory;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    private final void setUpAdapter() {
    }
    
    private final void observeViewModel() {
    }
    
    private final void startNoteDetailWithArgs(java.lang.String noteId) {
    }
    
    private final void showErrorState(java.lang.String errorMessage) {
    }
    
    private final void showLoadingState() {
    }
    
    public NoteListFragment() {
        super();
    }
}