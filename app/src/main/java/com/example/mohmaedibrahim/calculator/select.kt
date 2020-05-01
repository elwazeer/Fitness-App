package com.example.mohmaedibrahim.calculator

import android.os.Bundle
import android.app.Activity
import android.content.Intent
import android.widget.Button

import kotlinx.android.synthetic.main.activity_select.*

class select : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select)

        val step_c = findViewById(R.id.count) as Button
        val bmr_c = findViewById(R.id.bmr) as Button
        val cal_i = findViewById(R.id.cal) as Button

        step_c.setOnClickListener {
            val intent = Intent(this, counter::class.java)
            startActivity(intent)
        }

        bmr_c.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        cal_i.setOnClickListener {
            val intent = Intent(this, calories::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        val intent = Intent(this, select::class.java)
        startActivity(intent)
    }

}
