package com.wiseassblog.jetpacknotesmvvmkotlin.note.notedetail

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.wiseassblog.jetpacknotesmvvmkotlin.R
import com.wiseassblog.jetpacknotesmvvmkotlin.common.makeToast
import com.wiseassblog.jetpacknotesmvvmkotlin.common.startWithFade
import com.example.data.toEditable
import com.wiseassblog.jetpacknotesmvvmkotlin.dependencyInjection.ViewModelFactory
import com.wiseassblog.jetpacknotesmvvmkotlin.note.NoteViewModel
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_note_detail.*
import javax.inject.Inject

class NoteDetailView : DaggerFragment() {


    private lateinit var viewModel: NoteViewModel

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this, viewModelFactory).get(NoteViewModel::class.java)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_note_detail, container, false)
    }

    override fun onStart() {
        super.onStart()


        showLoadingState()

        imb_toolbar_done.setOnClickListener {
            viewModel.handleEvent(
                NoteDetailEvent.OnDoneClick(
                    edt_note_detail_text.text.toString()
                )
            )
        }

        imb_toolbar_delete.setOnClickListener { viewModel.handleEvent(NoteDetailEvent.OnDeleteClick) }

        observeViewModel()

        (frag_note_detail.background as AnimationDrawable).startWithFade()

        viewModel.handleEvent(
            NoteDetailEvent.OnStart(
                //note NoteDetailViewArgs is genereted via Navigation component
                NoteDetailViewArgs.fromBundle(arguments!!).noteId
            )
        )
    }

    private fun observeViewModel() {
        viewModel.error.observe(
            viewLifecycleOwner,
            Observer { errorMessage ->
                showErrorState(errorMessage)
            }
        )

        viewModel.note.observe(
            viewLifecycleOwner,
            Observer { note ->
                edt_note_detail_text.text = note.contents.toEditable()
            }
        )

        viewModel.updated.observe(
            viewLifecycleOwner,
            Observer {
                findNavController().navigate(R.id.noteListView)
            }
        )

        viewModel.deleted.observe(
            viewLifecycleOwner,
            Observer {
                findNavController().navigate(R.id.noteListView)
            }
        )

        requireActivity().onBackPressedDispatcher.addCallback(this) {
            findNavController().navigate(R.id.noteListView)
        }
    }

    private fun showErrorState(errorMessage: String?) {
        makeToast(errorMessage!!)
        findNavController().navigate(R.id.noteListView)
    }

    private fun showLoadingState() {
        (imv_note_detail_satellite.drawable as AnimationDrawable).start()
    }
}