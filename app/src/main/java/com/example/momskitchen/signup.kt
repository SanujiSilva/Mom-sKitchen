package com.example.momskitchen

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class signup : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)

        var button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val intent1 = Intent (this, login::class.java)
            startActivity(intent1)
        }

        var button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val intent1 = Intent (this, login::class.java)
            startActivity(intent1)
        }

    }
}