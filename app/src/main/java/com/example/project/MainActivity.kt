package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnProfile: CardView = findViewById(R.id.Profile)
        val btnSchool: CardView = findViewById(R.id.school)


        btnProfile.setOnClickListener {
            val Intent = Intent(this, profile::class.java)
            startActivity(Intent)

        }
        btnSchool.setOnClickListener {
            Toast.makeText(this, "ini tombol school", Toast.LENGTH_SHORT).show()
        }
    }
}