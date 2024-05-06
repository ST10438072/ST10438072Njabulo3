package com.example.myapplication.st10438072.st10438072

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class GameActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val petImageView = findViewById<ImageView>(R.id.petImageView)
        val feedButton = findViewById<Button>(R.id.feedButton)
        val cleanButton = findViewById<Button>(R.id.cleanButton)
        val playButton = findViewById<Button>(R.id.playButton)

        val feedTextView = findViewById<TextView>(R.id.feedTextView)
        val cleanTextView = findViewById<TextView>(R.id.cleanTextView)
        val playTextView = findViewById<TextView>(R.id.playTextView)

        //Retrieve the message passed from the first screen
        val feedMessage =intent.getStringExtra("Feed_Message")
        //Set the text of the feed TextView to the feed message
        feedTextView.text = feedMessage

        //Logic for the Feed button
        feedButton.setOnClickListener {
        // Change the pet's image to match feeding action icon
            petImageView.setImageResource(R.drawable.download)

            //Update the pet's status values
            //Update the feed TextView
            feedTextView.text = getString(R.string.feed)

            //Update the play TextView
            playTextView.text = getString(R.string.play)

        }


        //Logic for the Clean button
        cleanButton.setOnClickListener {
            //Change the pet's image to match cleaning action icon
            petImageView.setImageResource(R.drawable.download__2_)

            //Update the pet's status values
            //Update the clean textview
            cleanTextView.text = getString(R.string.clean)

        }


        //Logic for the Play button
        playButton.setOnClickListener {
          //Change the pet's image to match playing action icon
            petImageView.setImageResource(R.drawable.download__1_)

            //Update the pet's status values
            //Update the play TextView
            playTextView.text = getString(R.string.play)
            //Update the clean textview
            cleanTextView.text = getString(R.string.clean)

        }
    }
}