package com.example.shareelementtransitionanimation_codinginflow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Fade
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Activity 1")

       /* val fade=Fade()
        val decor=window.decorView*/

        button.setOnClickListener {
            val intent=Intent( this,Activity2::class.java)
            val option=ActivityOptionsCompat
                .makeSceneTransitionAnimation(this,image_activity_1,
                    ViewCompat.getTransitionName(image_activity_1)!!
                )
            startActivity(intent,option.toBundle())
        }
    }
}
