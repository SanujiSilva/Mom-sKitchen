package com.example.momskitchen

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class list : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val spinner: Spinner = findViewById(R.id.spinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.Item1,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }

        val spinner2: Spinner = findViewById(R.id.spinner2)
        ArrayAdapter.createFromResource(
            this,
            R.array.Item2,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner2.adapter = adapter
        }

        val spinner3: Spinner = findViewById(R.id.spinner3)
        ArrayAdapter.createFromResource(
            this,
            R.array.Item3,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner3.adapter = adapter
        }

        val spinner4: Spinner = findViewById(R.id.spinner4)
        ArrayAdapter.createFromResource(
            this,
            R.array.Item4,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner4.adapter = adapter
        }

        var button11 = findViewById<Button>(R.id.button11)
        button11.setOnClickListener {
            val intent1 = Intent(this, menu::class.java)
            startActivity(intent1)
        }

        var button12 = findViewById<Button>(R.id.button12)
        button12.setOnClickListener {
            val intent1 = Intent(this, menu::class.java)
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
