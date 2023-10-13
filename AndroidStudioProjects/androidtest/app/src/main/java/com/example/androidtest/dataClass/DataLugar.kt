package com.example.androidtest.dataClass

import com.example.androidtest.models.User

data class DataLugar(val id: Int,
                     val name: String,
                     val des: String,
                     val schedule: String,
                     val moderator: User,
                     val user: User,
                     var isAuthorised: Boolean
)
