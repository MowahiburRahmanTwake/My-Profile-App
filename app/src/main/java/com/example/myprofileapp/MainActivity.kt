package com.example.myprofileapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val showToastButton = findViewById<Button>(R.id.showToastButton)
        val bmi = 22.86
        showToastButton.setOnClickListener {
            Toast.makeText(this, "আমার BMI: ${"%.2f".format(bmi)}", Toast.LENGTH_SHORT).show()
        }

    }
}