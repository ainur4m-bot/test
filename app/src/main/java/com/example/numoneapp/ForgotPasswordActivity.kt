package com.example.numoneapp

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_forgot_password)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val buttonToVerif = findViewById<ImageButton>(R.id.buttonToVerif)
        buttonToVerif.setOnClickListener {


            val intent = Intent(this, TwoFactorVerificationActivity::class.java)
            startActivity(intent)
        }

        val backToAuth = findViewById<ImageView>(R.id.backToAuthorization)
        backToAuth.setOnClickListener {

            val intentToAuth = Intent(this, AuthorizationActivity::class.java)
            startActivity(intentToAuth)
        }

    }
}