package com.wiseassblog.jetpacknotesmvvmkotlin.core.injection.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/core/injection/module/ApplicationModuleBinds;", "", "contributeLoginActivity", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/login/LoginActivity;", "contributeNoteActivity", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/features/main/MainActivity;", "android-ui_debug"})
@dagger.Module()
public abstract interface ApplicationModuleBinds {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection.NoteUIModule.class})
    public abstract com.wiseassblog.jetpacknotesmvvmkotlin.features.main.MainActivity contributeNoteActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.wiseassblog.jetpacknotesmvvmkotlin.core.injection.module.ui.LoginUIModule.class})
    public abstract com.wiseassblog.jetpacknotesmvvmkotlin.login.LoginActivity contributeLoginActivity();
}