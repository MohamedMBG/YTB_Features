package com.example.ytbfeature

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.example.thetests.SemesterActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //defining the ui values
        val videos = findViewById<CardView>(R.id.videos)

        videos.setOnClickListener {
            Toast.makeText(this , "you've chosen videos" , Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SemesterActivity::class.java)
            startActivity(intent)
        }

    }
}