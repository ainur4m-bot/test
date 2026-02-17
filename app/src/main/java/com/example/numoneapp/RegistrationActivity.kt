package com.example.numoneapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.intellij.lang.annotations.Pattern

class RegistrationActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registration)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val toAuthorization = findViewById<TextView>(R.id.toAuthorization)
        toAuthorization.setOnClickListener {

            val intent = Intent(this, AuthorizationActivity::class.java)
            startActivity(intent)
        }


        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val isPasswordOpen = false
        val eyeIcon = findViewById<ImageView>(R.id.eyeIcon)

        eyeIcon.setOnClickListener {
            if(isPasswordOpen) {
                passwordEditText.transformationMethod =
                    PasswordTransformationMethod.getInstance()

            }
            if(!isPasswordOpen) {
                passwordEditText.transformationMethod =
                    HideReturnsTransformationMethod.getInstance()
            }


        }

        val toStartup = findViewById<ImageButton>(R.id.buttonToStartup)
        toStartup.setOnClickListener {

            val intentToStartup = Intent(this, StartupActivity::class.java)
            startActivity(intentToStartup)
        }
    }
}