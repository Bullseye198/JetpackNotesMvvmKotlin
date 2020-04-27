package com.example.data

import androidx.room.*
import com.google.common.net.HttpHeaders.FROM
import java.lang.Exception


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
    @Query("DELETE FROM notes")
    suspend fun deleteAllNotes(): List<RoomNote>


}
