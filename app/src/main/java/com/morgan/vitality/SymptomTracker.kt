package com.morgan.vitality

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SymptomTracker : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_symptom_tracker)

        textView = findViewById(R.id.textView123)

        // Start the animation loop
        animateText()
    }

    private fun animateText() {
        // Define the text values
        val textValues = arrayOf("PCOD", "PCOS")

        // Start the animation loop
        val handler = Handler()
        var currentIndex = 2
        val delay = 500L // Adjust the delay between animations

        // Runnable to perform the animation loop
        val runnable = object : Runnable {
            override fun run() {
                val currentText = textView.text.toString()

                // Backspace animation
                if (currentText.length > 0) {
                    textView.text = currentText.substring(0, currentText.length - 1)
                } else {
                    // Change to the next text value
                    currentIndex = (currentIndex + 1) % textValues.size
                    textView.text = textValues[currentIndex]
                }

                // Repeat the animation loop
                handler.postDelayed(this, delay)
            }
        }

        // Start the initial animation loop
        handler.postDelayed(runnable, delay)
    }

    fun intentToPCOS(view: View) {
        var intent= Intent(this,Home::class.java)
        intent.putExtra("disease","PCOS")
        startActivity(intent)

    }
    fun intentToPCOD(view: View) {
        var intent= Intent(this,Home::class.java)
        intent.putExtra("disease","PCOD")
        startActivity(intent)
    }
}