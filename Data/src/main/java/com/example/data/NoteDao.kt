package com.example.data

import androidx.room.*
import com.google.common.net.HttpHeaders.FROM


@Dao
interface NoteDao {
    @Query("SELECT * FROM notes")
    suspend fun getNotes(): List<RoomNote>

    @Query("SELECT * FROM notes WHERE creation_date = :creationDate")
    suspend fun getNoteById(creationDate: String): RoomNote

    @Delete
    suspend fun deleteNote(note: RoomNote)


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdateNote(note: RoomNote): Long

    //add function for deleting all notes
    @Query("SELECT * FROM notes")
    suspend fun deleteAllNotese(): List<RoomNote>


}
