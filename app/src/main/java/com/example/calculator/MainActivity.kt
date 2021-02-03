package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun addition(view: View) {

        try {
            var firstEditText: EditText = findViewById<EditText>(R.id.firstNumber)
            val first: Float = firstEditText.text.toString().toFloat()

            var secondEditText: EditText = findViewById(R.id.secondNumber)
            val second: Float = secondEditText.text.toString().toFloat()

            display(first + second)
        } catch (e: Exception) {
            var textView: TextView = findViewById(R.id.instruction)
            textView.text = "Enter correct values"
        }
    }

    fun subtraction(view: View) {

        try {
            val firstEditText: EditText = findViewById<EditText>(R.id.firstNumber)
            val first: Float = firstEditText.text.toString().toFloat()

            val secondEditText: EditText = findViewById(R.id.secondNumber)
            val second: Float = secondEditText.text.toString().toFloat()

            display(first - second)
        } catch (e: Exception) {
            val textView: TextView = findViewById(R.id.instruction)
            textView.text = "Enter correct values"
        }
    }

    fun multiplication(view: View) {

        try {
            val firstEditText: EditText = findViewById<EditText>(R.id.firstNumber)
            val first: Float = firstEditText.text.toString().toFloat()

            val secondEditText: EditText = findViewById(R.id.secondNumber)
            val second: Float = secondEditText.text.toString().toFloat()

            display(first * second)
        } catch (e: Exception) {
            val textView: TextView = findViewById(R.id.instruction)
            textView.text = "Enter correct values"
        }
    }

    fun division(view: View) {
        try {
            val firstEditText: EditText = findViewById<EditText>(R.id.firstNumber)
            val first: Float = firstEditText.text.toString().toFloat()

            val secondEditText: EditText = findViewById(R.id.secondNumber)
            val second: Float = secondEditText.text.toString().toFloat()

            display(first / second)
        } catch (e: Exception) {

            val textView: TextView = findViewById(R.id.instruction)
            textView.text = "Enter correct values"
        }
    }


    private fun display(answer: Float) {
        val intent = Intent(this, ResultActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, answer.toString())
        }

        startActivity(intent)
    }

}
