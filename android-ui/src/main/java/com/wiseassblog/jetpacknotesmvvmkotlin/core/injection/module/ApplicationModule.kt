package com.wiseassblog.jetpacknotesmvvmkotlin.core.injection.module

import android.content.Context
import androidx.room.Room
import com.example.domain.AppCoroutineDispatchers
import com.wiseassblog.jetpacknotesmvvmkotlin.model.RoomNoteDatabase
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@Module
object ApplicationModule {

    @Singleton
    @Provides
     fun provideRoomNoteDatabase(
         applicationContext: Context
         ) : RoomNoteDatabase{
         return Room.databaseBuilder(applicationContext, RoomNoteDatabase::class.java, "notesdagger")
             .build()
     }

    @Singleton
    @Provides
    fun provideCoroutineDispatchers() = AppCoroutineDispatchers(
        io = Dispatchers.IO,
        computation = Dispatchers.Default,
        main = Dispatchers.Main
    )


}