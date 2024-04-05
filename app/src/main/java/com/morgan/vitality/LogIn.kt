package com.morgan.vitality

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)


        findViewById<AppCompatButton>(R.id.loginButton).setOnClickListener {

            startActivity(Intent(this,SymptomTracker::class.java))

        }

    }

    fun intentToSignUp(view: View) {
        startActivity(Intent(this@LogIn,SignUp::class.java))
//        finish()
    }

    override fun onBackPressed() {
        var f= 0
        if (f==1)
        super.onBackPressed()
        else{
            Toast.makeText(this, "Please Wait", Toast.LENGTH_SHORT).show()

        }
    }
}