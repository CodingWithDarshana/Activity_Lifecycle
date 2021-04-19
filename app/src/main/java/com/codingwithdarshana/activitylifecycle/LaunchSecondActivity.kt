package com.codingwithdarshana.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LaunchSecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_second)
    }
}