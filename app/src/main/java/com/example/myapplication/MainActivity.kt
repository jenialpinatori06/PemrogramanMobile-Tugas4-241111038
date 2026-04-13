package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.card.MaterialCardView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvSambutan = findViewById<TextView>(R.id.tvSambutan)
        val tvUsername = findViewById<TextView>(R.id.tvUsername)

        val username = intent.getStringExtra("username") ?: "-"
        tvSambutan.text = "Selamat Datang,"
        tvUsername.text = username

        val cardProduk = findViewById<MaterialCardView>(R.id.cardProduk)

        cardProduk.setOnClickListener {
            val intent = Intent(this, ProdukListActivity::class.java)
            startActivity(intent)
        }
    }
}