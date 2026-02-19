package com.example.numoneapp

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.toColorInt
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val data = getSharedPreferences("userData",MODE_PRIVATE)
        val name = data.getString("name","")

        val nameUser = findViewById<TextView>(R.id.nameUser)
        nameUser.text = "$name"

        val toOrder = findViewById<ImageView>(R.id.buttonOne)
        val toOrder2 = findViewById<ImageView>(R.id.buttonTwo)
        val toOrder3 = findViewById<ImageView>(R.id.buttonThree)
        val toOrder4 = findViewById<ImageView>(R.id.buttonFour)
        val toOrder5 = findViewById<ImageView>(R.id.buttonFive)
        val toOrder6 = findViewById<ImageView>(R.id.buttonSix)

        toOrder.setOnClickListener {
            val intentToOrder = Intent(this, OrderOptionsActivity::class.java)
            startActivity(intentToOrder)
        }

        toOrder2.setOnClickListener {
            val intentToOrder = Intent(this, OrderOptionsActivity::class.java)
            startActivity(intentToOrder)
        }

        toOrder3.setOnClickListener {
            val intentToOrder = Intent(this, OrderOptionsActivity::class.java)
            startActivity(intentToOrder)
        }

        toOrder4.setOnClickListener {
            val intentToOrder = Intent(this, OrderOptionsActivity::class.java)
            startActivity(intentToOrder)
        }
        toOrder5.setOnClickListener {
            val intentToOrder = Intent(this, OrderOptionsActivity::class.java)
            startActivity(intentToOrder)
        }
        toOrder6.setOnClickListener {
            val intentToOrder = Intent(this, OrderOptionsActivity::class.java)
            startActivity(intentToOrder)
        }


        val toProfile = findViewById<ImageView>(R.id.profileIcon)
        toProfile.setOnClickListener {

            val intentToProfile = Intent(this, ProfileActivity::class.java)
            startActivity(intentToProfile)
        }

        val shop = findViewById<ImageView>(R.id.shopIcon)
        shop.setOnClickListener {

            val intent = Intent(this, OrderCurrentActivity::class.java)
            startActivity(intent)
        }
    }
}