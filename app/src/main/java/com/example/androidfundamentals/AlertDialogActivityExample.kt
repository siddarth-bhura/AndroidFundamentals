package com.example.androidfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_alert_dialog_example.*

class AlertDialogActivityExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog_example)

        val addContactDialog = AlertDialog.Builder(this)
            .setTitle("Add contact")
            .setMessage("Do you want to add Mr. Siddarth?")
            .setIcon(R.drawable.ic_contact)
            .setPositiveButton("Yes"){ _, _ ->
                Toast.makeText(this,"You added the contact",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No"){ _, _ ->
                Toast.makeText(this,"You did not added the contact",Toast.LENGTH_SHORT).show()
            }
            .create()

        btnDialog1.setOnClickListener{
            addContactDialog.show()
        }

        val options = arrayOf("first item","second item","third item")
        val singleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these options")
            .setSingleChoiceItems(options,0){ dialogInterface, i ->
                Toast.makeText(this,"You clicked on ${options[i]}",Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept"){ _, _ ->
                Toast.makeText(this,"You accepted single choice item",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline"){ _, _ ->
                Toast.makeText(this,"You decline single choice item",Toast.LENGTH_SHORT).show()
            }
            .create()

        btnDialog2.setOnClickListener{
            singleChoiceDialog.show()
        }
    }
}