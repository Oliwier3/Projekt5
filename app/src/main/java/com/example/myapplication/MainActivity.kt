package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.widget.CheckBox
import android.widget.RadioButton
import androidx.core.view.isVisible
import com.google.android.material.chip.Chip

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
        val checkbox9 = findViewById<CheckBox>(R.id.check9)
        val chip0 = findViewById<Chip>(R.id.chip0)
        val chip1 = findViewById<Chip>(R.id.chip1)
        val chip2 = findViewById<Chip>(R.id.chip2)
        val chip3 = findViewById<Chip>(R.id.chip3)
        val chip4 = findViewById<Chip>(R.id.chip4)
        val chip5 = findViewById<Chip>(R.id.chip5)
        val chip6 = findViewById<Chip>(R.id.chip6)
        val chip7 = findViewById<Chip>(R.id.chip7)
        val chip8 = findViewById<Chip>(R.id.chip8)
        val chip9 = findViewById<Chip>(R.id.chip9)


        radio2.setOnCheckedChangeListener { compoundButton, b ->
            checkbox0.isVisible = true
            chip0.isVisible = false
            checkbox1.isVisible = true
            chip1.isVisible = false
            checkbox2.isVisible = true
            chip2.isVisible = false
            checkbox3.isVisible = true
            chip3.isVisible = false
            checkbox4.isVisible = true
            chip4.isVisible = false
            checkbox5.isVisible = true
            chip5.isVisible = false
            checkbox6.isVisible = true
            chip6.isVisible = false
            checkbox7.isVisible = true
            chip7.isVisible = false
            checkbox8.isVisible = true
            chip8.isVisible = false
            checkbox9.isVisible = true
            chip9.isVisible = false
        }

        radio1.setOnCheckedChangeListener { compoundButton, b ->
            if (checkbox0.isChecked == false)
                checkbox0.isVisible = false
            else
                chip0.isVisible=true
                checkbox0.isVisible = false

            if (checkbox1.isChecked == false)
                checkbox1.isVisible = false
            else
                chip1.isVisible=true
                checkbox1.isVisible = false

            if (checkbox2.isChecked == false)
                checkbox2.isVisible = false
            else
                chip2.isVisible=true
                checkbox2.isVisible = false

            if (checkbox3.isChecked == false)
                checkbox3.isVisible = false
            else
                chip3.isVisible=true
                checkbox3.isVisible = false

            if (checkbox4.isChecked == false)
                checkbox4.isVisible = false
            else
                chip4.isVisible=true
                checkbox4.isVisible = false

            if (checkbox5.isChecked == false)
                checkbox5.isVisible = false
            else
                chip5.isVisible=true
                checkbox5.isVisible = false

            if (checkbox6.isChecked == false)
                checkbox6.isVisible = false
            else
                chip6.isVisible=true
                checkbox6.isVisible = false

            if (checkbox7.isChecked == false)
                checkbox7.isVisible = false
            else
                chip7.isVisible=true
                checkbox7.isVisible = false

            if (checkbox8.isChecked == false)
                checkbox8.isVisible = false
            else
                chip8.isVisible=true
                checkbox8.isVisible = false

            if (checkbox9.isChecked == false)
                checkbox9.isVisible = false
            else
                chip9.isVisible=true
                checkbox9.isVisible = false

        }
    }
}