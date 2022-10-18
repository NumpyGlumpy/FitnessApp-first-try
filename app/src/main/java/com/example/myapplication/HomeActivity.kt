package com.example.myapplication

import android.os.Bundle
import android.util.Log

@Suppress("DEPRECATION")
class HomeActivity : BaseActivity(0) {
    private val tag = "HomeActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setupBottomNavigation()
        Log.d(tag, "onCreate")
    }
}