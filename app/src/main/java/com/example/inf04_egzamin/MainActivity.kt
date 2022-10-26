package com.example.inf04_egzamin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            if (findViewById<EditText>(R.id.haslo1) == findViewById<EditText>(R.id.haslo2)) {
                findViewById<TextView>(R.id.Welcome).text =
                    "Witaj " + findViewById<TextView>(R.id.mail).text;
            } else findViewById<TextView>(R.id.Welcome).text = "hasla sa rozne";
        }
    }
}