package com.aop.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Pobranie referencji do widoków
        val emailEditText: EditText = findViewById(R.id.editTextEmail)
        val passwordEditText: EditText = findViewById(R.id.editTextPassword)
        val loginButton: Button = findViewById(R.id.buttonLogin)
        val backButton: Button = findViewById(R.id.backButton)

        // Ustawienie nasłuchiwania na przycisk cofania
        backButton.setOnClickListener {
            onBackPressed() // Wywołaj domyślną akcję przycisku Cofnij
        }

        // Ustawienie nasłuchiwania na przycisk logowania
        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                val intent = Intent(this, DietaActivity::class.java)
                startActivity(intent)
                finish() // Zakończ działanie LoginActivity
            } else {
                Toast.makeText(this, "Proszę wprowadzić adres e-mail i hasło", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
    }

