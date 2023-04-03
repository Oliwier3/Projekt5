package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radio1 = findViewById<RadioButton>(R.id.radio1)
        val radio2 = findViewById<RadioButton>(R.id.radio2)

    }
}