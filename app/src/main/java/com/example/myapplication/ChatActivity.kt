package com.example.myapplication

import android.os.Bundle
import android.util.Log

class ChatActivity : BaseActivity(3) {
    private val tag = "ChatActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
        setupBottomNavigation()
        Log.d(tag, "OnCreate")
    }
}