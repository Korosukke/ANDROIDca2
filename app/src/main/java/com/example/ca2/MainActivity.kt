package com.example.ca2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var clearButton = findViewById<Button>(R.id.clearButton)
        var tv1 = findViewById<TouchDemo>(R.id.textView2)
        var tv2 = findViewById<TouchDemo>(R.id.textView3)
        clearButton.setOnClickListener {
            tv1.text = ""
            tv2.text = ""
        }
    }


}