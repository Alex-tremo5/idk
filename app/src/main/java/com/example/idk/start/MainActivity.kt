package com.example.idk.start

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.example.idk.R
import com.example.idk.form.FormActivity
import com.example.idk.machine.GameActivity
import com.example.idk.service.ServiceActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bformulario: AppCompatButton = findViewById(R.id.bFormulario)
        val btSlot: AppCompatButton = findViewById(R.id.btSlot)
        val btCall: AppCompatButton = findViewById(R.id.btCall)


        bformulario.setOnClickListener {
            val inte = Intent(this, FormActivity::class.java)
            startActivity(inte)
        }

        btSlot.setOnClickListener {
            val inte = Intent(this, GameActivity::class.java)
            startActivity(inte)
        }

        btCall.setOnClickListener {
            val inte = Intent(this, ServiceActivity::class.java)
            startActivity(inte)
        }
    }
}