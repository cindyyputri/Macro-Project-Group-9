package com.example.macrochallenge9

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ReservasiActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reservasi)

        val btnNext: Button = findViewById(R.id.button)
        btnNext.setOnClickListener{
            val intent = Intent(this@ReservasiActivity, PaymentActivity::class.java)
            startActivity(intent)
        }
    }
}