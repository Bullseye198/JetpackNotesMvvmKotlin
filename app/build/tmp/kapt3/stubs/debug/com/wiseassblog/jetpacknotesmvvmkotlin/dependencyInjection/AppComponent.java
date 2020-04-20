package com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/dependencyInjection/AppComponent;", "Ldagger/android/AndroidInjector;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/MyApplication;", "Factory", "app_debug"})
@dagger.Component(modules = {com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection.ApplicationModule.class, com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection.ViewModelModule.class, dagger.android.AndroidInjectionModule.class, com.example.data.injection.DataModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<com.wiseassblog.jetpacknotesmvvmkotlin.MyApplication> {
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/dependencyInjection/AppComponent$Factory;", "", "create", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/dependencyInjection/AppComponent;", "applicationContext", "Landroid/content/Context;", "app_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection.AppComponent create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        android.content.Context applicationContext);
    }
}