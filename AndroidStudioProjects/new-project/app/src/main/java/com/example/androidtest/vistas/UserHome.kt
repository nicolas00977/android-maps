package com.example.androidtest.vistas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidtest.R
import com.google.android.material.button.MaterialButton

class UserHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_home)

        val btnCreateLugar = findViewById<MaterialButton>(R.id.btnCreateLugar)
        val btnLogout = findViewById<MaterialButton>(R.id.btnCerarSesion)

        btnCreateLugar.setOnClickListener {
            val intent = Intent(this, CreateLugar::class.java)
            startActivity(intent)
        }

        btnLogout.setOnClickListener {
            finish()
        }
    }
}