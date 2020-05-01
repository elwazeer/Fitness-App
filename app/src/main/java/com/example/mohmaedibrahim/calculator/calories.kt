package com.example.mohmaedibrahim.calculator

import android.os.Bundle
import android.app.Activity
import android.content.Intent
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_calories.*


class calories : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calories)

        val home_s = findViewById(R.id.home) as Button

        home_s.setOnClickListener {
            val intent = Intent(this, select::class.java)
            startActivity(intent)
        }

        val values = arrayListOf("Chicken 100g", "Meat 100g", "Milk 100ml", "Cooked Eggs 100g", "Fried Eggs 100g")

        val mListView = findViewById<ListView>(R.id.listView)

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values)

        mListView.adapter =adapter

        mListView.setOnItemClickListener{parent, view, position, id ->

            //Toast.makeText(this@MainActivity, "You have Clicked " + parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show()

            if (position==0){
                Toast.makeText(this@calories, "165 calories\n",   Toast.LENGTH_LONG).show()
            }
            if (position==1){
                Toast.makeText(this@calories, "143 calories\n",   Toast.LENGTH_LONG).show()
            }
            if (position==2){
                Toast.makeText(this@calories, "42 calories\n", Toast.LENGTH_LONG).show()
            }
            if (position==3){
                Toast.makeText(this@calories, "155 calories\n",  Toast.LENGTH_LONG).show()
            }
            if (position==4){
                Toast.makeText(this@calories, "196 calories\n",  Toast.LENGTH_LONG).show()
            }
    }
    }
    override fun onBackPressed() {
        val intent = Intent(this, select::class.java)
        startActivity(intent)
    }

}
