package com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\'\u00a8\u0006\r"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/dependencyInjection/AppDataModule;", "", "bindCoroutineCOntext", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "bindINoteRepository", "Lcom/example/domain/note/INoteRepository;", "noteRepoImpl", "Lcom/example/data/note/NoteRepoImpl;", "bindIUserRepository", "Lcom/example/domain/user/IUserRepository;", "firebaseUserRepoImpl", "Lcom/example/data/firebase/FirebaseUserRepoImpl;", "android-ui_debug"})
@dagger.Module()
public abstract interface AppDataModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.example.domain.note.INoteRepository bindINoteRepository(@org.jetbrains.annotations.NotNull()
    com.example.data.note.NoteRepoImpl noteRepoImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract kotlin.coroutines.CoroutineContext bindCoroutineCOntext(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext coroutineContext);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.example.domain.user.IUserRepository bindIUserRepository(@org.jetbrains.annotations.NotNull()
    com.example.data.firebase.FirebaseUserRepoImpl firebaseUserRepoImpl);
}