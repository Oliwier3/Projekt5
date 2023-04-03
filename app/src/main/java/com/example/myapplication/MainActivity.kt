package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.widget.CheckBox
import android.widget.RadioButton
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radio1 = findViewById<RadioButton>(R.id.radio1)
        val radio2 = findViewById<RadioButton>(R.id.radio2)
        val checkbox0 = findViewById<CheckBox>(R.id.check)
        val checkbox1 = findViewById<CheckBox>(R.id.check1)
        val checkbox2 = findViewById<CheckBox>(R.id.check2)
        val checkbox3 = findViewById<CheckBox>(R.id.check3)
        val checkbox4 = findViewById<CheckBox>(R.id.check4)
        val checkbox5 = findViewById<CheckBox>(R.id.check5)
        val checkbox6 = findViewById<CheckBox>(R.id.check6)
        val checkbox7 = findViewById<CheckBox>(R.id.check7)
        val checkbox8 = findViewById<CheckBox>(R.id.check8)
        val checkbox9 = findViewById<CheckBox>(R.id.check1)

        radio2.setOnCheckedChangeListener { compoundButton, b ->
            checkbox0.isVisible = true
            checkbox1.isVisible = true
            checkbox2.isVisible = true
            checkbox3.isVisible = true
            checkbox4.isVisible = true
            checkbox5.isVisible = true
            checkbox6.isVisible = true
            checkbox7.isVisible = true
            checkbox8.isVisible = true
            checkbox9.isVisible = true
        }

        radio1.setOnCheckedChangeListener { compoundButton, b ->
            if (checkbox0.isChecked == false)
                checkbox0.isVisible = false

            if (checkbox1.isChecked == false)
                checkbox1.isVisible = false

            if (checkbox2.isChecked == false)
                checkbox2.isVisible = false

            if (checkbox3.isChecked == false)
                checkbox3.isVisible = false

            if (checkbox4.isChecked == false)
                checkbox4.isVisible = false

            if (checkbox5.isChecked == false)
                checkbox5.isVisible = false

            if (checkbox6.isChecked == false)
                checkbox6.isVisible = false

            if (checkbox7.isChecked == false)
                checkbox7.isVisible = false

            if (checkbox8.isChecked == false)
                checkbox8.isVisible = false

            if (checkbox9.isChecked == false)
                checkbox9.isVisible = false

        }
    }
}