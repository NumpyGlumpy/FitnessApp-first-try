package com.example.myapplication

import android.os.Bundle
import android.util.Log

class AccountActivity : BaseActivity(2) {
    private val tag = "AccountActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)
        setupBottomNavigation()
        Log.d(tag, "OnCreate")
    }
}