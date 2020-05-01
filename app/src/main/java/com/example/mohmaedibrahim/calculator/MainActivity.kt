package com.example.mohmaedibrahim.calculator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val home_s = findViewById(R.id.home) as Button

        val output = findViewById(R.id.output) as TextView
        val result_m = findViewById(R.id.male) as Button
        val result_f = findViewById(R.id.female) as Button

        home_s.setOnClickListener {
            val intent = Intent(this, select::class.java)
            startActivity(intent)
        }
            result_m.setOnClickListener {
                if (getNum1() > 0 && getNum2() > 0 && getNum3() > 0 ){
                    output.text = (66.47 + (6.24 * getNum1()) + (12.7 * getNum3()) - (6.755 * getNum2())).toString()
                }
                else
                {
                    Toast.makeText(applicationContext, "Error! One or more fields are empty!", Toast.LENGTH_LONG).show()
                }
            }
            //result_m.setOnClickListener(View.OnClickListener { view -> output.text = (66.47 + (6.24 * getNum1()) + (12.7 * getNum3()) - (6.755 * getNum2())).toString() })

        result_f.setOnClickListener {
                if (getNum1() > 0 && getNum2() > 0 && getNum3() > 0 ){
                    output.text = (655.1 + (4.35 * getNum1()) + (4.7 * getNum3()) - (4.7 * getNum2())).toString()
                }
                else
                {
                    Toast.makeText(applicationContext, "Error! One or more fields are empty!", Toast.LENGTH_LONG).show()
                }
            }
            //result_f.setOnClickListener(View.OnClickListener { view -> output.text = (655.1 + (4.35 * getNum1()) + (4.7 * getNum3()) - (4.7 * getNum2())).toString() })
        }

    fun getNum1(): Int{
        val input_num1 = findViewById(R.id.weight) as EditText
        val msg: String = input_num1.text.toString()

        if(msg.trim().length>0) return Integer.parseInt(input_num1.text.toString())
        else return -1
    }

    fun getNum2(): Int{
        val input_num2 = findViewById(R.id.Age) as EditText
        val msg: String = input_num2.text.toString()

        if(msg.trim().length>0) return Integer.parseInt(input_num2.text.toString())
        else return -1
    }

    fun getNum3(): Int{
        val input_num3 = findViewById(R.id.Height) as EditText
        val msg: String = input_num3.text.toString()

        if(msg.trim().length>0) return Integer.parseInt(input_num3.text.toString())
        else return -1
    }

    override fun onBackPressed() {
        val intent = Intent(this, select::class.java)
        startActivity(intent)
    }
}
