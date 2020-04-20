package com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H!\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH!\u00a2\u0006\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/dependencyInjection/ViewModelModule;", "", "()V", "MainActivityViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/userInterface/MainActivityViewModel;", "MainActivityViewModel$app_debug", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/dependencyInjection/ViewModelFactory;", "bindViewModelFactory$app_debug", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory$app_debug(@org.jetbrains.annotations.NotNull()
    com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection.ViewModelFactory factory);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.wiseassblog.jetpacknotesmvvmkotlin.userInterface.MainActivityViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel MainActivityViewModel$app_debug(@org.jetbrains.annotations.NotNull()
    com.wiseassblog.jetpacknotesmvvmkotlin.userInterface.MainActivityViewModel viewModel);
    
    public ViewModelModule() {
        super();
    }
}