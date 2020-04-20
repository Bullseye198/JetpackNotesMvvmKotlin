package com.wiseassblog.jetpacknotesmvvmkotlin.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010!R\u0014\u0010\u0007\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u000eR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0010X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\t\u00a8\u0006\""}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/common/BaseViewModel;", "T", "Landroidx/lifecycle/ViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "coroutineContext", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "error", "Landroidx/lifecycle/LiveData;", "", "getError", "()Landroidx/lifecycle/LiveData;", "errorState", "Landroidx/lifecycle/MutableLiveData;", "getErrorState", "()Landroidx/lifecycle/MutableLiveData;", "jobTracker", "Lkotlinx/coroutines/Job;", "getJobTracker", "()Lkotlinx/coroutines/Job;", "setJobTracker", "(Lkotlinx/coroutines/Job;)V", "loading", "", "getLoading", "loadingState", "getLoadingState", "getUiContext", "handleEvent", "event", "(Ljava/lang/Object;)V", "app_debug"})
public abstract class BaseViewModel<T extends java.lang.Object> extends androidx.lifecycle.ViewModel implements kotlinx.coroutines.CoroutineScope {
    @org.jetbrains.annotations.NotNull()
    protected kotlinx.coroutines.Job jobTracker;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> loadingState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.coroutines.CoroutineContext uiContext = null;
    
    public abstract void handleEvent(T event);
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlinx.coroutines.Job getJobTracker() {
        return null;
    }
    
    protected final void setJobTracker(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.Job p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.lifecycle.MutableLiveData<kotlin.Unit> getLoadingState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Unit> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlin.coroutines.CoroutineContext getUiContext() {
        return null;
    }
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext uiContext) {
        super();
    }
}