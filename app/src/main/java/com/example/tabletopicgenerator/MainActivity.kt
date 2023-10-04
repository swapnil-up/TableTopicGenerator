package com.example.tabletopicgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatViewInflater
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var questionTextView:TextView
    private lateinit var generateButton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        questionTextView=findViewById(R.id.questionTextView)
        generateButton=findViewById(R.id.generateButton)

        generateButton.setOnClickListener{
            val random= getRandomQuestion()
            questionTextView.text = random
        }
    }
    fun getRandomQuestion():String{
        val predefinedQuestion=QuestionBank.predefinedQuestion
        val random=Random.nextInt(predefinedQuestion.size)
        return predefinedQuestion[random]
    }
}