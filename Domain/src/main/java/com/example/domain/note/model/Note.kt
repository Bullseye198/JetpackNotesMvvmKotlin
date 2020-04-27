package com.example.domain.note.model

import com.example.domain.user.model.User

data class Note(val creationDate:String,
val contents:String,
val upVotes: Int,
val imageUrl: String,
val creator: User?)

