package com.example.macrochallenge9

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnLogin: TextView = findViewById(R.id.to_login2)
        btnLogin.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.to_login2-> {
                val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }
}