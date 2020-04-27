package com.wiseassblog.jetpacknotesmvvmkotlin.login;

import java.lang.System;

/**
 * This approach to ViewModels reduces the complexity of the View by containing specific details about widgets and
 * controls present in the View. The benefit of doing so is to make the View in to a Humble Object; reducing or
 * eliminating the need to test the View.
 *
 * The downside of this approach, is that the ViewModel is no longer re-usable across a variety of Views. In this case,
 * since this ViewModel is only used by a single View, and the application architecture will not change any time soon,
 * losing re-usability in exchange for a simpler View is not a problem.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0016\u0010\u001b\u001a\u00020\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u000bH\u0002J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0003H\u0002J\b\u0010 \u001a\u00020\u000bH\u0002J\b\u0010!\u001a\u00020\u000bH\u0002J\b\u0010\"\u001a\u00020\u000bH\u0002J\b\u0010#\u001a\u00020\u000bH\u0002J\b\u0010$\u001a\u00020\u001aH\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\rR\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/login/UserViewModel;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/common/BaseViewModel;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/login/LoginEvent;", "Lcom/example/domain/login/LoginResult;", "repo", "Lcom/example/domain/user/IUserRepository;", "uiContext", "Lcom/example/domain/AppCoroutineDispatchers;", "(Lcom/example/domain/user/IUserRepository;Lcom/example/domain/AppCoroutineDispatchers;)V", "authAttempt", "Landroidx/lifecycle/MutableLiveData;", "", "getAuthAttempt$android_ui_debug", "()Landroidx/lifecycle/MutableLiveData;", "authButtonText", "", "getAuthButtonText$android_ui_debug", "satelliteDrawable", "getSatelliteDrawable$android_ui_debug", "signInStatusText", "getSignInStatusText$android_ui_debug", "startAnimation", "getStartAnimation$android_ui_debug", "userState", "Lcom/example/domain/user/model/User;", "getUser", "Lkotlinx/coroutines/Job;", "handleEvent", "event", "onAuthButtonClick", "onSignInResult", "result", "showErrorState", "showLoadingState", "showSignedInState", "showSignedOutState", "signOutUser", "android-ui_debug"})
public final class UserViewModel extends com.wiseassblog.jetpacknotesmvvmkotlin.common.BaseViewModel<com.wiseassblog.jetpacknotesmvvmkotlin.login.LoginEvent<? extends com.example.domain.login.LoginResult>> {
    private final androidx.lifecycle.MutableLiveData<com.example.domain.user.model.User> userState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> authAttempt = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> startAnimation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> signInStatusText = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> authButtonText = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> satelliteDrawable = null;
    private final com.example.domain.user.IUserRepository repo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> getAuthAttempt$android_ui_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> getStartAnimation$android_ui_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSignInStatusText$android_ui_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAuthButtonText$android_ui_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSatelliteDrawable$android_ui_debug() {
        return null;
    }
    
    private final void showErrorState() {
    }
    
    private final void showLoadingState() {
    }
    
    private final void showSignedInState() {
    }
    
    private final void showSignedOutState() {
    }
    
    @java.lang.Override()
    public void handleEvent(@org.jetbrains.annotations.NotNull()
    com.wiseassblog.jetpacknotesmvvmkotlin.login.LoginEvent<com.example.domain.login.LoginResult> event) {
    }
    
    private final kotlinx.coroutines.Job getUser() {
        return null;
    }
    
    /**
     * If user is null, tell the View to begin the authAttempt. Else, attempt to sign the user out
     */
    private final void onAuthButtonClick() {
    }
    
    private final kotlinx.coroutines.Job onSignInResult(com.example.domain.login.LoginResult result) {
        return null;
    }
    
    private final kotlinx.coroutines.Job signOutUser() {
        return null;
    }
    
    @javax.inject.Inject()
    public UserViewModel(@org.jetbrains.annotations.NotNull()
    com.example.domain.user.IUserRepository repo, @org.jetbrains.annotations.NotNull()
    com.example.domain.AppCoroutineDispatchers uiContext) {
        super(null);
    }
}