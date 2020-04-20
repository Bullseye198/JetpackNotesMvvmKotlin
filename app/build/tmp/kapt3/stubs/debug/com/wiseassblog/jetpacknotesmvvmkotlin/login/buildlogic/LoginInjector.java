package com.wiseassblog.jetpacknotesmvvmkotlin.login.buildlogic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/login/buildlogic/LoginInjector;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getUserRepository", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/repository/IUserRepository;", "provideUserViewModelFactory", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/login/buildlogic/UserViewModelFactory;", "app_debug"})
public final class LoginInjector extends androidx.lifecycle.AndroidViewModel {
    
    private final com.wiseassblog.jetpacknotesmvvmkotlin.model.repository.IUserRepository getUserRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.wiseassblog.jetpacknotesmvvmkotlin.login.buildlogic.UserViewModelFactory provideUserViewModelFactory() {
        return null;
    }
    
    public LoginInjector(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}