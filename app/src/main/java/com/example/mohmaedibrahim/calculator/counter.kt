package com.example.mohmaedibrahim.calculator

import android.os.Bundle
import android.app.Activity

import kotlinx.android.synthetic.main.activity_counter.*
import android.content.Context
import android.content.Intent
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.widget.Button
import android.widget.Toast

class counter : Activity(), SensorEventListener {

    var running = false
    var sensorManager:SensorManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager

        val home_s = findViewById(R.id.home) as Button

        home_s.setOnClickListener {
            val intent = Intent(this, select::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {

        super.onResume()
        running = true
        var stepsSensor = sensorManager?.getDefaultSensor(Sensor.TYPE_STEP_COUNTER)

        if (stepsSensor == null) {
            Toast.makeText(this, "No Step Counter Sensor!", Toast.LENGTH_SHORT).show()
        } else {
            sensorManager?.registerListener(this, stepsSensor, SensorManager.SENSOR_DELAY_UI)
        }
    }

    override fun onPause() {
        super.onPause()
        running = false
        sensorManager?.unregisterListener(this)
    }

    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {
    }

    override fun onSensorChanged(event: SensorEvent) {
        if (running) {
            stepsValue.setText("" + event.values[0])
        }
    }
    override fun onBackPressed() {
        val intent = Intent(this, select::class.java)
        startActivity(intent)
    }
}