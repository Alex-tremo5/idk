package com.example.idk.start

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import com.example.idk.R

class SplashActivity : AppCompatActivity() {

    lateinit var satori: ImageView
    lateinit var tittle: TextView
    lateinit var sub: TextView
    lateinit var topAnim: Animation
    lateinit var botAnim: Animation


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash)

        satori = findViewById(R.id.ivSplash)
        tittle = findViewById(R.id.tvDont)
        sub = findViewById(R.id.tvSub)

        topAnim = AnimationUtils.loadAnimation(this,
            R.anim.top_animation
        )
        botAnim = AnimationUtils.loadAnimation(this,
            R.anim.bottom_animation
        )

        loadAnimation()
        loadMainScreen()

    }

    private fun loadAnimation() {
        satori.animation = topAnim
        tittle.animation = botAnim
        sub.animation = botAnim
    }

    private fun loadMainScreen() {
        Handler().postDelayed(Runnable {
            startActivity(Intent(this, MainActivity::class.java))
        }, 1900)

    }
}