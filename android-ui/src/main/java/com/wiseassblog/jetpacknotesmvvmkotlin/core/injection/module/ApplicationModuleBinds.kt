package com.wiseassblog.jetpacknotesmvvmkotlin.core.injection.module

import com.wiseassblog.jetpacknotesmvvmkotlin.core.injection.module.ui.LoginUIModule
import com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection.NoteUIModule
import com.wiseassblog.jetpacknotesmvvmkotlin.login.LoginActivity
import com.wiseassblog.jetpacknotesmvvmkotlin.features.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ApplicationModuleBinds {

    @ContributesAndroidInjector(
        modules = [NoteUIModule::class]
    )
    fun contributeNoteActivity(): MainActivity

    @ContributesAndroidInjector(
        modules = [LoginUIModule::class]
    )
    fun contributeLoginActivity(): LoginActivity
}