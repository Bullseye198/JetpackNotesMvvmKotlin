package com.wiseassblog.jetpacknotesmvvmkotlin.note

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.domain.AppCoroutineDispatchers
import com.wiseassblog.jetpacknotesmvvmkotlin.common.BaseViewModel
import com.wiseassblog.jetpacknotesmvvmkotlin.common.GET_NOTE_ERROR
import com.example.domain.user.Result
import com.example.domain.note.model.Note
import com.example.domain.note.INoteRepository
import com.example.domain.usecases.OnDeleteNoteUseCase
import com.example.domain.usecases.OnGetNoteByIdUseCase
import com.example.domain.usecases.OnGetNotesUseCase
import com.example.domain.usecases.OnUpdateNoteUseCase
import com.example.domain.user.model.User
import com.wiseassblog.jetpacknotesmvvmkotlin.note.notedetail.NoteDetailEvent
import kotlinx.coroutines.launch
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

class NoteViewModel @Inject constructor(
    private val onDeleteNoteUseCase: OnDeleteNoteUseCase,
    private val onUpdateNoteUseCase: OnUpdateNoteUseCase,
    private val onGetNotesUseCase: OnGetNotesUseCase,
    private val onGetNoteByIdUseCase: OnGetNoteByIdUseCase,
    coroutineDispatchers: AppCoroutineDispatchers
) : BaseViewModel<NoteDetailEvent>(coroutineDispatchers.main) {

    private val noteState = MutableLiveData<Note>()
    val note: LiveData<Note> get() = noteState

    private val deletedState = MutableLiveData<Boolean>()
    val deleted: LiveData<Boolean> get() = deletedState

    private val updatedState = MutableLiveData<Boolean>()
    val updated: LiveData<Boolean> get() = updatedState

    override fun handleEvent(event: NoteDetailEvent) {
        when (event) {
            is NoteDetailEvent.OnStart -> getNote(event.noteId)
            is NoteDetailEvent.OnDeleteClick -> onDelete()
            is NoteDetailEvent.OnDoneClick -> updateNote(event.contents)
        }
    }

    private fun onDelete() = launch {
        val deleteResult = onDeleteNoteUseCase.deleteNote(note.value!!)

        when (deleteResult) {
            is Result.Value -> deletedState.value = true
            is Result.Error -> deletedState.value = false
        }
    }


    private fun updateNote(contents: String) = launch {
        val updateResult = onUpdateNoteUseCase.updateNote(
            note.value!!
                .copy(contents = contents)
        )

        when (updateResult) {
            is Result.Value -> updatedState.value = true
            is Result.Error -> updatedState.value = false
        }
    }

    private fun getNote(noteId: String) = launch {
        if (noteId == "") newNote()
        else {
            val noteResult = onGetNoteByIdUseCase.getNote(noteId)

            when (noteResult) {
                is Result.Value -> noteState.value = noteResult.value

                is Result.Error -> errorState.value = GET_NOTE_ERROR
            }
        }
    }

    private fun newNote() {
        noteState.value =
            Note(
                getCalendarTime(),
                "",
                0,
                "rocket_loop",
                null
            )
    }


    private fun getCalendarTime(): String {
        val cal = Calendar.getInstance(TimeZone.getDefault())
        val format = SimpleDateFormat("d MMM yyyy HH:mm:ss Z")
        format.timeZone = cal.timeZone
        return format.format(cal.time)
    }
}