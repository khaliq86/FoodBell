package com.example.uts_khaliq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar

class DetailActivity : AppCompatActivity() {

//    private lateinit var buttonIntent : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

            val actionBar: ActionBar? = supportActionBar
            actionBar!!.setDisplayHomeAsUpEnabled(true)
            actionBar!!.setDisplayHomeAsUpEnabled(true)

            val namaMakanan = findViewById<TextView>(R.id.nameFood)
            val asalMakanan = findViewById<TextView>(R.id.jAsalMakanan)
            val sampul = findViewById<ImageView>(R.id.foodImageDetail)
            val deskripsi = findViewById<TextView>(R.id.deskMakanan)
            val price = findViewById<TextView>(R.id.hargaMakanan)

            var intent = intent
            val nama = intent.getStringExtra("Nama")
            val asal = intent.getStringExtra("Asal")
            val gambar = intent.getIntExtra("Gambar", 0)
            val desk = intent.getStringExtra("Deskripsi")
            val harga = intent.getStringExtra("Harga")

            actionBar.setTitle(nama)
            namaMakanan.text = nama
            asalMakanan.text = asal
            deskripsi.text = desk
            price.text = harga
            sampul.setImageResource(gambar)



//        buttonIntent = findViewById(R.id.bttn1)
//
//        buttonIntent.setOnClickListener{
//            startActivity(intent)
//            finish()
//            }
        }

}