package com.example.androidfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_toast_example.*
import kotlinx.android.synthetic.main.custom_toast.*

class ToastActivityExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast_example)

        btnShowToast.setOnClickListener{
        //    Toast.makeText(this,"Hi I'm a Toast",Toast.LENGTH_LONG).show()
            Toast(this).apply {
                duration = Toast.LENGTH_LONG
                view = layoutInflater.inflate(R.layout.custom_toast,clCustomToast)
                show()
            }
        }
    }
}