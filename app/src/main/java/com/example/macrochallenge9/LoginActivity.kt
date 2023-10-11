package com.example.macrochallenge9

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnSignUp: TextView = findViewById(R.id.to_register2)
        btnSignUp.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.to_register2 -> {
                val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
                startActivity(intent)
            }
        }
    }


}