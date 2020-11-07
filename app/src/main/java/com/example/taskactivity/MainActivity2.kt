package com.example.taskactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var intent: Intent
        var Cam = findViewById<Button>(R.id.btn1)
        var Gs = findViewById<Button>(R.id.btn2)
        var Timer = findViewById<Button>(R.id.btn3)
        var btn4 = findViewById<Button>(R.id.btn4)
        var btn5 = findViewById<Button>(R.id.btn5)
        val errorDialog = AlertDialog.Builder(this)
            .setTitle("Error")
            .setMessage("The intent failed due to not existing")
            .setNeutralButton("OK") { _, _ ->
                Toast.makeText(this, "Error", Toast.LENGTH_LONG).show()
            }
            .create()

        Cam.setOnClickListener {
            intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        btn4.setOnClickListener {
            errorDialog.show()
        }

        btn5.setOnClickListener {
            errorDialog.show()
        }


    }

}