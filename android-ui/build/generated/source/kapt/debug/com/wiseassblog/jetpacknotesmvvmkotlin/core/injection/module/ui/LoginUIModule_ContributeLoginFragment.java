package com.wiseassblog.jetpacknotesmvvmkotlin.core.injection.module.ui;

import com.wiseassblog.jetpacknotesmvvmkotlin.login.LoginFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = LoginUIModule_ContributeLoginFragment.LoginFragmentSubcomponent.class)
public abstract class LoginUIModule_ContributeLoginFragment {
  private LoginUIModule_ContributeLoginFragment() {}

  @Binds
  @IntoMap
  @ClassKey(LoginFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LoginFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface LoginFragmentSubcomponent extends AndroidInjector<LoginFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<LoginFragment> {}
  }
}
