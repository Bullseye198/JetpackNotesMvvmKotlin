package com.wiseassblog.jetpacknotesmvvmkotlin.core.injection.module.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'\u00a8\u0006\u0004"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/core/injection/module/ui/LoginUIModule;", "", "contributeLoginFragment", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/login/LoginFragment;", "android-ui_debug"})
@dagger.Module()
public abstract interface LoginUIModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.wiseassblog.jetpacknotesmvvmkotlin.login.LoginFragment contributeLoginFragment();
}