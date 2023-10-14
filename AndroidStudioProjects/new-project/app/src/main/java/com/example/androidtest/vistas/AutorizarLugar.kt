package com.example.androidtest.vistas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

import androidx.recyclerview.widget.RecyclerView
import com.example.androidtest.R
import com.example.androidtest.adapters.MyAdapter
import com.example.androidtest.conexion.MyData
import com.example.androidtest.dataClass.DataLugar
import com.example.androidtest.models.User


class AutorizarLugar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_autorizar_lugar)

        val lugares = MyData.lugares
        val arrayLugares : ArrayList<DataLugar> = ArrayList()
        val recyclerView = findViewById<RecyclerView>(R.id.RcvPlaces)

        for (lugar in lugares){
            arrayLugares.add(DataLugar(id = lugar.id, name = lugar.name, des = lugar.des, schedule = lugar.schedule, moderator = lugar.moderator, user = lugar.user, isAuthorised = lugar.isAuthorised))
        }

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = MyAdapter(arrayLugares)
        recyclerView.adapter = adapter


    }
}