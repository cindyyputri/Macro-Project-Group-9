package com.example.macrochallenge9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class TambahWisatake2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah_wisatake2)

        val btnBack: ImageView = findViewById(R.id.image_back)
        btnBack.setOnClickListener{
            val intent = Intent(this@TambahWisatake2Activity, TambahWisataPengelolaActivity::class.java)
            startActivity(intent)
        }

        val btnAdd: Button = findViewById(R.id.button_tampilkan)
        btnAdd.setOnClickListener{
            val intent = Intent(this@TambahWisatake2Activity, TambahWisataPengelolaActivity::class.java)
            startActivity(intent)
        }
    }
}