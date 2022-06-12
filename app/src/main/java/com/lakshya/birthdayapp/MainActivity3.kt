package com.lakshya.birthdayapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.VISIBLE
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var candleanimation=AnimationUtils.loadAnimation(this@MainActivity3,R.anim.animation3)
        var candlep:ImageView=findViewById(R.id.candlep)
        var flmepp :ImageView=findViewById(R.id.flamepng)
        var cakecut :ImageView=findViewById(R.id.cakepng)
        var songg= MediaPlayer.create(this@MainActivity3,R.raw.terahappybirthday)
        var btt: Button =findViewById(R.id.bpp)
        var wishp :ImageView=findViewById(R.id.wishpng)
        var wishanima=AnimationUtils.loadAnimation(this@MainActivity3,R.anim.animation5)

        btt.setOnClickListener()
        {
           flmepp.visibility=VISIBLE
            var candleanimation=AnimationUtils.loadAnimation(this@MainActivity3,R.anim.animation3)
            var flmppt=AnimationUtils.loadAnimation(this@MainActivity3,R.anim.aniamtion4)

            candlep.animation=candleanimation
            flmepp.animation=flmppt
            wishp.animation=wishanima
            wishanima.setAnimationListener(object: Animation.AnimationListener
            {
                override fun onAnimationStart(p0: Animation?) {
                    songg.start()


                }

                override fun onAnimationEnd(p0: Animation?) {
                    songg.stop()

                }

                override fun onAnimationRepeat(p0: Animation?) {

                }

            })
        }


    }
}