package com.shidqi.childapplicationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun logOnChildActivity(){
        Log.d("logOnChildActivity", "logOnChildActivity")
    }
}