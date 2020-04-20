package com.wiseassblog.jetpacknotesmvvmkotlin.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a%\u0010\u0016\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001aH\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001b\u001a%\u0010\u001c\u001a\u0002H\u0018\"\u0004\b\u0000\u0010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001aH\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001b\u001a\f\u0010\u001d\u001a\u00020\u001e*\u00020\u0001H\u0000\u001a\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 *\b\u0012\u0004\u0012\u00020\f0 H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0018\u0010\t\u001a\u00020\u0002*\u00020\u00068@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0018\u0010\t\u001a\u00020\u0002*\u00020\f8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\r\"\u0018\u0010\u000e\u001a\u00020\f*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0011\u001a\u00020\u0012*\u00020\u00138@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"safeGetUid", "", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/Note;", "getSafeGetUid", "(Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/Note;)Ljava/lang/String;", "toFirebaseNote", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/FirebaseNote;", "getToFirebaseNote", "(Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/Note;)Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/FirebaseNote;", "toNote", "getToNote", "(Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/FirebaseNote;)Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/Note;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/RoomNote;", "(Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/RoomNote;)Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/Note;", "toRoomNote", "getToRoomNote", "(Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/Note;)Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/RoomNote;", "toUser", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/User;", "Lcom/google/firebase/auth/FirebaseUser;", "getToUser", "(Lcom/google/firebase/auth/FirebaseUser;)Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/User;", "awaitTaskCompletable", "", "T", "task", "Lcom/google/android/gms/tasks/Task;", "(Lcom/google/android/gms/tasks/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitTaskResult", "toEditable", "Landroid/text/Editable;", "toNoteListFromRoomNote", "", "app_debug"})
public final class DataExtensionsKt {
    
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object>java.lang.Object awaitTaskResult(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.tasks.Task<T> task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super T> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object>java.lang.Object awaitTaskCompletable(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.tasks.Task<T> task, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.wiseassblog.jetpacknotesmvvmkotlin.model.User getToUser(@org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.FirebaseUser $this$toUser) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.wiseassblog.jetpacknotesmvvmkotlin.model.Note getToNote(@org.jetbrains.annotations.NotNull()
    com.wiseassblog.jetpacknotesmvvmkotlin.model.FirebaseNote $this$toNote) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.wiseassblog.jetpacknotesmvvmkotlin.model.FirebaseNote getToFirebaseNote(@org.jetbrains.annotations.NotNull()
    com.wiseassblog.jetpacknotesmvvmkotlin.model.Note $this$toFirebaseNote) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.wiseassblog.jetpacknotesmvvmkotlin.model.Note getToNote(@org.jetbrains.annotations.NotNull()
    com.wiseassblog.jetpacknotesmvvmkotlin.model.RoomNote $this$toNote) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.wiseassblog.jetpacknotesmvvmkotlin.model.RoomNote getToRoomNote(@org.jetbrains.annotations.NotNull()
    com.wiseassblog.jetpacknotesmvvmkotlin.model.Note $this$toRoomNote) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<com.wiseassblog.jetpacknotesmvvmkotlin.model.Note> toNoteListFromRoomNote(@org.jetbrains.annotations.NotNull()
    java.util.List<com.wiseassblog.jetpacknotesmvvmkotlin.model.RoomNote> $this$toNoteListFromRoomNote) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.text.Editable toEditable(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$toEditable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getSafeGetUid(@org.jetbrains.annotations.NotNull()
    com.wiseassblog.jetpacknotesmvvmkotlin.model.Note $this$safeGetUid) {
        return null;
    }
}