package com.example.exercise1_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var num: Int = 0;

    fun makeUpperLower(view: View) {

        val originalText: EditText = findViewById(R.id.editText)

        val resultText: TextView = findViewById(R.id.textUpperLower)

        val str: String = originalText.text.toString()

        if (num % 2 == 0){
            resultText.text = str.toUpperCase()
        } else {
            resultText.text = str.toLowerCase()
        }

        num++

        if (num == 10) {
            num = 0
        }
    }

    fun countStuff(view: View) {
        val originalText: EditText = findViewById(R.id.editText)
        val resultText: TextView = findViewById(R.id.countChar)

        resultText.text = originalText.text.length.toString()

    }
}
