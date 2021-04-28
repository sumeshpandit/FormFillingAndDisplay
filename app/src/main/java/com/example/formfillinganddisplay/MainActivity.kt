package com.example.formfillinganddisplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, DisplayContent::class.java)

        val sub=findViewById<Button>(R.id.submit)

        sub.setOnClickListener {
            val data1 = findViewById<TextView>(R.id.textInputEditText)

            val data2 = findViewById<TextView> (R.id.textInputEditText2)

            val data3 = findViewById<TextView> (R.id.textInputEditText3)

            val data4 = findViewById<TextView> (R.id.textInputEditText4)

            val data5= findViewById<TextView> (R.id.textInputEditText5)

            val data6 = findViewById<RadioButton> (R.id.male)

            val data7=findViewById<TextView>(R.id.textInputEditText6)

            DisplayContent.fname = data1.text
            DisplayContent.lname=data2.text
            DisplayContent.age=data3.text
            DisplayContent.mail=data4.text
            DisplayContent.dept=data5.text
            DisplayContent.isMale= data6.isChecked
            DisplayContent.rem=data7.text

            startActivity(intent)
        }
    }
}