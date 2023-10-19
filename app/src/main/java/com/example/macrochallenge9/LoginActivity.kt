package com.example.macrochallenge9

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edtEmail = findViewById(R.id.edt_email)
        edtPassword = findViewById(R.id.edt_password)

        val bundle = intent.extras
        if (bundle != null) {
            edtEmail.setText(bundle.getString("email"))
            edtPassword.setText(bundle.getString("password"))
        }

        val btnSignUp: TextView = findViewById(R.id.to_register2)
        btnSignUp.setOnClickListener{
            val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(intent)
        }

        val btnLogin: Button = findViewById(R.id.button)
        btnLogin.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.button -> {
                val intent = Intent(this@LoginActivity, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }


}