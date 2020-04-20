package com.wiseassblog.jetpacknotesmvvmkotlin.model.implementations;

import java.lang.System;

/**
 * If this wasn't a demo project, I would apply more abstraction to this repository (i.e. local and remote would be
 * separate interfaces which this class would depend on). I wanted to keep it the back end simple since this app is
 * a demo on MVVM, which is a front end architecture pattern.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ)\u0010\u000f\u001a\u0012\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\u0004\u0012\u00020\u00130\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J)\u0010\u0017\u001a\u0012\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\u0004\u0012\u00020\u00130\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J)\u0010\u0018\u001a\u0012\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\u0004\u0012\u00020\u00130\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J)\u0010\u001b\u001a\u0012\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\u0004\u0012\u00020\u00150\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\'\u0010\u001f\u001a\u0018\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150 0\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J)\u0010\"\u001a\u0012\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\u0004\u0012\u00020\u00150\u00102\u0006\u0010#\u001a\u00020\u001dH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\'\u0010$\u001a\u0018\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150 0\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J1\u0010%\u001a\u0012\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\u0004\u0012\u00020\u00150\u00102\u0006\u0010&\u001a\u00020\u001d2\u0006\u0010\'\u001a\u00020\u001aH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J/\u0010)\u001a\u0018\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150 0\u00102\u0006\u0010\'\u001a\u00020\u001aH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J(\u0010+\u001a\u0018\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150 0\u00102\b\u0010,\u001a\u0004\u0018\u00010-H\u0002J)\u0010.\u001a\u0012\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\u0004\u0012\u00020\u00130\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J)\u0010/\u001a\u0012\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\u0004\u0012\u00020\u00130\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J)\u00100\u001a\u0012\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\u0004\u0012\u00020\u00130\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00061"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/implementations/NoteRepoImpl;", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/repository/INoteRepository;", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "remote", "Lcom/google/firebase/firestore/FirebaseFirestore;", "local", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/NoteDao;", "(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/NoteDao;)V", "getFirebaseAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "getLocal", "()Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/NoteDao;", "getRemote", "()Lcom/google/firebase/firestore/FirebaseFirestore;", "deleteLocalNote", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/common/Result;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "note", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/Note;", "(Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/Note;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteNote", "deleteRemoteNote", "getActiveUser", "Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/User;", "getLocalNote", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocalNotes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNoteById", "noteId", "getNotes", "getRemoteNote", "creationDate", "user", "(Ljava/lang/String;Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRemoteNotes", "(Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resultToNoteList", "result", "Lcom/google/firebase/firestore/QuerySnapshot;", "updateLocalNote", "updateNote", "updateRemoteNote", "app_debug"})
public final class NoteRepoImpl implements com.wiseassblog.jetpacknotesmvvmkotlin.model.repository.INoteRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.auth.FirebaseAuth firebaseAuth = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.firestore.FirebaseFirestore remote = null;
    @org.jetbrains.annotations.NotNull()
    private final com.wiseassblog.jetpacknotesmvvmkotlin.model.NoteDao local = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getNoteById(@org.jetbrains.annotations.NotNull()
    java.lang.String noteId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wiseassblog.jetpacknotesmvvmkotlin.common.Result<? extends java.lang.Exception, com.wiseassblog.jetpacknotesmvvmkotlin.model.Note>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteNote(@org.jetbrains.annotations.NotNull()
    com.wiseassblog.jetpacknotesmvvmkotlin.model.Note note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wiseassblog.jetpacknotesmvvmkotlin.common.Result<? extends java.lang.Exception, kotlin.Unit>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateNote(@org.jetbrains.annotations.NotNull()
    com.wiseassblog.jetpacknotesmvvmkotlin.model.Note note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wiseassblog.jetpacknotesmvvmkotlin.common.Result<? extends java.lang.Exception, kotlin.Unit>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getNotes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.wiseassblog.jetpacknotesmvvmkotlin.common.Result<? extends java.lang.Exception, ? extends java.util.List<com.wiseassblog.jetpacknotesmvvmkotlin.model.Note>>> p0) {
        return null;
    }
    
    /**
     * if currentUser != null, return true
     */
    private final com.wiseassblog.jetpacknotesmvvmkotlin.model.User getActiveUser() {
        return null;
    }
    
    private final com.wiseassblog.jetpacknotesmvvmkotlin.common.Result<java.lang.Exception, java.util.List<com.wiseassblog.jetpacknotesmvvmkotlin.model.Note>> resultToNoteList(com.google.firebase.firestore.QuerySnapshot result) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.auth.FirebaseAuth getFirebaseAuth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.firestore.FirebaseFirestore getRemote() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.wiseassblog.jetpacknotesmvvmkotlin.model.NoteDao getLocal() {
        return null;
    }
    
    public NoteRepoImpl(@org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.FirebaseAuth firebaseAuth, @org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore remote, @org.jetbrains.annotations.NotNull()
    com.wiseassblog.jetpacknotesmvvmkotlin.model.NoteDao local) {
        super();
    }
}