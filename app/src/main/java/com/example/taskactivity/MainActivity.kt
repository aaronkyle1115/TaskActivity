package com.example.taskactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var username = findViewById<EditText>(R.id.Username)
        var password = findViewById<EditText>(R.id.Password)
        var login = findViewById<Button>(R.id.Login)

        login.setOnClickListener {
            val user_name = username.text;
            val pass_word = password.text;
            Toast.makeText(this@MainActivity, user_name, Toast.LENGTH_LONG).show()

            if (user_name.equals("User") and pass_word.equals("password"))
                openTaskMenu();

        }

    }

    public fun openTaskMenu(){
        val intent =  Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}