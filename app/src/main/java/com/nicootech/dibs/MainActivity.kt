package com.nicootech.dibs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {
    lateinit var dice1Image:ImageView
    lateinit var dice2Image:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Button
        val rollButton: Button= findViewById(R.id.roll_button)

        rollButton.setOnClickListener {
            rollDice()
        }

        dice1Image = findViewById(R.id.dice1_image)
        dice2Image = findViewById(R.id.dice2_image)
    }

    private fun rollDice() {
        val randomIntLeft = Random().nextInt(6)+1
        val imageResourceLeft = when(randomIntLeft){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        val randomIntRight = Random().nextInt(6)+1
        val imageResourceRight = when(randomIntRight){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        dice1Image.setImageResource(imageResourceLeft)
        dice2Image.setImageResource(imageResourceRight)
    }
}
