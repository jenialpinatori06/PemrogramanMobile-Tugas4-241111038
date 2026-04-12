package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvSambutan = findViewById<TextView>(R.id.tvSambutan)
        val tvUsername = findViewById<TextView>(R.id.tvUsername)

        val username = intent.getStringExtra("username") ?: "-"
        tvSambutan.text = "Selamat Datang,"
        tvUsername.text = username
    }
}