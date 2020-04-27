package com.wiseassblog.jetpacknotesmvvmkotlin.core.injection.module;

import com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection.NoteUIModule;
import com.wiseassblog.jetpacknotesmvvmkotlin.features.main.MainActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ApplicationModuleBinds_ContributeNoteActivity.MainActivitySubcomponent.class
)
public abstract class ApplicationModuleBinds_ContributeNoteActivity {
  private ApplicationModuleBinds_ContributeNoteActivity() {}

  @Binds
  @IntoMap
  @ClassKey(MainActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Factory builder);

  @Subcomponent(modules = NoteUIModule.class)
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainActivity> {}
  }
}
