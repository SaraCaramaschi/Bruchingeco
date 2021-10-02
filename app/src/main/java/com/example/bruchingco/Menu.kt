package com.example.bruchingco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        // bottone da menu ad appetizers
        val btnApetizzers = findViewById<Button>(R.id.btnApe)
        btnApetizzers.setOnClickListener {
            val intent = Intent(this, Appetizers::class.java)
            startActivity(intent)
        }

    }
}