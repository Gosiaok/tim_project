package com.aop.DietaAnanasik

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DietPurchaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diet_purchase)

        // Definicje dostępnych diet i kaloryczności
        val dostepneDiety = arrayOf(
            "Dieta Sportowa",
            "Dieta Wege",
            "Home",
            "Dieta Tłuszczowa",
            "Low Carb",
            "No Fish",
            "Kuchnia Polska",
            "Low IG"
        )
        val kalorycznosc = arrayOf("1500 kcal", "1800 kcal", "2000 kcal", "2500 kcal", "3000 kcal")

        // Inicjalizacja spinnerów
        val spinnerDiety: Spinner = findViewById(R.id.spinnerDiety)
        val spinnerKalorycznosc: Spinner = findViewById(R.id.spinnerKalorycznosc)
        val editTextIloscDni: EditText = findViewById(R.id.editTextIloscDni)

        // Ustawienie adapterów dla spinnerów
        spinnerDiety.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, dostepneDiety)
        spinnerKalorycznosc.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, kalorycznosc)

        // Obsługa przycisku kupna
        val buttonKup: Button = findViewById(R.id.buttonKup)
        buttonKup.setOnClickListener {
            val wybranaDieta = spinnerDiety.selectedItem.toString()
            val wybranaKalorycznosc = spinnerKalorycznosc.selectedItem.toString()
            val iloscDni = editTextIloscDni.text.toString()

            // Tutaj możesz dodać logikę przetwarzania zamówienia

            // Wyświetlenie komunikatu o złożeniu zamówienia
            Toast.makeText(this, "Zamówienie zostało złożone", Toast.LENGTH_LONG).show()

            // Przejście do aktywności DietaActivity
            val intentToDietaActivity = Intent(this, DietaActivity::class.java)
            startActivity(intentToDietaActivity)
            finish() // Zakończenie aktywności DietPurchaseActivity
        }

        // Obsługa przycisku wylogowania
        val buttonLogout: Button = findViewById(R.id.buttonLogout)
        buttonLogout.setOnClickListener {
            // Wylogowanie i powrót do ekranu logowania
            val intentLogout = Intent(this, LoginActivity::class.java)
            startActivity(intentLogout)
            finish()
        }
    }
}
