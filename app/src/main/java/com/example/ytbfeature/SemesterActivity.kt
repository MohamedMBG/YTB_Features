package com.example.thetests

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.example.ytbfeature.R

class SemesterActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)
        supportActionBar?.hide()
        setContentView(R.layout.activity_semester)

        //defining the ui values
        val s1 = findViewById<CardView>(R.id.sem1)
        s1.setOnClickListener {
            Toast.makeText(this , "You've chosen the S2" , Toast.LENGTH_SHORT).show()
        }

    }
}