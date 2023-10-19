package com.example.macrochallenge9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ChatActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        val btnPlus: ImageView = findViewById(R.id.imageView12)
        btnPlus.setOnClickListener{
            val intent = Intent(this@ChatActivity, ForumChatActivity::class.java)
            startActivity(intent)
        }

        val btnToTWC: ImageView = findViewById(R.id.imageView11)
        btnToTWC.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.imageView11 -> {
                val intent = Intent(this@ChatActivity, ChatPengelolaActivity::class.java)
                startActivity(intent)
            }
        }
    }
}