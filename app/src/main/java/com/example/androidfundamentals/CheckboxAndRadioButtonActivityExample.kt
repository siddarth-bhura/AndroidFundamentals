package com.example.androidfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_checkbox_and_radio_button_example.*

class CheckboxAndRadioButtonActivityExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox_and_radio_button_example)

        btnOrder.setOnClickListener{
            // To identify which radio button is checked and get it's id.
            val checkedVeggieRadioButtonId = rgVeggies.checkedRadioButtonId
            // To store that retrived id into a variable
            val veggie = findViewById<RadioButton>(checkedVeggieRadioButtonId)
            val coke = cbCoke.isChecked
            val pepsi = cbPepsi.isChecked
            val orderString = " You ordered a pizza with \n " +
                    "${veggie.text}" +
                    (if(coke) "\nCoke" else "") +
                    (if(pepsi) "\nPepsi" else "")
            tvOrder.text = orderString
        }
    }
}