package com.example.macrochallenge9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ChatPengelolaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_pengelola)

        val btnBack: ImageView = findViewById(R.id.image_back2)
        btnBack.setOnClickListener{
            val intent = Intent(this@ChatPengelolaActivity, ChatActivity::class.java)
            startActivity(intent)
        }
    }
}