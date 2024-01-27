package com.aop.DietaAnanasik

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Przycisk logowania - inicjalizacja i ustawienie nasłuchiwania na kliknięcie
        val loginButton: Button = findViewById(R.id.loginButton)
        loginButton.setOnClickListener {
            // Utwórz Intent, który będzie służył do przejścia do LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent) // Uruchom LoginActivity
        }

        // Przycisk rejestracji - inicjalizacja i ustawienie nasłuchiwania na kliknięcie
        val registerButton: Button = findViewById(R.id.registerButton)
        registerButton.setOnClickListener {
            // Utwórz Intent, który będzie służył do przejścia do RegisterActivity
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent) // Uruchom RegisterActivity
        }
    }
}
