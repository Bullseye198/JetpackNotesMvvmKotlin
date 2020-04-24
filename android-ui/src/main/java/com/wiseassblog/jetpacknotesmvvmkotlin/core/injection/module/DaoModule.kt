package com.wiseassblog.jetpacknotesmvvmkotlin.core.injection.module

import com.example.data.RoomNoteDatabase
import dagger.Module
import dagger.Provides

@Module
object DaoModule {

    @Provides
    fun provideNoteDao(roomNoteDatabase: RoomNoteDatabase) = roomNoteDatabase.roomNoteDao()
}