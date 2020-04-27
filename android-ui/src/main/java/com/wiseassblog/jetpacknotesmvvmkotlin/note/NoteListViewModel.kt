package com.wiseassblog.jetpacknotesmvvmkotlin.note

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.domain.AppCoroutineDispatchers
import com.wiseassblog.jetpacknotesmvvmkotlin.common.BaseViewModel
import com.wiseassblog.jetpacknotesmvvmkotlin.common.GET_NOTES_ERROR
import com.example.domain.user.Result
import com.example.domain.note.model.Note
import com.example.domain.note.INoteRepository
import com.example.domain.usecases.OnDeleteAllNotesUseCase
import com.example.domain.usecases.OnGetNotesUseCase
import com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist.NoteListEvent
import kotlinx.coroutines.launch
import javax.inject.Inject

class NoteListViewModel @Inject constructor(
    private val onGetNotesUseCase: OnGetNotesUseCase,
    private val onDeleteAllNotesUseCase: OnDeleteAllNotesUseCase,
    uiContext: AppCoroutineDispatchers
) : BaseViewModel<NoteListEvent>(uiContext.main) {

    private val noteListState = MutableLiveData<List<Note>>()
    val noteList: LiveData<List<Note>> get() = noteListState

    private val editNoteState = MutableLiveData<String>()
    val editNote: LiveData<String> get() = editNoteState


    override fun handleEvent(event: NoteListEvent) {
        when (event) {
            is NoteListEvent.OnStart -> getNotes()
            is NoteListEvent.OnNoteItemClick -> editNote(event.position)
            is NoteListEvent.OnDelete -> deleteAllNotes()
        }
    }

    private fun editNote(position: Int) {
        editNoteState.value = noteList.value!![position].creationDate
    }

    private fun getNotes() = launch {
        val notesResult = onGetNotesUseCase.getNotes()

        when (notesResult) {
            is Result.Value -> noteListState.value = notesResult.value
            is Result.Error -> errorState.value = GET_NOTES_ERROR
        }
    }

    private fun deleteAllNotes() = launch {
       onDeleteAllNotesUseCase.deleteAllNotes()
    }
}