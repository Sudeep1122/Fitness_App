package com.example.fitnessapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.animation.AnimationUtils


class SplashScreenok : AppCompatActivity() {



        lateinit var imageView: ImageView
        lateinit var textView: TextView
        private lateinit var handler:Handler


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    startActivity(Intent(this,MainActivity::class.java))
        finish()

    imageView=findViewById(R.id.appsplash)




        textView=findViewById(R.id.aapname)



        Handler().postDelayed({


        }, 3500)






    }

}
