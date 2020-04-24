package com.example.domain.usecases

import com.example.domain.note.INoteRepository
import com.example.domain.note.model.Note
import com.example.domain.user.Result
import java.lang.Exception
import javax.inject.Inject

class OnUpdateNoteUseCase @Inject constructor(
    private val iNoteRepository: INoteRepository
)  {

    suspend fun updateNote(note: Note): Result<Exception, Unit> {
       return iNoteRepository.updateNote(note)
    }


}