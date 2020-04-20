package com.wiseassblog.jetpacknotesmvvmkotlin.model.implementations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0007\u001a\u0014\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ)\u0010\r\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000e0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/implementations/FirebaseUserRepoImpl;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/repository/IUserRepository;", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "(Lcom/google/firebase/auth/FirebaseAuth;)V", "getAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "getCurrentUser", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/common/Result;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/example/domain/user/User;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signInGoogleUser", "", "idToken", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signOutCurrentUser", "app_debug"})
public final class FirebaseUserRepoImpl implements com.wiseassblog.jetpacknotesmvvmkotlin.model.repository.IUserRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object signInGoogleUser(@org.jetbrains.annotations.NotNull()
    java.lang.String idToken, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wiseassblog.jetpacknotesmvvmkotlin.common.Result<? extends java.lang.Exception, kotlin.Unit>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object signOutCurrentUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wiseassblog.jetpacknotesmvvmkotlin.common.Result<? extends java.lang.Exception, kotlin.Unit>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCurrentUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wiseassblog.jetpacknotesmvvmkotlin.common.Result<? extends java.lang.Exception, com.example.domain.user.User>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.auth.FirebaseAuth getAuth() {
        return null;
    }
    
    public FirebaseUserRepoImpl(@org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.FirebaseAuth auth) {
        super();
    }
    
    public FirebaseUserRepoImpl() {
        super();
    }
}