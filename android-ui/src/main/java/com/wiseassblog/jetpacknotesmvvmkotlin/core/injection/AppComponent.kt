package com.wiseassblog.jetpacknotesmvvmkotlin.core.injection

import android.content.Context
import com.example.data.injection.DataModule
import com.wiseassblog.jetpacknotesmvvmkotlin.MyApplication
import com.wiseassblog.jetpacknotesmvvmkotlin.core.injection.module.ApplicationModuleBinds
import com.wiseassblog.jetpacknotesmvvmkotlin.core.injection.module.ApplicationModule
import com.wiseassblog.jetpacknotesmvvmkotlin.core.injection.module.DaoModule
import com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        ApplicationModuleBinds::class,
        ViewModelModule::class,
        AndroidInjectionModule::class,
        DataModule::class,
        AppDataModule::class,
        ApplicationModule::class,
        NoteUIModule::class,
        DaoModule::class]
)


interface AppComponent : AndroidInjector<MyApplication> {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): AppComponent
    }
}