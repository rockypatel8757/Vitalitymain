package com.morgan.vitality

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


    }

    fun intentTologin(view: View) {
        startActivity(Intent(this,LogIn::class.java))

    }
}