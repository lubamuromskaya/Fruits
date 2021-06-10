package com.example.fruits

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val textViewRes: TextView? = findViewById(R.id.textViewResult)

        if (textViewRes != null) {
            textViewRes.text = PREDICTION_RESULT.get()
        }
    }
}