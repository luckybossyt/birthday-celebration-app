package com.lakshya.birthdayapp

import android.content.Intent
import android.media.Image
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import com.lakshya.birthdayapp.R.id.imageh

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var butt  : Button = findViewById(R.id.bttn)
        var animation=AnimationUtils.loadAnimation(this@MainActivity,R.anim.animation)
        var bollon : ImageView = findViewById(R.id.imageb)
        var singly= MediaPlayer.create(this@MainActivity,R.raw.birthday_song)
        var hbd : ImageView=findViewById(R.id.imageh)
        var newanimation=AnimationUtils.loadAnimation(this@MainActivity,R.anim.animation1)
        hbd.animation=newanimation
        bollon.animation=animation
        animation.setAnimationListener(object: Animation.AnimationListener
        {
            override fun onAnimationStart(p0: Animation?) {
                singly.start()


            }

            override fun onAnimationEnd(p0: Animation?) {
                singly.stop()

            }

            override fun onAnimationRepeat(p0: Animation?) {

            }

        })


        butt.setOnClickListener (){
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)

        }


    }
}