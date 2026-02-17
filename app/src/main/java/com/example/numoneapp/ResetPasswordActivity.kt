package com.example.numoneapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResetPasswordActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_reset_password)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val toVerif = findViewById<ImageView>(R.id.backToVerif)
        toVerif.setOnClickListener {

            val intentToVerif = Intent(this, TwoFactorVerificationActivity::class.java)
            startActivity(intentToVerif)
        }

        val toAutorization = findViewById<ImageButton>(R.id.buttonToAuthorization)
        toAutorization.setOnClickListener {

            val intentToAuthorization = Intent(this, AuthorizationActivity::class.java)
            startActivity(intentToAuthorization)
        }

    }
}