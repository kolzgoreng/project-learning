package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {

    lateinit var btnSignin : Button
    lateinit var btnCreateAccount : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnSignin = findViewById(R.id.btn_sign_in)
        btnCreateAccount = findViewById(R.id.btn_create_account)

        btnCreateAccount.setOnClickListener {
            val intent = Intent(this,RegistrationActivity::class.java)
            startActivity(intent)
        }
    }
}