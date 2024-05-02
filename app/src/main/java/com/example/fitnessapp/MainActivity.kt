package com.example.fitnessapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    val myButton: Button = findViewById(R.id.startPrac1)
    val myButton1: Button = findViewById(R.id.startPrac2)
    val myToolbar:Toolbar = findViewById(R.id.toolBar)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        var toolBar = null
        setSupportActionBar(toolBar)


        startActivity(Intent(this,SecondActivity2::class.java))
        startActivity(intent)

        startActivity(Intent(this,foodActivity::class.java))
        startActivity(intent)

        myButton.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
            startActivity(intent)
        }
        myButton1.setOnClickListener {
            startActivity(Intent(this,SecondActivity2::class.java))
            startActivity(intent)
        }
        }
    }


