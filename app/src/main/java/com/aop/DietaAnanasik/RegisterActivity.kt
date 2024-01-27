package com.aop.DietaAnanasik

import android.content.Intent
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
                // Załóżmy, że rejestracja jest pomyślna
                Toast.makeText(this, "Rejestracja pomyślna", Toast.LENGTH_SHORT).show()

                // Przekierowanie do LoginActivity
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish() // Zakończenie tej aktywności, aby nie wracać do niej po naciśnięciu przycisku Wstecz
            } else {
                Toast.makeText(this, "Proszę wprowadzić adres e-mail i hasło", Toast.LENGTH_SHORT).show()
            }

        }
    }
}
