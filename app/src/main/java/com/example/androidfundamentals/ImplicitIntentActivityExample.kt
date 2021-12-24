package com.example.androidfundamentals

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import kotlinx.android.synthetic.main.activity_implicit_intent_example.*

class ImplicitIntentActivityExample : AppCompatActivity() {


    val choosePicure=Intent().apply {
        action=Intent.ACTION_GET_CONTENT
        type="image/*"
    }

    val resultContract = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        result: ActivityResult? ->
        if(result?.resultCode == Activity.RESULT_OK){
            Log.v("Result","Result OK")
            val uri = result.data?.data
            ivPhoto.setImageURI(uri)
        }
        else{
            Log.v("Result", " Result Failed")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intent_example)

btnChoosePhoto.setOnClickListener{
  resultContract.launch(choosePicure)
}
    }

}