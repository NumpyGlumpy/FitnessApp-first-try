package com.example.myapplication

import android.content.Intent
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

@Suppress("DEPRECATION")
abstract class BaseActivity(private val navNumber: Int) : AppCompatActivity() {
    private val tag = "BaseActivity"
    fun setupBottomNavigation() {
        val bnv = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        for (i in 0 until bnv.menu.size()) {
            bnv.itemIconTintList
        }
        bnv.setOnNavigationItemSelectedListener {
            val nextActivity =
                when (it.itemId) {
                    R.id.home_icon -> HomeActivity::class.java
                    R.id.bell_icon -> NotificationsActivity::class.java
                    R.id.man_icon -> AccountActivity::class.java
                    R.id.chat_icon -> ChatActivity::class.java
                    else -> {
                        Log.e(tag, "ERROR $it")
                        null
                    }
                }
            if (nextActivity != null) {
                val intent = Intent(this, nextActivity::class.java)
                startActivity(intent)
                intent.flags = Intent.FLAG_ACTIVITY_NO_ANIMATION
                overridePendingTransition(0, 0)
                true
            } else {
                false
            }
        }
        bnv.menu.getItem(navNumber).isChecked = true
    }
}