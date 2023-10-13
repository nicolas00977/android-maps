package com.example.androidtest.conexion

import android.app.Application
import androidx.room.Room

class MyAppRepository: Application() {

    companion object{
        lateinit var database: AppDatabase
            private set
    }

    override fun onCreate() {
        super.onCreate()

        database= Room.databaseBuilder(applicationContext, AppDatabase::class.java, "my_database").build()
    }


}