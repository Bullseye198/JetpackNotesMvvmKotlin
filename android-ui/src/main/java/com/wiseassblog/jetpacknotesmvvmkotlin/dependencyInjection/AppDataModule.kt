package com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection

import com.example.data.firebase.FirebaseUserRepoImpl
import com.example.domain.note.INoteRepository
import com.example.domain.user.IUserRepository
import com.example.data.note.NoteRepoImpl
import dagger.Binds
import dagger.Module
import kotlin.coroutines.CoroutineContext

@Module
interface AppDataModule {

    @Binds
    fun bindINoteRepository(noteRepoImpl: NoteRepoImpl): INoteRepository

    @Binds
    fun bindCoroutineCOntext(coroutineContext: CoroutineContext): CoroutineContext

    @Binds
    fun bindIUserRepository(firebaseUserRepoImpl: FirebaseUserRepoImpl): IUserRepository
}