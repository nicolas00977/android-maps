package com.example.androidtest.vistas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import com.example.androidtest.R
import com.example.androidtest.conexion.MyData
import com.example.androidtest.models.Lugar
import com.example.androidtest.models.User
import com.google.android.material.button.MaterialButton

class ModeratorHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_moderator_home)

        val tableLayout = findViewById<TableLayout>(R.id.tableLayout)
        val tableLayoutByModerator = findViewById<TableLayout>(R.id.tableAutorizaddosByModerator)
        val btnAutorizarLugar = findViewById<MaterialButton>(R.id.btnAutorizarLugar)
        val btnVerAutorizaciones = findViewById<MaterialButton>(R.id.btnVerAutorizaciones)
        val moderatorForSearch = "fernando"

        MyData.lugares.add(Lugar(
            id = 0,
            name = "Parque Central",
            des = "Un parque público con áreas verdes, juegos infantiles y un lago artificial.",
            schedule = "9:00 a 18:00",
            moderator = User(0, "fernando", email = "fer@gmail.com", username = "fer43", password = "11", isModerator = true),
            user = User(2, "nicolas", email = "nico@gmail.com", username = "nico43", password = "12", isModerator = false),
            isAuthorised = false
        ))
        MyData.lugares.add(Lugar(
            id = 1,
            name = "Museo de Historia Natural",
            des = "Un museo con exhibiciones sobre la historia natural de la región.",
            schedule = "9:00 a 18:00",
            moderator = User(0, "fernando", email = "fer@gmail.com", username = "fer43", password = "11", isModerator = true),
            user = User(2, "nicolas", email = "nico@gmail.com", username = "nico43", password = "12", isModerator = false),
            isAuthorised = true
        ))
        MyData.lugares.add(Lugar(
            id = 3,
            name = "Biblioteca Pública",
            des = "Una biblioteca pública con una gran colección de libros, revistas y otros recursos educativos.",
            schedule = "9:00 a 18:00",
            moderator = User(0, "fernando", email = "fer@gmail.com", username = "fer43", password = "11", isModerator = true),
            user = User(3, "alexa", email = "alexa@gmail.com", username = "alexa43", password = "1222", isModerator = false),
            isAuthorised = false
        ))
        MyData.lugares.add(Lugar(
            id = 4,
            name = "Centro Deportivo Municipal",
            des = "Un centro deportivo con instalaciones para practicar varios deportes, como fútbol, básquetbol, tenis y natación.",
            schedule = "9:00 a 20:00",
            moderator = User(1, "andres", email = "andres@gmail.com", username = "andres43", password = "11", isModerator = true),
            user = User(2, "nicolas", email = "nico@gmail.com", username = "nico43", password = "12", isModerator = false),
            isAuthorised = false
        ))

        for (lugar in MyData.lugares){

            val row = TableRow(this)

            val txtName = TextView(this)
            txtName.text = lugar.name
            row.addView(txtName)

            val txtSchedule = TextView(this)
            txtSchedule.text = lugar.schedule
            txtSchedule.setPadding(60, 0,10,0)
            row.addView(txtSchedule)

            tableLayout.addView(row)
        }

        val lugaresByModerator = MyData.lugares.filter { it.moderator.name ==  moderatorForSearch }

        for (lugar in lugaresByModerator){

            val row = TableRow(this)

            val txtName = TextView(this)
            txtName.text = lugar.name
            row.addView(txtName)

            val txtSchedule = TextView(this)
            txtSchedule.text = lugar.schedule
            txtSchedule.setPadding(60, 0,10,0)
            row.addView(txtSchedule)

            tableLayoutByModerator.addView(row)

        }

        btnAutorizarLugar.setOnClickListener {
            val intent = Intent(this, AutorizarLugar::class.java)
            startActivity(intent)
        }

        btnVerAutorizaciones.setOnClickListener {
            val intent = Intent(this, VerAutorizaciones::class.java)
            startActivity(intent)
        }
    }
}