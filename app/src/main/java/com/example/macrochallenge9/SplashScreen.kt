package com.example.macrochallenge9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class SplashScreen : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val btnStart: Button = findViewById(R.id.buttonStarted)
        btnStart.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.buttonStarted -> {
                val intent = Intent(this@SplashScreen, LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }
}