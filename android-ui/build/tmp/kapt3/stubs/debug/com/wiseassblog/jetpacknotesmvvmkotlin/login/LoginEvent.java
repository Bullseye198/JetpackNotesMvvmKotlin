package com.wiseassblog.jetpacknotesmvvmkotlin.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/login/LoginEvent;", "T", "", "()V", "OnAuthButtonClick", "OnGoogleSignInResult", "OnStart", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/login/LoginEvent$OnAuthButtonClick;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/login/LoginEvent$OnStart;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/login/LoginEvent$OnGoogleSignInResult;", "android-ui_debug"})
public abstract class LoginEvent<T extends java.lang.Object> {
    
    private LoginEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/login/LoginEvent$OnAuthButtonClick;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/login/LoginEvent;", "", "()V", "android-ui_debug"})
    public static final class OnAuthButtonClick extends com.wiseassblog.jetpacknotesmvvmkotlin.login.LoginEvent {
        public static final com.wiseassblog.jetpacknotesmvvmkotlin.login.LoginEvent.OnAuthButtonClick INSTANCE = null;
        
        private OnAuthButtonClick() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/login/LoginEvent$OnStart;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/login/LoginEvent;", "", "()V", "android-ui_debug"})
    public static final class OnStart extends com.wiseassblog.jetpacknotesmvvmkotlin.login.LoginEvent {
        public static final com.wiseassblog.jetpacknotesmvvmkotlin.login.LoginEvent.OnStart INSTANCE = null;
        
        private OnStart() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0013\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/login/LoginEvent$OnGoogleSignInResult;", "LoginResult", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/login/LoginEvent;", "result", "(Ljava/lang/Object;)V", "getResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/wiseassblog/jetpacknotesmvvmkotlin/login/LoginEvent$OnGoogleSignInResult;", "equals", "", "other", "", "hashCode", "", "toString", "", "android-ui_debug"})
    public static final class OnGoogleSignInResult<LoginResult extends java.lang.Object> extends com.wiseassblog.jetpacknotesmvvmkotlin.login.LoginEvent<LoginResult> {
        private final LoginResult result = null;
        
        public final LoginResult getResult() {
            return null;
        }
        
        public OnGoogleSignInResult(LoginResult result) {
            super();
        }
        
        public final LoginResult component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wiseassblog.jetpacknotesmvvmkotlin.login.LoginEvent.OnGoogleSignInResult<LoginResult> copy(LoginResult result) {
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