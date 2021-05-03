package com.example.idk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class DataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        val p1: TextView = findViewById(R.id.tvName)
        val p2: TextView = findViewById(R.id.tvAge)
        val p3: TextView = findViewById(R.id.tvSong)
        val p4: TextView = findViewById(R.id.tvColor)
        val p5: TextView = findViewById(R.id.cbLice)
        val p6: TextView = findViewById(R.id.tvPhone)
        val p7: TextView = findViewById(R.id.tvMovie)
        val p8: TextView = findViewById(R.id.cbSomeone)


        val name: String = intent.getStringExtra("name").toString()
        p1.text = name

        val age: Int = intent.getIntExtra("age", 0)
        p2.text = age.toString()

        val song: String = intent.getStringExtra("song").toString()
        p3.text = song

        val color: String = intent.getStringExtra("color").toString()
        p4.text = color

        val lice: Boolean = intent.getBooleanExtra("lice", false)
        p5.text = lice.toString()

        val phone: Int = intent.getIntExtra("phone", 0)
        p6.text = phone.toString()

        val movie: String = intent.getStringExtra("movie").toString()
        p7.text = movie

        val someone: Boolean = intent.getBooleanExtra("someone", false)
        p8.text = someone.toString()
    }
}