package com.aop.DietaAnanasik

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen) // Ustawia layout dla ekranu powitalnego

        Handler().postDelayed({
            // Po upływie 3 sekund (3000 ms)
            val intent = Intent(this, MainActivity::class.java) // Tworzy Intent do przejścia do MainActivity
            startActivity(intent) // Rozpoczyna aktywność MainActivity
            finish() // Zamyka aktywność SplashScreenActivity
        }, 3000) // Czas opóźnienia w milisekundach
    }
}
