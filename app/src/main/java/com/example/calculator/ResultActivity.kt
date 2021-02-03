package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val answer = intent.getStringExtra(EXTRA_MESSAGE)

        val textView = findViewById<TextView>(R.id.resultTextView).apply {
            text = answer
        }

    }

    fun returnToMainActivity(view: View) {
        super.onBackPressed()
    }
}