package com.lakshya.birthdayapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        var bttnl: Button =findViewById(R.id.bttnppp)
        var text: EditText =findViewById(R.id.editpp)

        bttnl.setOnClickListener()
        {
            var pno=text.text.toString()
            var intentp = Intent(Intent.ACTION_CALL)
            intentp.setData(Uri.parse("tel:$pno"))
            startActivity(intentp)


        }

    }
}