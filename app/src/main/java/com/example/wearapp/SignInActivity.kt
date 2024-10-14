package com.example.wearapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class SignInActivity : ComponentActivity() {

    private lateinit var login: EditText
    private lateinit var pass: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)


        login = findViewById(R.id.login)
        pass = findViewById(R.id.pass)
    }

    fun signin(view: View) {
        if (login.text.toString().isNotEmpty() && pass.text.toString().isNotEmpty()) {
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Заполните оба поля", Toast.LENGTH_SHORT).show()
        }
    }
}