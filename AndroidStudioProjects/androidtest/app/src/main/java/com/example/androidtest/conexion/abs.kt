package com.example.androidtest.conexion

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.androidtest.daos.DAOUser
import com.example.androidtest.models.Lugar
import com.example.androidtest.models.User


@Database(entities = [User::class, Lugar::class], version = 1)
abstract class AppDatabase: RoomDatabase()  {
    abstract fun daoUser(): DAOUser
}