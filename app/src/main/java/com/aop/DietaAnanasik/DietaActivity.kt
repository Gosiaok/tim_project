package com.aop.DietaAnanasik
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class DietaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dieta)

        // Definicja listy diet
        val diety = listOf(
            Dieta("Dieta Sportowa", "Dieta Sportowa jest dostosowana do potrzeb aktywnych osób. Skupia się na odpowiednim bilansie węglowodanów, białek i tłuszczów, aby wspierać intensywne treningi i optymalną regenerację."),
            Dieta("Dieta Wege Low IG", "Dieta Wege Low IG polega na spożywaniu produktów roślinnych z niskim indeksem glikemicznym. Pomaga to w stabilizacji poziomu cukru we krwi i jest idealna dla osób dbających o zdrowie metaboliczne."),
            Dieta("Home", "Dieta 'Home' opiera się na zasadach zdrowego, domowego gotowania. Unika przetworzonych produktów, stawiając na świeże składniki i zbilansowane posiłki."),
            Dieta("Dieta Tłuszczowa", "Dieta Tłuszczowa, znana również jako dieta ketogeniczna, polega na wysokim spożyciu tłuszczów i minimalnym węglowodanów. Jest to dieta, która może przyczynić się do szybkiej utraty wagi."),
            Dieta("Low Carb", "Dieta Low Carb koncentruje się na niskim spożyciu węglowodanów. Preferuje białka i tłuszcze, co może przyczynić się do poprawy metabolizmu i utraty wagi."),
            Dieta("No Fish", "Dieta 'No Fish' wyklucza ryby i owoce morza, koncentrując się na innych źródłach białka, takich jak mięso, rośliny strączkowe i nabiał."),
            Dieta("Kuchnia Polska", "Dieta oparta na tradycyjnej kuchni polskiej, bogata w różnorodne, lokalne produkty. Skupia się na zbilansowanych posiłkach z uwzględnieniem sezonowych warzyw i owoców.")
        )

        val listViewDiets: ListView = findViewById(R.id.listViewDiets)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, diety.map { it.nazwa })
        listViewDiets.adapter = adapter

        // Obsługa kliknięcia elementu listy
        listViewDiets.setOnItemClickListener { _, _, position, _ ->
            val wybranaDieta = diety[position]
            AlertDialog.Builder(this)
                .setTitle(wybranaDieta.nazwa)
                .setMessage(wybranaDieta.opis)
                .setPositiveButton("Kup dietę") { _, _ ->
                    // Akcja po kliknięciu przycisku "Kup dietę"
                    val intent = Intent(this, DietPurchaseActivity::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("Zamknij", null)
                .show()
        }

        // Dodanie przycisku "Wyloguj"
        val buttonLogout: Button = findViewById(R.id.buttonLogout)
        buttonLogout.setOnClickListener {
            // Logika wylogowywania
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // Zakończenie aktywności DietaActivity
        }
    }

    data class Dieta(val nazwa: String, val opis: String)
}
