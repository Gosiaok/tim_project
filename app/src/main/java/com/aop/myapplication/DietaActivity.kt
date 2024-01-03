package com.aop.myapplication
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
            Dieta("Keto", "\n" +
                    "Dieta ketogeniczna to restrykcyjny plan żywieniowy bazujący na wysokim spożyciu tłuszczów, umiarkowanym białka i minimalnym węglowodanów, co prowadzi do stanu zwanego ketozą, w którym organizm spala tłuszcz zamiast glukozy. Jest bogata w produkty takie jak mięsa, ryby, awokado i oleje, podczas gdy ogranicza zboża, cukry i większość owoców. Ta dieta jest często stosowana w celu redukcji wagi, a także może przynosić korzyści osobom z niektórymi schorzeniami metabolicznymi i neurologicznymi. Jednak ze względu na swoje restrykcje, nie jest odpowiednia dla wszystkich, w tym osób z chorobami wątroby, trzustki, nerek, a także dla kobiet w ciąży czy karmiących piersią. Zawsze zaleca się konsultację z dietetykiem lub lekarzem przed rozpoczęciem diety keto."),
            Dieta("Slim", "Dieta \"Slim\" to ogólne określenie dla planów odchudzających, które koncentrują się na niskokalorycznym spożyciu, często zwiększając jednocześnie aktywność fizyczną w celu wspierania utraty wagi. Typowo promuje spożywanie dużych ilości warzyw i owoców, chudych białek, oraz ograniczenie przetworzonych pokarmów i cukrów. Jest to dieta zrównoważona, która może być dostosowana do indywidualnych potrzeb i preferencji, ucząc zdrowych nawyków żywieniowych na dłuższą metę. Zalecana jest dla osób poszukujących stopniowej i stabilnej utraty wagi, ale nie jest przeznaczona dla osób, które mogą potrzebować specjalistycznej diety ze względu na warunki zdrowotne. Zanim ktoś zdecyduje się na dietę \"Slim\", powinien skonsultować się z profesjonalistą zdrowia, aby zapewnić, że plan spełnia wszystkie wymagania żywieniowe."),
            Dieta("Domowa", "Dieta domowa odnosi się do planu żywieniowego opartego na przygotowywaniu posiłków w domu, co pozwala na pełną kontrolę nad składnikami, porcjami i metodami gotowania. Skupia się na całych, nieprzetworzonych produktach, takich jak świeże warzywa, owoce, chude białka i zboża pełnoziarniste, przy jednoczesnym ograniczeniu gotowych dań i szybkiego jedzenia. Taki sposób żywienia może przyczyniać się do zdrowszego stylu życia, promuje umiejętność gotowania i jest dostosowany do indywidualnych potrzeb żywieniowych. Jest to szczególnie korzystne dla rodzin i osób, które chcą dokładnie monitorować swój dzienny spożycie kalorii i składników odżywczych. Dieta domowa jest odpowiednia dla szerokiego zakresu osób, jednak zawsze warto konsultować się z dietetykiem, aby upewnić się, że dieta jest zbilansowana i dostarcza wszystkich niezbędnych składników odżywczych."),
            Dieta("Vege", "Dieta wegetariańska polega na wykluczeniu mięsa i ryb, skupiając się na produktach roślinnych, takich jak warzywa, owoce, rośliny strączkowe, orzechy, nasiona i zboża. Jest bogata w błonnik i składniki odżywcze przy jednoczesnym ograniczeniu tłuszczów nasyconych i cholesterolu. Taki sposób żywienia może przyczyniać się do obniżenia ryzyka chorób sercowo-naczyniowych i poprawy ogólnego stanu zdrowia. Dieta ta jest odpowiednia dla osób w każdym wieku, ale wymaga starannego planowania, aby zapewnić odpowiednią ilość wszystkich niezbędnych składników odżywczych, zwłaszcza białka, żelaza, wapnia i witaminy B12. Zaleca się konsultację z dietetykiem, aby dieta była pełnowartościowa i zrównoważona."),
            Dieta("Sport", "Dieta sportowa, często nazywana dietą dla sportowców, jest planem żywieniowym zaprojektowanym tak, aby wspierać intensywny wysiłek fizyczny i optymalizować wydajność sportową. Charakteryzuje się wysoką zawartością węglowodanów dla zapewnienia energii, umiarkowanym spożyciem białka dla odbudowy i regeneracji mięśni oraz kontrolowanym spożyciem tłuszczów. Dodatkowo, szczególną uwagę kładzie się na odpowiednie nawodnienie oraz dostarczanie elektrolitów, które są kluczowe podczas długotrwałego wysiłku. Dieta taka musi być dostosowana do indywidualnych potrzeb, rodzaju i intensywności treningu, a także dyscypliny sportowej. Zalecana jest dla aktywnych sportowców i osób regularnie ćwiczących, ale wymaga konsultacji z dietetykiem sportowym lub trenerem, aby zapewnić optymalne proporcje składników odżywczych i energetycznych.")
        )
        val listViewDiets: ListView = findViewById(R.id.listViewDiets)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, diety.map { it.nazwa })
        listViewDiets.adapter = adapter

        // Ustawienie nasłuchiwania na kliknięcia w elemencie listy
        listViewDiets.setOnItemClickListener { _, _, position, _ ->
            val wybranaDieta = diety[position]
            AlertDialog.Builder(this)
                .setTitle(wybranaDieta.nazwa)
                .setMessage(wybranaDieta.opis)
                .setPositiveButton("Zamknij", null)
                .show()
        }
    }

    // Klasa Dieta
    data class Dieta(val nazwa: String, val opis: String)
    class DietaActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_dieta)

            // ... (inicjalizacja ListView i adaptera)

            // Inicjalizacja przycisku "Kup dietę"
            val buttonBuyDiet: Button = findViewById(R.id.buttonBuyDiet)

            buttonBuyDiet.setOnClickListener {
                // Wywołanie metody obsługującej proces zakupu diety
                startDietPurchaseProcess()
            }
        }

        private fun startDietPurchaseProcess() {
            // Tutaj dodaj kod do wyświetlenia nowego ekranu lub dialogu, gdzie użytkownik może wybrać dietę
            // Możesz użyć Intent do przejścia do nowej aktywności, np. DietPurchaseActivity
        }

        // ... (pozostały kod DietaActivity)
    }

}


