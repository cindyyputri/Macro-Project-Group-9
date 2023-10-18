package com.example.macrochallenge9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView

class DestinationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destination)

        val btnDst: CardView = findViewById(R.id.dst1)
        btnDst.setOnClickListener{
            val intent = Intent(this@DestinationActivity, InfoDestinationActivity::class.java)
            startActivity(intent)
        }
    }
}