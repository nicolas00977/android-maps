package com.example.androidtest.vistas
import android.os.Bundle
import android.text.Editable
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.androidtest.R
import com.example.androidtest.conexion.MyData
import com.example.androidtest.models.User
import com.google.android.material.button.MaterialButton
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class RegisterUser : AppCompatActivity() {


    var listUser: MutableList<User> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_user)

        val btnReturn = findViewById<TextView>(R.id.btnReturn)
        val txtemail = findViewById<EditText>(R.id.txtEmail)
        val txtPassword = findViewById<EditText>(R.id.txtPassword)
        val txtname = findViewById<EditText>(R.id.txtName)
        val btnRegister = findViewById<MaterialButton>(R.id.btnRegistrar)



        // regresar a la pagina del login
        btnReturn.setOnClickListener {
            finish()
        }

        btnRegister.setOnClickListener {
            createUser(txtemail, txtPassword, txtname)
        }
    }

    private fun createUser(

        txtemail: EditText,
        txtPassword: EditText,
        txtname: EditText,

        ) {

        val hasData = txtemail.text.isNotEmpty() && txtPassword.text.isNotEmpty()

        if (hasData){


            GlobalScope.launch {

                val user = User(id = 0, name = txtname.text.toString(), email = txtemail.text.toString(), username = "Andres@gmail.com", password = txtPassword.text.toString(), isModerator = false)
                MyData.users.add(user)
                finish()
                println("se a creado un nuevo usuario : ${MyData.users[0]}")
            }


        }
    }

    private fun clearData(txtEmail: EditText, txtPassword: EditText, txtName: EditText) {
        TODO("Not yet implemented")
        txtEmail.setText("")
        txtPassword.setText("")
        txtName.setText("")
    }


}






