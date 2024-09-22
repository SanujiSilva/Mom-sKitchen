package com.example.momskitchen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class suggestion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_suggestion)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var button17 = findViewById<Button>(R.id.button17)
        button17.setOnClickListener {
            val intent1 = Intent (this, plan::class.java)
            startActivity(intent1)
        }

        var button18 = findViewById<Button>(R.id.button18)
        button18.setOnClickListener {
            val intent1 = Intent (this, recipe::class.java)
            startActivity(intent1)
        }
        var button19 = findViewById<Button>(R.id.button19)
        button19.setOnClickListener {
            val intent1 = Intent (this, recipe::class.java)
            startActivity(intent1)
        }

        var button20 = findViewById<Button>(R.id.button20)
        button20.setOnClickListener {
            val intent1 = Intent (this, recipe::class.java)
            startActivity(intent1)
        }

        var button21 = findViewById<Button>(R.id.button21)
        button21.setOnClickListener {
            val intent1 = Intent (this, recipe::class.java)
            startActivity(intent1)
        }

        var button22 = findViewById<Button>(R.id.button22)
        button22.setOnClickListener {
            val intent1 = Intent (this, recipe::class.java)
            startActivity(intent1)
        }

        var button23 = findViewById<Button>(R.id.button23)
        button23.setOnClickListener {
            val intent1 = Intent (this, plan::class.java)
            startActivity(intent1)
        }

        val imageView9 = findViewById<ImageView>(R.id.imageView9)
        imageView9.setOnClickListener {
            val intent1 = Intent (this, menu::class.java)
            startActivity(intent1)
        }

        val imageView10= findViewById<ImageView>(R.id.imageView10)
        imageView10.setOnClickListener {
            val intent1 = Intent (this, Profile::class.java)
            startActivity(intent1)
        }

        val imageView13= findViewById<ImageView>(R.id.imageView13)
        imageView13.setOnClickListener {
            val intent1 = Intent (this, login::class.java)
            startActivity(intent1)
        }
    }
}