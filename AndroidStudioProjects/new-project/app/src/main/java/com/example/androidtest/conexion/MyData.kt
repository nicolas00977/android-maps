package com.example.androidtest.conexion

import com.example.androidtest.models.Lugar
import com.example.androidtest.models.User

class MyData {
    companion object {
        val users = mutableListOf<User>()
        val lugares = mutableListOf<Lugar>()
    }
}