package com.example.androidtest

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.androidtest.conexion.MyData
import com.example.androidtest.models.User
import com.example.androidtest.vistas.ModeratorHome
import com.example.androidtest.vistas.RegisterUser
import com.example.androidtest.vistas.UserHome
import com.google.android.material.button.MaterialButton


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val txtForgotPassword = findViewById<TextView>(R.id.txtForgotPassword)
        val btnRegister = findViewById<MaterialButton>(R.id.btnRegister)
        val btnLogin = findViewById<MaterialButton>(R.id.btnLogin)
        val txtEmail = findViewById<TextView>(R.id.txtEmailLogin)
        val txtPassword = findViewById<TextView>(R.id.txtPasswordLogin)




        btnRegister.setOnClickListener {
            val intent = Intent(this, RegisterUser::class.java)
            startActivity(intent)
        }
        
        btnLogin.setOnClickListener {
            login(txtEmail, txtPassword)
        }

        txtForgotPassword.setOnClickListener {

        }
    }

    private fun login(txtEmail: TextView?, txtPassword: TextView?) {
        val hasData = txtEmail!!.text.isNotEmpty() && txtPassword!!.text.isNotEmpty()

        if (hasData){
            val users = MyData.users
            users.add(User(0, "fernando", email = "fer@gmail.com", username = "fer43", password = "11", isModerator = true))
            users.add(User(1, "andres", email = "andres@gmail.com", username = "andres43", password = "11", isModerator = true))
            users.add(User(2, "nicolas", email = "nico@gmail.com", username = "nico43", password = "12", isModerator = false))
            users.add(User(3, "alexa", email = "alexa@gmail.com", username = "alexa43", password = "1222", isModerator = false))


            val foundUser = findUserByEmailAndPassword(
                email = txtEmail.text.toString(),
                password = txtPassword!!.text.toString(),
                users = users
            )

            if (foundUser != null){
                println("User found ${foundUser}")

                if (foundUser.isModerator){

                    val intent = Intent(this, ModeratorHome::class.java)
                    startActivity(intent)
                } else {

                    val intent = Intent(this, UserHome::class.java)
                    startActivity(intent)
                }
            } else {
                println("User not found.")
            }
        }
    }

    private fun findUserByEmailAndPassword(email: String, password: String, users: List<User>): User? {
        return users.find { it.email == email && it.password == password }
    }
}
