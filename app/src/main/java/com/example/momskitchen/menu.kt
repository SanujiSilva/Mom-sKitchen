package com.example.momskitchen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_menu)

        var button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            val intent1 = Intent (this, list::class.java)
            startActivity(intent1)
        }

        var button13 = findViewById<Button>(R.id.button13)
        button13.setOnClickListener {
            val intent1 = Intent (this, available::class.java)
            startActivity(intent1)
        }




        var button9 = findViewById<Button>(R.id.button9)
        button9.setOnClickListener {
            val intent1 = Intent (this, plan::class.java)
            startActivity(intent1)
        }



        var button10 = findViewById<Button>(R.id.button10)
        button10.setOnClickListener {
            val intent1 = Intent (this, recipe::class.java)
            startActivity(intent1)
        }


        val imageView11 = findViewById<ImageView>(R.id.imageView11)
        imageView11.setOnClickListener {
            val intent1 = Intent (this, menu::class.java)
            startActivity(intent1)
        }

        val imageView12= findViewById<ImageView>(R.id.imageView12)
        imageView12.setOnClickListener {
            val intent1 = Intent (this, Profile::class.java)
            startActivity(intent1)
        }

        val imageView14= findViewById<ImageView>(R.id.imageView14)
        imageView14.setOnClickListener {
            val intent1 = Intent (this, login::class.java)
            startActivity(intent1)
        }



    }
}