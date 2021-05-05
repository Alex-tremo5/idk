package com.example.idk.machine

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import com.example.idk.R
import java.util.ArrayList

class GameActivity : AppCompatActivity() {
    var counter = 0
    lateinit var number: TextView
    lateinit var spin: AppCompatButton
    lateinit var number1: ImageView
    lateinit var number2: ImageView
    lateinit var number3: ImageView
    lateinit var prize: AppCompatButton
    lateinit var won: TextView
    lateinit var lose: TextView
    lateinit var points: AppCompatButton
    val image: ArrayList<Int> = arrayListOf(
        R.drawable.bar,
        R.drawable.campana,
        R.drawable.cereza,
        R.drawable.hoja,
        R.drawable.sandia,
        R.drawable.siete,
        R.drawable.naranja,
        R.drawable.cereza,
        R.drawable.campana
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        number = findViewById(R.id.tvNumber)
        spin = findViewById(R.id.btSpin)
        number1 = findViewById(R.id.number1)
        number2 = findViewById(R.id.number2)
        number3 = findViewById(R.id.number3)
        prize = findViewById(R.id.btPr)
        won = findViewById(R.id.tvWon)
        lose = findViewById(R.id.tvLose)
        points = findViewById(R.id.btCounter)

        spin.setOnClickListener {
            roulette()
        }

        points.setOnClickListener {
            increase()
            sound()
            spin.isEnabled = true
        }

        prize.setOnClickListener {
            val inte: Intent = Intent(this, PrizesActivity::class.java)
            startActivity(inte)
        }


    }

    fun increase() {
        println("counter $counter")
        counter += 40
        number.text = counter.toString()

    }

    fun sound() {
        val mp: MediaPlayer = MediaPlayer.create(applicationContext,
            R.raw.insert_coin_effect
        )
        mp.start()
    }

    fun roulette() {


        val aleatorio1 = image.random()
        val aleatorio2 = image.random()
        val aleatorio3 = image.random()


        number1.setImageDrawable(
            ContextCompat.getDrawable(
                this, aleatorio1
            )
        )

        number2.setImageDrawable(
            ContextCompat.getDrawable(
                this, aleatorio2
            )
        )

        number3.setImageDrawable(
            ContextCompat.getDrawable(
                this, aleatorio3
            )
        )

        if (aleatorio1 == aleatorio2 && aleatorio1 == aleatorio3) {
            won.visibility = View.VISIBLE
            lose.visibility = View.GONE
        } else {
            won.visibility = View.GONE
            lose.visibility = View.VISIBLE

        }

    }


}