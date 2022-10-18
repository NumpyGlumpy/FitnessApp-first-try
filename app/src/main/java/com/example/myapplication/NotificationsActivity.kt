package com.example.myapplication

import android.os.Bundle
import android.util.Log

class NotificationsActivity : BaseActivity(1) {
    private val tag = "NotificationsActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications)
        setupBottomNavigation()
        Log.d(tag, "OnCreate")
    }
}