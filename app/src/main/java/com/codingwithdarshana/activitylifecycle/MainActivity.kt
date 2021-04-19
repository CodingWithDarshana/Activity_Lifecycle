package com.codingwithdarshana.activitylifecycle

import android.app.Activity
import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : Activity() {
    var tag: String = "Lifecycle Event"
    lateinit var btnLaunchActivity: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        Log.i(tag, "onCreate() event")
        btnLaunchActivity = findViewById(R.id.btnLaunchActivity)
        btnLaunchActivity.setOnClickListener {
            startActivity(Intent(this@MainActivity, LaunchSecondActivity::class.java))
        }


    }

    override fun onStart() {
        super.onStart()
        Log.i(tag, "onStart() event")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i(tag, "onRestart() event")

    }

    override fun onResume() {
        super.onResume()
        Log.i(tag, "onResume() event")

    }

    override fun onPause() {
        super.onPause()
        Log.i(tag, "onPause() event")

    }

    override fun onStop() {
        super.onStop()
        Log.i(tag, "onStop() event")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(tag, "onDestroy() event")

    }
}