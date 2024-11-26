package com.example.lifecycleexample

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var lifecycleStateText: TextView
    private lateinit var onCreateButton: Button
    private lateinit var onStartButton: Button
    private lateinit var onResumeButton: Button
    private lateinit var onPauseButton: Button
    private lateinit var onStopButton: Button
    private lateinit var onDestroyButton: Button
    private lateinit var onRestartButton: Button

    // onCreate is called when the activity is first created.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        lifecycleStateText = findViewById(R.id.lifecycleStateText)
        onCreateButton = findViewById(R.id.onCreateButton)
        onStartButton = findViewById(R.id.onStartButton)
        onResumeButton = findViewById(R.id.onResumeButton)
        onPauseButton = findViewById(R.id.onPauseButton)
        onStopButton = findViewById(R.id.onStopButton)
        onDestroyButton = findViewById(R.id.onDestroyButton)
        onRestartButton = findViewById(R.id.onRestartButton)

        // Default lifecycle state
        lifecycleStateText.text = "Activity Lifecycle State"

        // Set up button listeners to simulate lifecycle methods
        onCreateButton.setOnClickListener {
            lifecycleStateText.text = "onCreate: Activity is created"
        }

        onStartButton.setOnClickListener {
            lifecycleStateText.text = "onStart: Activity is visible"
        }

        onResumeButton.setOnClickListener {
            lifecycleStateText.text = "onResume: Activity is in the foreground"
        }

        onPauseButton.setOnClickListener {
            lifecycleStateText.text = "onPause: Activity is partially hidden"
        }

        onStopButton.setOnClickListener {
            lifecycleStateText.text = "onStop: Activity is no longer visible"
        }

        onDestroyButton.setOnClickListener {
            lifecycleStateText.text = "onDestroy: Activity is being destroyed"
        }

        onRestartButton.setOnClickListener {
            lifecycleStateText.text = "onRestart: Activity is restarting"
        }
    }

    // onStart is called when the activity becomes visible to the user.
    override fun onStart() {
        super.onStart()
        lifecycleStateText.text = "onStart: Activity is visible"
    }

    // onResume is called when the activity starts interacting with the user.
    override fun onResume() {
        super.onResume()
        lifecycleStateText.text = "onResume: Activity is in the foreground"
    }

    // onPause is called when the system is about to start resuming another activity.
    override fun onPause() {
        super.onPause()
        lifecycleStateText.text = "onPause: Activity is partially hidden"
    }

    // onStop is called when the activity is no longer visible.
    override fun onStop() {
        super.onStop()
        lifecycleStateText.text = "onStop: Activity is no longer visible"
    }

    // onDestroy is called before the activity is destroyed.
    override fun onDestroy() {
        super.onDestroy()
        lifecycleStateText.text = "onDestroy: Activity is being destroyed"
    }

    // onRestart is called when the activity is restarted after being stopped.
    override fun onRestart() {
        super.onRestart()
        lifecycleStateText.text = "onRestart: Activity is restarting"
    }
}

