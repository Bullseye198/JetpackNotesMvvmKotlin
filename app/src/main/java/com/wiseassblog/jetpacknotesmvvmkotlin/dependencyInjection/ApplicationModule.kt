package com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection

import com.wiseassblog.jetpacknotesmvvmkotlin.note.NoteActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ApplicationModule {

    @ContributesAndroidInjector
    fun contributeNoteActivity(): NoteActivity
}