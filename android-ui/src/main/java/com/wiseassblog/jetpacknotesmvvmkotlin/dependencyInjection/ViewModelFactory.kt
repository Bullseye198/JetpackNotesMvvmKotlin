package com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.wiseassblog.jetpacknotesmvvmkotlin.login.UserViewModel
import com.wiseassblog.jetpacknotesmvvmkotlin.note.NoteListViewModel
import com.wiseassblog.jetpacknotesmvvmkotlin.note.NoteViewModel
import com.wiseassblog.jetpacknotesmvvmkotlin.userInterface.MainActivityViewModel
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton
import kotlin.reflect.KClass

@Singleton
class ViewModelFactory @Inject constructor(
    private val viewModels: MutableMap<Class<out ViewModel>, Provider<ViewModel>>
): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T = viewModels[modelClass]?.get() as T
    }
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
@MapKey
internal annotation class ViewModelKey(val value: KClass<out ViewModel>)

@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey (MainActivityViewModel::class)
    internal abstract fun mainActivityViewModel(viewModel: MainActivityViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey (NoteViewModel::class)
    internal abstract fun noteViewModel(viewModel: NoteViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey (NoteListViewModel::class)
    internal abstract fun noteListViewModel(viewModel: NoteListViewModel): ViewModel



    @Binds
    @IntoMap
    @ViewModelKey (UserViewModel::class)
    internal abstract fun userViewModel(viewModel: UserViewModel): ViewModel
}