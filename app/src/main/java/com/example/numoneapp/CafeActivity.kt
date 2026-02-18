package com.example.numoneapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CafeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cafe)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val buttonOne = findViewById<ImageView>(R.id.buttonOne)
        buttonOne.setOnClickListener {

            val intentToMenu = Intent(this, MenuActivity::class.java)
            startActivity(intentToMenu)
        }

        val buttonThree = findViewById<ImageView>(R.id.buttonThree)
        buttonThree.setOnClickListener {

            val intentToMenu = Intent(this, MenuActivity::class.java)
            startActivity(intentToMenu)
        }

        val buttonTwo = findViewById<ImageView>(R.id.buttonTwo)
        buttonTwo.setOnClickListener {

            val intentToMenu = Intent(this, MenuActivity::class.java)
            startActivity(intentToMenu)
        }
    }
}