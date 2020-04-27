package com.example.domain.note

import com.example.domain.note.model.Note
import com.example.domain.user.Result


interface INoteRepository {

    suspend fun getNoteById(noteId: String): Result<Exception, Note>
    suspend fun getNotes(): Result<Exception, List<Note>>
    suspend fun deleteNote(note: Note): Result<Exception, Unit>
    suspend fun updateNote(note: Note): Result<Exception, Unit>
    suspend fun deleteAllNotes(): Result<Exception, Unit>
}