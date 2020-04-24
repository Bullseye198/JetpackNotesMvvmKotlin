package com.example.domain.usecases

import com.example.domain.note.INoteRepository
import com.example.domain.note.model.Note
import com.example.domain.user.Result
import javax.inject.Inject

class OnDeleteNoteUseCase @Inject constructor(
    private val iNoteRepository: INoteRepository
) {

    suspend fun deleteNote(note: Note) {
        val delNote = iNoteRepository.deleteNote(note)

    }

}