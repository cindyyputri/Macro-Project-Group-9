package com.example.macrochallenge9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class InfoDestinationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_destination)

        val btnBook: Button = findViewById(R.id.btnBook)
        btnBook.setOnClickListener{
            val intent = Intent(this@InfoDestinationActivity, ReservasiActivity::class.java)
            startActivity(intent)
        }
    }
}