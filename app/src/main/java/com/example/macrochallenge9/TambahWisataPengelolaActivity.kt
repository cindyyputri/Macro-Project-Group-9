package com.example.macrochallenge9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class TambahWisataPengelolaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah_wisata_pengelola)

        val btnBack: ImageView = findViewById(R.id.image_back)
        btnBack.setOnClickListener{
            val intent = Intent(this@TambahWisataPengelolaActivity, ProfileActivity::class.java)
            startActivity(intent)
        }

        val btnAdd: Button = findViewById(R.id.tambah_wisata)
        btnAdd.setOnClickListener{
            val intent = Intent(this@TambahWisataPengelolaActivity, TambahWisatake2Activity::class.java)
            startActivity(intent)
        }
    }
}