package com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection;

import com.wiseassblog.jetpacknotesmvvmkotlin.note.notedetail.NoteDetailView;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = NoteUIModule_ContributesNoteDetailView.NoteDetailViewSubcomponent.class)
public abstract class NoteUIModule_ContributesNoteDetailView {
  private NoteUIModule_ContributesNoteDetailView() {}

  @Binds
  @IntoMap
  @ClassKey(NoteDetailView.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      NoteDetailViewSubcomponent.Factory builder);

  @Subcomponent
  public interface NoteDetailViewSubcomponent extends AndroidInjector<NoteDetailView> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<NoteDetailView> {}
  }
}
