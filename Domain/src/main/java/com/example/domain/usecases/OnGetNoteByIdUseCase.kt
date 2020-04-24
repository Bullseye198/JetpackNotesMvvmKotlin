package com.example.domain.usecases

import com.example.domain.note.INoteRepository
import com.example.domain.note.model.Note
import com.example.domain.user.Result
import java.lang.Exception
import javax.inject.Inject

class OnGetNoteByIdUseCase @Inject constructor(
    private val iNoteRepository: INoteRepository
) {

    suspend fun getNote(noteId: String): Result<Exception, Note>{
        return iNoteRepository.getNoteById(noteId)
    }
}