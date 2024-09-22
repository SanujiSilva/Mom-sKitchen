package com.example.momskitchen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        var button25= findViewById<Button>(R.id.button25)
        button25.setOnClickListener {
            val intent1 = Intent (this, login::class.java)
            startActivity(intent1)
        }

        var button26= findViewById<Button>(R.id.button26)
        button26.setOnClickListener {
            val intent1 = Intent (this, update::class.java)
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