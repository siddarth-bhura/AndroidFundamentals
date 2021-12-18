package com.example.androidfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_text_view_example.*

class TextViewActivityExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view_example)

        var count = 0
        btnCount.setOnClickListener{
            count ++
            tvCount.text = "Let's count together: $count"
        }
    }
}