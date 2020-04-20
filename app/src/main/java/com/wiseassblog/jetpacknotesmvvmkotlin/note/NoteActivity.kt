package com.wiseassblog.jetpacknotesmvvmkotlin.note

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.wiseassblog.jetpacknotesmvvmkotlin.R
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject




class NoteActivity : DaggerAppCompatActivity() {

    lateinit var viewModel: NoteViewModel

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var nav: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note)

        nav = Navigation.findNavController(this, R.id.fragment_nav)
    }
}