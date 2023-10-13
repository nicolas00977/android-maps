package com.example.androidtest.vistas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidtest.R
import com.example.androidtest.adapters.AdapterSeeAuthorised
import com.example.androidtest.conexion.MyData
import com.example.androidtest.dataClass.DataLugar

class VerAutorizaciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver_autorizaciones)

        val lugares = MyData.lugares
        val arrayLugares : ArrayList<DataLugar> = ArrayList()
        val recyclerView = findViewById<RecyclerView>(R.id.RcvPlacesSeeAuthorised)

        for (lugar in lugares){
            arrayLugares.add(DataLugar(id = lugar.id, name = lugar.name, des = lugar.des, schedule = lugar.schedule, moderator = lugar.moderator, user = lugar.user, isAuthorised = lugar.isAuthorised))
        }

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = AdapterSeeAuthorised(arrayLugares)
        recyclerView.adapter = adapter


    }
}