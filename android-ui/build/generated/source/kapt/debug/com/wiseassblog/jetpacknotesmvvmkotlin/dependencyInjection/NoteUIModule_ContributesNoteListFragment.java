package com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection;

import com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist.NoteListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = NoteUIModule_ContributesNoteListFragment.NoteListFragmentSubcomponent.class)
public abstract class NoteUIModule_ContributesNoteListFragment {
  private NoteUIModule_ContributesNoteListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(NoteListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      NoteListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface NoteListFragmentSubcomponent extends AndroidInjector<NoteListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<NoteListFragment> {}
  }
}
