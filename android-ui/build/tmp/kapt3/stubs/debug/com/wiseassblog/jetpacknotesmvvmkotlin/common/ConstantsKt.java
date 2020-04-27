package com.wiseassblog.jetpacknotesmvvmkotlin.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\fX\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"ANTENNA_EMPTY", "", "ANTENNA_FULL", "ANTENNA_LOOP", "ERROR_AUTH", "ERROR_NETWORK_UNAVAILABLE", "GET_NOTES_ERROR", "GET_NOTE_ERROR", "LOADING", "LOGIN_ERROR", "LOGOUT_ERROR", "RC_SIGN_IN", "", "RETRY", "SIGNED_IN", "SIGNED_OUT", "SIGN_IN", "SIGN_OUT", "android-ui_debug"})
public final class ConstantsKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOGIN_ERROR = "Error retrieving user.";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOADING = "Loading...";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOGOUT_ERROR = "Error logging out user.";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_NOTE_ERROR = "Error retrieving note.";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_NOTES_ERROR = "Error retrieving notes.";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SIGN_OUT = "SIGN OUT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SIGN_IN = "SIGN IN";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SIGNED_IN = "Signed In";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SIGNED_OUT = "Signed Out";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_NETWORK_UNAVAILABLE = "Network Unavailable";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_AUTH = "An Error Has Occured";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RETRY = "RETRY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ANTENNA_EMPTY = "ic_antenna_empty";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ANTENNA_FULL = "ic_antenna_full";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ANTENNA_LOOP = "antenna_loop_fast";
    
    /**
     * This value is just a constant to denote our sign in request; It can be any int.
     * Would have been great if that was explained in the docs, I assumed at first that it had to
     * be a specific value.
     */
    public static final int RC_SIGN_IN = 1337;
}