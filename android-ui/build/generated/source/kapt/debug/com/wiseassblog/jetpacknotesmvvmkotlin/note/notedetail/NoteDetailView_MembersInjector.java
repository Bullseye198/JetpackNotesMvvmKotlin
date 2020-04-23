// Generated by Dagger (https://dagger.dev).
package com.wiseassblog.jetpacknotesmvvmkotlin.note.notedetail;

import com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection.ViewModelFactory;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NoteDetailView_MembersInjector implements MembersInjector<NoteDetailView> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public NoteDetailView_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<NoteDetailView> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new NoteDetailView_MembersInjector(androidInjectorProvider, viewModelFactoryProvider);}

  @Override
  public void injectMembers(NoteDetailView instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.wiseassblog.jetpacknotesmvvmkotlin.note.notedetail.NoteDetailView.viewModelFactory")
  public static void injectViewModelFactory(NoteDetailView instance,
      ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}