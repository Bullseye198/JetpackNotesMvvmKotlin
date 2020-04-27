package com.example.domain.usecases

import com.example.domain.note.INoteRepository
import com.example.domain.user.Result
import java.lang.Exception
import javax.inject.Inject

class OnDeleteAllNotesUseCase @Inject constructor(
    private val iNoteRepository: INoteRepository
) {
    suspend fun deleteAllNotes(): Result<Exception, Unit> {
        return iNoteRepository.deleteAllNotes()
    }

}