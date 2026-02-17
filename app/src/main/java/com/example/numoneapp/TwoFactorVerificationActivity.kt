package com.example.numoneapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TwoFactorVerificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_two_factor_verification)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val backToForgot = findViewById<ImageView>(R.id.backToForgot)
        backToForgot.setOnClickListener {

            val intentToForgot = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intentToForgot)
        }

        val toResetPass = findViewById<ImageButton>(R.id.buttonToResetPass)
        toResetPass.setOnClickListener {

            val intentToResetPass = Intent(this, ResetPasswordActivity::class.java)
            startActivity(intentToResetPass)
        }
    }
}