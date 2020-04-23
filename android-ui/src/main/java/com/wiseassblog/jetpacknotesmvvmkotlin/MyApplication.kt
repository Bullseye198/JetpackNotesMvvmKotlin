package com.wiseassblog.jetpacknotesmvvmkotlin

import com.google.firebase.FirebaseApp
import com.wiseassblog.jetpacknotesmvvmkotlin.core.injection.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.HasAndroidInjector

class MyApplication: DaggerApplication(), HasAndroidInjector {


    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory().create(this)
    }
}