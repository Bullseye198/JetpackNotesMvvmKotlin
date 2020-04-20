package com.wiseassblog.jetpacknotesmvvmkotlin

import com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.HasAndroidInjector

class MyApplication: DaggerApplication(), HasAndroidInjector {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory().create(this)
    }
}