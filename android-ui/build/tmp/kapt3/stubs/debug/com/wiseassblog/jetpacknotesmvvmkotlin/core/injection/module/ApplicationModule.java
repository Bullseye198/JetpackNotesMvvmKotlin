package com.wiseassblog.jetpacknotesmvvmkotlin.core.injection.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/core/injection/module/ApplicationModule;", "", "()V", "provideCoroutineDispatchers", "Lcom/example/domain/AppCoroutineDispatchers;", "provideRoomNoteDatabase", "Lcom/example/data/RoomNoteDatabase;", "applicationContext", "Landroid/content/Context;", "android-ui_debug"})
@dagger.Module()
public final class ApplicationModule {
    public static final com.wiseassblog.jetpacknotesmvvmkotlin.core.injection.module.ApplicationModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.data.RoomNoteDatabase provideRoomNoteDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context applicationContext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.domain.AppCoroutineDispatchers provideCoroutineDispatchers() {
        return null;
    }
    
    private ApplicationModule() {
        super();
    }
}