package com.aop.DietaAnanasik

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class OrderDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_details)

        val editTextImie: EditText = findViewById(R.id.editTextImie)
        val editTextNazwisko: EditText = findViewById(R.id.editTextNazwisko)
        val editTextAdres: EditText = findViewById(R.id.editTextAdres)
        val editTextNumerKarty: EditText = findViewById(R.id.editTextNumerKarty)
        val buttonZlozZamowienie: Button = findViewById(R.id.buttonZlozZamowienie)

        buttonZlozZamowienie.setOnClickListener {
            // Tutaj możesz dodać logikę walidacji danych

            // Wyświetlenie komunikatu o złożeniu zamówienia
            Toast.makeText(this, "Zamówienie zostało złożone", Toast.LENGTH_LONG).show()

            // Przekierowanie do aktywności wyboru diety
            val intent = Intent(this, DietaActivity::class.java)
            startActivity(intent)
            finish() // Zakończenie tej aktywności
        }
    }
}
