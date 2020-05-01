package com.example.mohmaedibrahim.calculator

import android.os.Bundle
import android.os.Handler
import android.app.Activity
import android.content.Intent
import android.view.Window
import android.view.WindowManager

class home : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_home)

        Handler().postDelayed({
            startActivity(Intent(this@home, select::class.java))
            finish()
        }, 5500)
    }

}
