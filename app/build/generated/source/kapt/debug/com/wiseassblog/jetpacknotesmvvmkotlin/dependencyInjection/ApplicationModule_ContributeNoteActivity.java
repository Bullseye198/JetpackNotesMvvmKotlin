package com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection;

import com.wiseassblog.jetpacknotesmvvmkotlin.note.NoteActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ApplicationModule_ContributeNoteActivity.NoteActivitySubcomponent.class)
public abstract class ApplicationModule_ContributeNoteActivity {
  private ApplicationModule_ContributeNoteActivity() {}

  @Binds
  @IntoMap
  @ClassKey(NoteActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      NoteActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface NoteActivitySubcomponent extends AndroidInjector<NoteActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<NoteActivity> {}
  }
}
