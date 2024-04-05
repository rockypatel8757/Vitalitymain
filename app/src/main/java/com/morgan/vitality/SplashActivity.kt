package com.morgan.vitality

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val pref = getSharedPreferences("login", MODE_PRIVATE)
            val flag = pref.getBoolean("flag", false)

            val intent = if (flag) {
                Intent(this, Home::class.java)
            } else {
                Intent(this, LogIn::class.java)
            }

            startActivity(intent)
            finish()
        }, 2500)

    }
}