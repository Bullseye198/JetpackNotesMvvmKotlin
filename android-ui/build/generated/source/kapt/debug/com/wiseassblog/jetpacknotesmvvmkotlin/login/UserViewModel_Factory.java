// Generated by Dagger (https://dagger.dev).
package com.wiseassblog.jetpacknotesmvvmkotlin.login;

import com.example.domain.AppCoroutineDispatchers;
import com.example.domain.user.IUserRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserViewModel_Factory implements Factory<UserViewModel> {
  private final Provider<IUserRepository> repoProvider;

  private final Provider<AppCoroutineDispatchers> uiContextProvider;

  public UserViewModel_Factory(Provider<IUserRepository> repoProvider,
      Provider<AppCoroutineDispatchers> uiContextProvider) {
    this.repoProvider = repoProvider;
    this.uiContextProvider = uiContextProvider;
  }

  @Override
  public UserViewModel get() {
    return newInstance(repoProvider.get(), uiContextProvider.get());
  }

  public static UserViewModel_Factory create(Provider<IUserRepository> repoProvider,
      Provider<AppCoroutineDispatchers> uiContextProvider) {
    return new UserViewModel_Factory(repoProvider, uiContextProvider);
  }

  public static UserViewModel newInstance(IUserRepository repo, AppCoroutineDispatchers uiContext) {
    return new UserViewModel(repo, uiContext);
  }
}