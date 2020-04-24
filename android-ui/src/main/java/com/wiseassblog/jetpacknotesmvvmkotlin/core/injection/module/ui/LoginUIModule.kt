package com.wiseassblog.jetpacknotesmvvmkotlin.core.injection.module.ui

import com.wiseassblog.jetpacknotesmvvmkotlin.login.LoginFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface LoginUIModule {

    @ContributesAndroidInjector
    fun contributeLoginFragment(): LoginFragment

}