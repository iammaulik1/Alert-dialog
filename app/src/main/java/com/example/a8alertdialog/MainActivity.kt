package com.example.a8alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button=findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val builder=AlertDialog.Builder(this)
            //set title for alert dialog
            builder.setTitle(R.string.dialogTitle)
            //set message for alert dialog
            builder.setMessage(R.string.dialogMessage)
            builder.setIcon(android.R.drawable.ic_dialog_alert)

            //performing positive action
            builder.setPositiveButton("good"){dialogInterface,which ->
                Toast.makeText(applicationContext,"Your day was Good",Toast.LENGTH_LONG).show()
            }
            //performing cancel action
            builder.setNeutralButton("Prefer not to say"){dialogInterface , which ->
                Toast.makeText(applicationContext,"you dont want to say! \n Fuck Off",Toast.LENGTH_LONG).show()
            }
            //performing negative action
            builder.setNegativeButton("Bad"){dialogInterface , which ->
                Toast.makeText(applicationContext,"Your day was bad",Toast.LENGTH_LONG).show()

            }
            // Create the AlertDialog
            val alertDialog:AlertDialog=builder.create()
            // Set other dialog properties
            alertDialog.setCancelable(false)
            alertDialog.show()

        }
    }
}