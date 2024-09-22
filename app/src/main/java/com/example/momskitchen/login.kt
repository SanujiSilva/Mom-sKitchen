package com.example.momskitchen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_login)

        var button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent1 = Intent (this, menu::class.java)
            startActivity(intent1)
        }

        val textView1 = findViewById<TextView>(R.id.textView1)
        textView1.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
            }
        val textView3 = findViewById<TextView>(R.id.textView3)
        textView3.setOnClickListener {
            val intent = Intent(this, reset::class.java)
            startActivity(intent)
            }
    }
}