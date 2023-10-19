package com.example.macrochallenge9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile2)

        val btnAgency: Button = findViewById(R.id.agency)
        btnAgency.setOnClickListener{
            val intent = Intent(this@ProfileActivity, TambahWisataPengelolaActivity::class.java)
            startActivity(intent)
        }
    }
}