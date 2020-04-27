package com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.data.note.NoteRepoImpl
import com.wiseassblog.jetpacknotesmvvmkotlin.R
import com.wiseassblog.jetpacknotesmvvmkotlin.common.makeToast
import com.wiseassblog.jetpacknotesmvvmkotlin.common.startWithFade
import com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection.ViewModelFactory
import com.wiseassblog.jetpacknotesmvvmkotlin.note.NoteListViewModel
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_note_list.*
import javax.inject.Inject

class NoteListFragment : DaggerFragment() {

    private lateinit var viewModel: NoteListViewModel
    private lateinit var adapter: NoteListAdapter

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this, viewModelFactory).get(NoteListViewModel::class.java)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_note_list, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        //THIS IS IMPORTANT!!!
        rec_list_fragment.adapter = null
    }

    override fun onStart() {
        super.onStart()
        (imv_space_background.drawable as AnimationDrawable).startWithFade()

        showLoadingState()
        setUpAdapter()
        observeViewModel()

        fab_create_new_item.setOnClickListener {
            val direction = NoteListFragmentDirections.actionNoteListViewToNoteDetailView("")
            findNavController().navigate(direction)
        }

        fab_delete_all_notes.setOnClickListener {
            viewModel.handleEvent(

            )
        }

        imv_toolbar_auth.setOnClickListener {
            findNavController().navigate(R.id.loginView)
        }

        viewModel.handleEvent(
            NoteListEvent.OnStart
        )
    }

    private fun setUpAdapter() {
        adapter = NoteListAdapter()
        adapter.event.observe(
            viewLifecycleOwner,
            Observer {
                viewModel.handleEvent(it)
            }
        )
        rec_list_fragment.adapter = adapter

    }

    private fun observeViewModel() {
        viewModel.error.observe(
            viewLifecycleOwner,
            Observer { errorMessage ->
                showErrorState(errorMessage)
            }
        )

        viewModel.noteList.observe(
            viewLifecycleOwner,
            Observer { noteList ->
                adapter.submitList(noteList)

                if (noteList.isNotEmpty()) {
                    (imv_satellite_animation.drawable as AnimationDrawable).stop()
                    imv_satellite_animation.visibility = View.INVISIBLE
                    rec_list_fragment.visibility = View.VISIBLE
                }
            }
        )

        viewModel.editNote.observe(
            viewLifecycleOwner,
            Observer { noteId ->
                startNoteDetailWithArgs(noteId)
            }
        )
    }

    private fun startNoteDetailWithArgs(noteId: String) = findNavController().navigate(
        NoteListFragmentDirections.actionNoteListViewToNoteDetailView(noteId)
    )


    private fun showErrorState(errorMessage: String?) = makeToast(errorMessage!!)


    private fun showLoadingState() = (imv_satellite_animation.drawable as AnimationDrawable).start()

}