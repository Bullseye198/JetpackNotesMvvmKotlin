package com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection

import com.wiseassblog.jetpacknotesmvvmkotlin.note.notedetail.NoteDetailView
import com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist.NoteListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface NoteUIModule {

    @ContributesAndroidInjector
    fun contributesNoteListFragment(): NoteListFragment

    @ContributesAndroidInjector
    fun contributesNoteDetailView(): NoteDetailView

}