package com.wiseassblog.jetpacknotesmvvmkotlin.model.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u0014\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J)\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ!\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\t0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/repository/IUserRepository;", "", "getCurrentUser", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/common/Result;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/User;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signInGoogleUser", "", "idToken", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signOutCurrentUser", "app_debug"})
public abstract interface IUserRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCurrentUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wiseassblog.jetpacknotesmvvmkotlin.common.Result<? extends java.lang.Exception, com.wiseassblog.jetpacknotesmvvmkotlin.model.User>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object signOutCurrentUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wiseassblog.jetpacknotesmvvmkotlin.common.Result<? extends java.lang.Exception, kotlin.Unit>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object signInGoogleUser(@org.jetbrains.annotations.NotNull()
    java.lang.String idToken, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wiseassblog.jetpacknotesmvvmkotlin.common.Result<? extends java.lang.Exception, kotlin.Unit>> p1);
}