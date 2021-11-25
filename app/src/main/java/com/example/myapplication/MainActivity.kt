package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //onCreate is the starting point
        setContentView(R.layout.activity_main)
        fun sum(num1: Int, num2:Int){

            Log.d("MainActivity", "$num1 - $num2 = ${num1-num2}")
        }

        val number1 = 25
        val number2 = 13

        var message = ""
        if (number1 > number2) {
            message = "the result will be positive"
            Log.d("MainActivity", message)


        }
        else{
            message = "The result will be negative"
            Log.d("MainActivity", message)

        }
        sum(number1,number2)

    }
}