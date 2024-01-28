package com.aop.DietaAnanasik


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class DietDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diet_details)

        // Pobranie przekazanych danych o diecie
        val nazwaDiety = intent.getStringExtra("NAZWA_DIETY")
        val opisDiety = intent.getStringExtra("OPIS_DIETY")

        // Ustawienie tekstu w odpowiednich widokach
        val textViewNazwaDiety: TextView = findViewById(R.id.textViewNazwaDiety)
        val textViewOpisDiety: TextView = findViewById(R.id.textViewOpisDiety)
        val buttonKupDiete: Button = findViewById(R.id.buttonKupDiete)

        textViewNazwaDiety.text = nazwaDiety
        textViewOpisDiety.text = opisDiety

        // Dodanie obsługi zdarzenia kliknięcia dla przycisku "Kup dietę"
        buttonKupDiete.setOnClickListener {
            // Tutaj możesz dodać kod, który zostanie wykonany po kliknięciu przycisku
            // Na przykład, otwarcie nowej aktywności dla zakupu diety
            val intent = Intent(this, DietPurchaseActivity::class.java)
            startActivity(intent)
        }
    }
}
