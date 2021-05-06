package com.example.idk.start

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.idk.R
import com.example.idk.ServiceActivity
import com.example.idk.form.FormActivity
import com.example.idk.machine.GameActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bformulario: AppCompatButton = findViewById(R.id.bFormulario)
        val btSlot: AppCompatButton = findViewById(R.id.btSlot)
        val btCall: AppCompatButton = findViewById(R.id.btCall)


        bformulario.setOnClickListener {
            val inte: Intent = Intent(this, FormActivity::class.java)
            startActivity(inte)
        }

        btSlot.setOnClickListener {
            val inte: Intent = Intent(this, GameActivity::class.java)
            startActivity(inte)
        }

        btCall.setOnClickListener {
            val inte: Intent = Intent (this, ServiceActivity::class .java)
        }
    }
}