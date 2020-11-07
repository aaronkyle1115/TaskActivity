package com.example.taskactivity

import android.app.DatePickerDialog
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var intent: Intent
        var Cam = findViewById<Button>(R.id.btn1)
        var Cal = findViewById<Button>(R.id.btn2)
        var Web = findViewById<Button>(R.id.btn3)
        var btn4 = findViewById<Button>(R.id.btn4)
        var btn5 = findViewById<Button>(R.id.btn5)


        Cam.setOnClickListener {
           cam()
        }
        Cal.setOnClickListener {
            Calen()
        }
        Web.setOnClickListener{
            web()
        }

        btn4.setOnClickListener {
            errorbox()
        }

        btn5.setOnClickListener {
            errorbox()
        }


    }
    fun cam(){
        intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }

    fun web() {
        val net: Intent = Uri.parse("http://wwww.newgrounds.com").let { webpage ->
            Intent(Intent.ACTION_VIEW, webpage)
        }
        startActivity(net)
    }
    fun errorbox(){
        val errorDialog = AlertDialog.Builder(this)
            .setTitle("Error")
            .setMessage("The intent failed due to not existing")
            .setNeutralButton("OK") { _, _ ->
                Toast.makeText(this@MainActivity2, "Error", Toast.LENGTH_LONG).show()
            }
            .create()
        errorDialog.show()
    }

    fun Calen(){
        val year = Calendar.YEAR
        val month = Calendar.MONTH
        val day = Calendar.DAY_OF_MONTH

        val datePickerDialog = DatePickerDialog(this@MainActivity2, DatePickerDialog.OnDateSetListener
        { view, year, monthOfYear, dayOfMonth ->

        }, year, month, day)
        datePickerDialog.show()
    }


}