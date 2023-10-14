package com.example.androidtest.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.androidtest.models.User

@Dao
interface DAOUser {

    @Query("SELECT * FROM user")
    suspend fun getUser(): MutableList<User>

    @Insert
    suspend fun addUser(user: User)

}