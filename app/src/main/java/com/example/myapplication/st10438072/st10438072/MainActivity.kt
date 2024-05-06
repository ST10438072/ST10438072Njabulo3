package com.example.myapplication.st10438072.st10438072

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.google.androidgamesdk.GameActivity

class MainActivity : ComponentActivity() {

    @SuppressLint("MissingInflateId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button to navigate to the secondscreen
        val startButton: Button = findViewById(R.id.button)
        startButton.setOnClickListener {

        }
             val intent = Intent(this, GameActivity::class.java)//activity_main2.xml.:activity_main2.xml

             //pass the message "hungry"as an extra with intent
             intent.putExtra("FEED_MESSAGE,hungry")//This will be shown in the feedTextView

             startActivity(Intent().setAction("your.custom.action"))
    }
}