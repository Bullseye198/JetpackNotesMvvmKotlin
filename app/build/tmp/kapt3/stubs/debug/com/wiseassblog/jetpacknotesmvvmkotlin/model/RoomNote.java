package com.wiseassblog.jetpacknotesmvvmkotlin.model;

import java.lang.System;

@androidx.room.Entity(tableName = "notes", indices = {@androidx.room.Index(value = {"creation_date"})})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/wiseassblog/jetpacknotesmvvmkotlin/model/RoomNote;", "", "creationDate", "", "contents", "upVotes", "", "imageUrl", "creatorId", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getContents", "()Ljava/lang/String;", "getCreationDate", "getCreatorId", "getImageUrl", "getUpVotes", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class RoomNote {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "creation_date")
    @androidx.room.PrimaryKey()
    private final java.lang.String creationDate = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "contents")
    private final java.lang.String contents = null;
    @androidx.room.ColumnInfo(name = "up_votes")
    private final int upVotes = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "image_url")
    private final java.lang.String imageUrl = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "creator_id")
    private final java.lang.String creatorId = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreationDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContents() {
        return null;
    }
    
    public final int getUpVotes() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImageUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatorId() {
        return null;
    }
    
    public RoomNote(@org.jetbrains.annotations.NotNull()
    java.lang.String creationDate, @org.jetbrains.annotations.NotNull()
    java.lang.String contents, int upVotes, @org.jetbrains.annotations.NotNull()
    java.lang.String imageUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String creatorId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.wiseassblog.jetpacknotesmvvmkotlin.model.RoomNote copy(@org.jetbrains.annotations.NotNull()
    java.lang.String creationDate, @org.jetbrains.annotations.NotNull()
    java.lang.String contents, int upVotes, @org.jetbrains.annotations.NotNull()
    java.lang.String imageUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String creatorId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}