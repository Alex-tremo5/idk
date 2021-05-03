package com.example.idk.machine

import PrizeAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.idk.R

class PrizesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prizes)


        val prize1 = Prize(R.drawable.campana, 10)
        val prize2 = Prize(R.drawable.cereza, 30)
        val prize3 = Prize(R.drawable.siete, 1000)
        val prize4 = Prize(R.drawable.sandia, 200)
        val prize5 = Prize(R.drawable.bar, 800)
        val prize6 = Prize(R.drawable.naranja, 500)
        val prize7 = Prize(R.drawable.hoja, 70)
        val prizesList = listOf(prize2,prize4,prize6,prize5,prize1,prize7,prize3)


        val recyclerView = findViewById<RecyclerView>(R.id.rvPrizes)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = PrizeAdapter(this, prizesList)
        recyclerView.adapter = adapter
    }
}