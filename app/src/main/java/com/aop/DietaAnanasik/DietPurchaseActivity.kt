package com.aop.DietaAnanasik

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class DietPurchaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diet_purchase)

        val dostepneDiety = arrayOf(
            "Dieta Sportowa",
            "Dieta Wege Low IG",
            "Home",
            "Dieta Tłuszczowa",
            "Low Carb",
            "No Fish",
            "Kuchnia Polska"
        )
        val kalorycznosc = arrayOf("1500 kcal", "1800 kcal", "2000 kcal", "2500 kcal", "3000 kcal")

        val spinnerDiety: Spinner = findViewById(R.id.spinnerDiety)
        val spinnerKalorycznosc: Spinner = findViewById(R.id.spinnerKalorycznosc)
        val editTextIloscDni: EditText = findViewById(R.id.editTextIloscDni)

        spinnerDiety.adapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, dostepneDiety)
        spinnerKalorycznosc.adapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, kalorycznosc)

        val buttonKup: Button = findViewById(R.id.buttonKup)
        buttonKup.setOnClickListener {
            val wybranaDieta = spinnerDiety.selectedItem.toString()
            val wybranaKalorycznosc = spinnerKalorycznosc.selectedItem.toString()
            val iloscDni = editTextIloscDni.text.toString()

            val intent = Intent(this, OrderDetailsActivity::class.java)
            intent.putExtra("WYBRANA_DIETA", wybranaDieta)
            intent.putExtra("WYBRANA_KALORYCZNOSC", wybranaKalorycznosc)
            intent.putExtra("ILOSC_DNI", iloscDni)
            startActivity(intent)

            val buttonLogout: Button = findViewById(R.id.buttonLogout)
            buttonLogout.setOnClickListener {
                // Tutaj logika wylogowania
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}


