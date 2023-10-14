package com.example.androidtest.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "lugar")
data class Lugar(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val name: String,
    val des: String,
    val schedule: String,
    val moderator: User,
    val user: User,
    val isAuthorised: Boolean
)
