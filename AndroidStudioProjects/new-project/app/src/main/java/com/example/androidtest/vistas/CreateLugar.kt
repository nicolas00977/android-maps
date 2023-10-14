package com.example.androidtest.vistas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.example.androidtest.R
import com.example.androidtest.conexion.MyData
import com.example.androidtest.models.Lugar
import com.example.androidtest.models.User
import com.google.android.material.button.MaterialButton

class CreateLugar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_lugar)

        val txtName = findViewById<EditText>(R.id.tv_name)
        val txtDesp = findViewById<EditText>(R.id.tv_desp_lugar)
        val txtSchedule = findViewById<EditText>(R.id.tv_schedule)

        val btnCreateLugar = findViewById<MaterialButton>(R.id.btnCreateLugar)

        btnCreateLugar.setOnClickListener {
            val list = MyData.lugares
            // limpia los elementos y se va
            val lu = Lugar(
                id = 6,
                name = txtName.text.toString(),
                des = txtDesp.text.toString(),
                schedule = txtSchedule.text.toString(),
                moderator = User(id= 9,
                                name="",
                                email= "",
                                username= "",
                                password= "",
                                isModerator= false
                            ),
                user = User(id= 10,
                    name="Messi",
                    email= "messo@gmail.com",
                    username= "MessiTheBest",
                    password= "Messi123",
                    isModerator= false
                ),
                isAuthorised = false)
            list.add(lu)
            Toast.makeText(this, "Muy bien, se creo el lugar ${lu.name}", Toast.LENGTH_SHORT).show()
            finish()
        }

    }
}