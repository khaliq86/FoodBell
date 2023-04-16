package com.example.uts_khaliq

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

//    private lateinit var buttonIntent : Button
    companion object{
        val INTENT = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rv_makanan)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        recyclerView.adapter = MakananAdapter(makananList, this)

        val button1 = findViewById<View>(R.id.rv_makanan) as RecyclerView

        button1.setOnClickListener{
            val intent = Intent (this, DetailActivity::class.java)
            intent.putExtra(INTENT,1)
            startActivity(intent)
        }

    }

}