package com.wiseassblog.jetpacknotesmvvmkotlin.common;

import java.lang.System;

/**
 * Result Wrapper <Left = Exception, Right = Value/Success>
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0006*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003:\u0003\u0005\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004\u0082\u0001\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/common/Result;", "E", "V", "", "()V", "Error", "Factory", "Value", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/common/Result$Value;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/common/Result$Error;", "app_debug"})
public abstract class Result<E extends java.lang.Object, V extends java.lang.Object> {
    public static final com.wiseassblog.jetpacknotesmvvmkotlin.common.Result.Factory Factory = null;
    
    private Result() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0002H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0002H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0013\u0010\u0004\u001a\u00028\u0002\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/common/Result$Value;", "V", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/common/Result;", "", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/wiseassblog/jetpacknotesmvvmkotlin/common/Result$Value;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Value<V extends java.lang.Object> extends com.wiseassblog.jetpacknotesmvvmkotlin.common.Result {
        private final V value = null;
        
        public final V getValue() {
            return null;
        }
        
        public Value(V value) {
            super();
        }
        
        public final V component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wiseassblog.jetpacknotesmvvmkotlin.common.Result.Value<V> copy(V value) {
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
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0002H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0002H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0013\u0010\u0004\u001a\u00028\u0002\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/common/Result$Error;", "E", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/common/Result;", "", "error", "(Ljava/lang/Object;)V", "getError", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/wiseassblog/jetpacknotesmvvmkotlin/common/Result$Error;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Error<E extends java.lang.Object> extends com.wiseassblog.jetpacknotesmvvmkotlin.common.Result {
        private final E error = null;
        
        public final E getError() {
            return null;
        }
        
        public Error(E error) {
            super();
        }
        
        public final E component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wiseassblog.jetpacknotesmvvmkotlin.common.Result.Error<E> copy(E error) {
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
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u0002H\u00070\u0004\"\u0004\b\u0002\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\tH\u0086\b\u00a8\u0006\n"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/common/Result$Factory;", "", "()V", "build", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/common/Result;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "V", "function", "Lkotlin/Function0;", "app_debug"})
    public static final class Factory {
        
        @org.jetbrains.annotations.NotNull()
        public final <V extends java.lang.Object>com.wiseassblog.jetpacknotesmvvmkotlin.common.Result<java.lang.Exception, V> build(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<? extends V> function) {
            return null;
        }
        
        private Factory() {
            super();
        }
    }
}