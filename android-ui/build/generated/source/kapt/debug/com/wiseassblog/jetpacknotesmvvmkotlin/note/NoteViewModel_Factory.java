// Generated by Dagger (https://dagger.dev).
package com.wiseassblog.jetpacknotesmvvmkotlin.note;

import com.example.domain.AppCoroutineDispatchers;
import com.example.domain.usecases.OnDeleteNoteUseCase;
import com.example.domain.usecases.OnGetNoteByIdUseCase;
import com.example.domain.usecases.OnGetNotesUseCase;
import com.example.domain.usecases.OnUpdateNoteUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NoteViewModel_Factory implements Factory<NoteViewModel> {
  private final Provider<OnDeleteNoteUseCase> onDeleteNoteUseCaseProvider;

  private final Provider<OnUpdateNoteUseCase> onUpdateNoteUseCaseProvider;

  private final Provider<OnGetNotesUseCase> onGetNotesUseCaseProvider;

  private final Provider<OnGetNoteByIdUseCase> onGetNoteByIdUseCaseProvider;

  private final Provider<AppCoroutineDispatchers> coroutineDispatchersProvider;

  public NoteViewModel_Factory(Provider<OnDeleteNoteUseCase> onDeleteNoteUseCaseProvider,
      Provider<OnUpdateNoteUseCase> onUpdateNoteUseCaseProvider,
      Provider<OnGetNotesUseCase> onGetNotesUseCaseProvider,
      Provider<OnGetNoteByIdUseCase> onGetNoteByIdUseCaseProvider,
      Provider<AppCoroutineDispatchers> coroutineDispatchersProvider) {
    this.onDeleteNoteUseCaseProvider = onDeleteNoteUseCaseProvider;
    this.onUpdateNoteUseCaseProvider = onUpdateNoteUseCaseProvider;
    this.onGetNotesUseCaseProvider = onGetNotesUseCaseProvider;
    this.onGetNoteByIdUseCaseProvider = onGetNoteByIdUseCaseProvider;
    this.coroutineDispatchersProvider = coroutineDispatchersProvider;
  }

  @Override
  public NoteViewModel get() {
    return newInstance(onDeleteNoteUseCaseProvider.get(), onUpdateNoteUseCaseProvider.get(), onGetNotesUseCaseProvider.get(), onGetNoteByIdUseCaseProvider.get(), coroutineDispatchersProvider.get());
  }

  public static NoteViewModel_Factory create(
      Provider<OnDeleteNoteUseCase> onDeleteNoteUseCaseProvider,
      Provider<OnUpdateNoteUseCase> onUpdateNoteUseCaseProvider,
      Provider<OnGetNotesUseCase> onGetNotesUseCaseProvider,
      Provider<OnGetNoteByIdUseCase> onGetNoteByIdUseCaseProvider,
      Provider<AppCoroutineDispatchers> coroutineDispatchersProvider) {
    return new NoteViewModel_Factory(onDeleteNoteUseCaseProvider, onUpdateNoteUseCaseProvider, onGetNotesUseCaseProvider, onGetNoteByIdUseCaseProvider, coroutineDispatchersProvider);
  }

  public static NoteViewModel newInstance(OnDeleteNoteUseCase onDeleteNoteUseCase,
      OnUpdateNoteUseCase onUpdateNoteUseCase, OnGetNotesUseCase onGetNotesUseCase,
      OnGetNoteByIdUseCase onGetNoteByIdUseCase, AppCoroutineDispatchers coroutineDispatchers) {
    return new NoteViewModel(onDeleteNoteUseCase, onUpdateNoteUseCase, onGetNotesUseCase, onGetNoteByIdUseCase, coroutineDispatchers);
  }
}
