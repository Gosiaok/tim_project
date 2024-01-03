package com.aop.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class DietPurchaseActivity extends Activity {

    private Spinner spinnerCalories;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_purchase); // Upewnij się, że masz taki layout.

        // Inicjalizacja Spinner do wyboru kaloryczności
        spinnerCalories = findViewById(R.id.spinnerCalories);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.calories_array, android.R.layout.simple_spinner_item); // Załóżmy, że masz tablicę kaloryczności zdefiniowaną w resources.
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCalories.setAdapter(adapter);

        // Inicjalizacja przycisku do składania zamówienia
        buttonSubmit = findViewById(R.id.buttonSubmit);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitOrder();
            }
        });

    }

    private void submitOrder() {
        String selectedCalories = spinnerCalories.getSelectedItem().toString();
        Toast.makeText(this, "Zamówienie na dietę: " + selectedCalories + " zostało złożone.", Toast.LENGTH_SHORT).show();
    }

}
