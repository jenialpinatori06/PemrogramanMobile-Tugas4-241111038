package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProdukListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_produk_list)

        val rvProduk = findViewById<RecyclerView>(R.id.rvProduk)

        val list = listOf(
            Produk(1, "Laptop Gaming", "Performa tinggi untuk game", "Rp 15.000.000"),
            Produk(2, "Mouse Wireless", "Nyaman tanpa kabel", "Rp 150.000"),
            Produk(3, "Keyboard Mechanical", "Enak untuk mengetik", "Rp 500.000"),
            Produk(4, "Monitor 24 Inch", "Full HD Display", "Rp 2.500.000")
        )

        rvProduk.layoutManager = LinearLayoutManager(this)
        rvProduk.adapter = ProdukAdapter(list)
    }
}