package com.example.counter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Declare a variable for the counter
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get references to the TextView and Buttons
        val counterTextView: TextView = findViewById(R.id.counterTextView)
        val incrementButton: Button = findViewById(R.id.incrementButton)
        val decrementButton: Button = findViewById(R.id.decrementButton)

        // Set an OnClickListener for the increment button
        incrementButton.setOnClickListener {
            // Increment the counter
            counter++

            // Update the TextView to display the new counter value
            counterTextView.text = counter.toString()
        }

        // Set an OnClickListener for the decrement button
        decrementButton.setOnClickListener {
            // Decrement the counter
            counter--

            // Update the TextView to display the new counter value
            counterTextView.text = counter.toString()
        }
    }
}
