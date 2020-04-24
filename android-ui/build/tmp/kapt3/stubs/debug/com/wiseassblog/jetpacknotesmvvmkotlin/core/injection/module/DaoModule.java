package com.wiseassblog.jetpacknotesmvvmkotlin.core.injection.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/core/injection/module/DaoModule;", "", "()V", "provideNoteDao", "Lcom/example/data/NoteDao;", "roomNoteDatabase", "Lcom/example/data/RoomNoteDatabase;", "android-ui_debug"})
@dagger.Module()
public final class DaoModule {
    public static final com.wiseassblog.jetpacknotesmvvmkotlin.core.injection.module.DaoModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.data.NoteDao provideNoteDao(@org.jetbrains.annotations.NotNull()
    com.example.data.RoomNoteDatabase roomNoteDatabase) {
        return null;
    }
    
    private DaoModule() {
        super();
    }
}