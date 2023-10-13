package com.example.androidtest.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.androidtest.models.Lugar
import com.example.androidtest.models.User

@Dao
interface DAOLugar {

    @Query("SELECT * FROM lugar")
    suspend fun getLugar(): MutableList<Lugar>

    @Insert
    suspend fun addLugar(lugar: Lugar)

}