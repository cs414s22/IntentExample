package com.example.intentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    // A tag used for log messages -- you can use different name if you like
    private val TAG = "SecondActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Access any extras passed in intent using methods like getIntExtra(), getStringExtra
        // Remember: intent is like a global variable that can be accessed in an Activity
        val firstName = intent.getStringExtra("firstName")
        val lastName = intent.getStringExtra("lastName")
        val age = intent.getIntExtra("age", 0)

        // For testing purpose, print the values in the logcat
        Log.d(TAG, "firstName: $firstName ")
        Log.d(TAG, "lastName: $lastName")
        Log.d(TAG, "age: $age")

        // Do something with the data
        first_name_text.text = firstName
        last_name_text.text = lastName
        age_text.text = age.toString()
    }
}