package com.example.macrochallenge9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ForumDiskusiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forum_diskusi)

        val btnBack: ImageView = findViewById(R.id.image_back)
        btnBack.setOnClickListener{
            val intent = Intent(this@ForumDiskusiActivity, ForumChatActivity::class.java)
            startActivity(intent)
        }
    }
}