package com.example.domain.note

import com.example.domain.user.User

data class Note(val creationDate:String,
                val contents:String,
                val upVotes: Int,
                val imageUrl: String,
                val creator: User?)

