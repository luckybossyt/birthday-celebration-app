package com.lakshya.birthdayapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var btt1: Button=findViewById(R.id.btn1)
        var btt2: Button=findViewById(R.id.bttn2)
        btt1.setOnClickListener(){
            val intent1 = Intent(this,MainActivity3::class.java)
            startActivity(intent1)
        }
        btt2.setOnClickListener()
        {
            val intent2= Intent(this,MainActivity4::class.java)
            startActivity(intent2)
        }
    }
}