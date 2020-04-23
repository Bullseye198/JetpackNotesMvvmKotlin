package com.example.domain.note

import com.wiseassblog.jetpacknotesmvvmkotlin.common.Result
import com.example.domain.note.model.Note

interface INoteRepository {

    suspend fun getNoteById(noteId: String): Result<Exception, Note>
    suspend fun getNotes(): Result<Exception, List<Note>>
    suspend fun deleteNote(note: Note): Result<Exception, Unit>
    suspend fun updateNote(note: Note): Result<Exception, Unit>
}