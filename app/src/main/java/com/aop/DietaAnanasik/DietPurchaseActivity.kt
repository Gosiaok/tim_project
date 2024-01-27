package com.aop.DietaAnanasik

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity


class DietPurchaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diet_purchase)

        // Przykładowe dane dla spinnerów - należy je dostosować do potrzeb aplikacji
        val kalorycznosc = arrayOf("1200 kcal", "1500 kcal", "1800 kcal", "2000 kcal", "2500 kcal", "3000 kcal")
        val czasTrwania = arrayOf("7 dni", "20 dni", "30 dni", "7 dni bez weekendow", "20 dni bez weekendow", "30 dni bez weekendow")

        // Inicjalizacja spinnerów
        val spinnerKalorycznosc: Spinner = findViewById(R.id.spinnerKalorycznosc)
        val spinnerCzasTrwania: Spinner = findViewById(R.id.spinnerCzasTrwania)

        // Ustawienie adapterów dla spinnerów
        spinnerKalorycznosc.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, kalorycznosc)
        spinnerCzasTrwania.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, czasTrwania)

        // Inicjalizacja i obsługa przycisku "Kup"
        val buttonKup: Button = findViewById(R.id.buttonKup)
        buttonKup.setOnClickListener {
            // Przejście do OrderDetailsActivity z wybranymi opcjami diety
            val intent = Intent(this, OrderDetailsActivity::class.java)
            // Możesz przekazać wybrane opcje jako dodatkowe dane w intencie
            intent.putExtra("WYBRANA_KALORYCZNOSC", spinnerKalorycznosc.selectedItem.toString())
            intent.putExtra("WYBRANY_CZAS_TRWANIA", spinnerCzasTrwania.selectedItem.toString())
            startActivity(intent)
        }
    }
}
