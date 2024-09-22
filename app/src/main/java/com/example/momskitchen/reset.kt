package com.example.momskitchen

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class reset : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_reset)

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent1 = Intent (this, login::class.java)
            startActivity(intent1)
        }




        val textView6 = findViewById<TextView>(R.id.textView6)
        textView6.setOnClickListener {
            val intent = Intent(this, reset::class.java)
            startActivity(intent)
        }

        var button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
            val intent1 = Intent (this, reset::class.java)
            startActivity(intent1)
        }

        var button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener {
            val intent1 = Intent (this, login::class.java)
            startActivity(intent1)
        }

    }
}