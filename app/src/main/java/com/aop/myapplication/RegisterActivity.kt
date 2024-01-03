package com.aop.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val emailEditText: EditText = findViewById(R.id.editTextEmail)
        val passwordEditText: EditText = findViewById(R.id.editTextPassword)
        val registerButton: Button = findViewById(R.id.buttonRegister)

        registerButton.setOnClickListener {
            val email = emailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                // Tutaj dodaj logikę rejestracji (np. zapis do bazy danych, Firebase itp.)
                Toast.makeText(this, "Rejestracja...", Toast.LENGTH_SHORT).show()

                // Po pomyślnej rejestracji, możesz przekierować do LoginActivity lub innego ekranu
            } else {
                Toast.makeText(this, "Proszę wprowadzić adres e-mail i hasło", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
