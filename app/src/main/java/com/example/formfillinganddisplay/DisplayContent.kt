package com.example.formfillinganddisplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class DisplayContent : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_display)

        val details = findViewById<TextView> (R.id.content);
        
        val fill="\n You are ${fname} ${lname}. \n \n You are ${age} years old. \n \n Your gender is ${if(isMale) "Male" else "Female"}.\n \n Joining details will be sent to: \n ${mail} \n \n You belong to ${dept} department. \n \n Additional Information:\n ${rem}\n"

        details.text=fill

        Toast.makeText(this,"Have a nice Day!",Toast.LENGTH_SHORT).show()

    }

    companion object {

        var fname:Any?=null
        var lname:Any?=null
        var age:Any?=null
        var mail:Any?=null
        var dept:Any?=null
        var isMale:Boolean=false
        var rem:Any?=null

    }

}