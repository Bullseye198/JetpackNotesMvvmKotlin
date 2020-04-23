package com.wiseassblog.jetpacknotesmvvmkotlin;

import com.wiseassblog.jetpacknotesmvvmkotlin.core.injection.module.ui.LoginUIModule;
import com.wiseassblog.jetpacknotesmvvmkotlin.login.LoginActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ApplicationModuleBinds_ContributeLoginActivity.LoginActivitySubcomponent.class
)
public abstract class ApplicationModuleBinds_ContributeLoginActivity {
  private ApplicationModuleBinds_ContributeLoginActivity() {}

  @Binds
  @IntoMap
  @ClassKey(LoginActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LoginActivitySubcomponent.Factory builder);

  @Subcomponent(modules = LoginUIModule.class)
  public interface LoginActivitySubcomponent extends AndroidInjector<LoginActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<LoginActivity> {}
  }
}
