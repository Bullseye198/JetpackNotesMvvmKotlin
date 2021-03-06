// Generated by Dagger (https://dagger.dev).
package com.wiseassblog.jetpacknotesmvvmkotlin.core.injection.module;

import com.example.domain.AppCoroutineDispatchers;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideCoroutineDispatchersFactory implements Factory<AppCoroutineDispatchers> {
  @Override
  public AppCoroutineDispatchers get() {
    return provideCoroutineDispatchers();
  }

  public static ApplicationModule_ProvideCoroutineDispatchersFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AppCoroutineDispatchers provideCoroutineDispatchers() {
    return Preconditions.checkNotNull(ApplicationModule.INSTANCE.provideCoroutineDispatchers(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final ApplicationModule_ProvideCoroutineDispatchersFactory INSTANCE = new ApplicationModule_ProvideCoroutineDispatchersFactory();
  }
}
