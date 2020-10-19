package com.bcsvirtual.rolls

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import com.squareup.picasso.Picasso

class Splash_Screen : AppCompatActivity() {
    val SPLASH_TIME_OUT:Long = 2500
    lateinit var splashImage:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

//        splashImage = findViewById(R.id.splashImage)
//        Picasso.get().load("https://katirollandroidapplication.s3.ap-south-1.amazonaws.com/images/kati+rolls.jpg").into(splashImage)

        Handler().postDelayed({
            startActivity(Intent(this,HomePage::class.java))
            finish()
        },SPLASH_TIME_OUT)

    }
}