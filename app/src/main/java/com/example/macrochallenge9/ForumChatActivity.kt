package com.example.macrochallenge9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class ForumChatActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forum_chat)

        val btnBack: ImageView = findViewById(R.id.imageView13)
        btnBack.setOnClickListener{
            val intent = Intent(this@ForumChatActivity, ChatActivity::class.java)
            startActivity(intent)
        }

        val btnLogin: ImageView = findViewById(R.id.diskusi3)
        btnLogin.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.diskusi3 -> {
                val intent = Intent(this@ForumChatActivity, ForumDiskusiActivity::class.java)
                startActivity(intent)
            }
        }
    }
}