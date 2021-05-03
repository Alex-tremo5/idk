package com.example.idk.form

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton
import com.example.idk.DataActivity
import com.example.idk.R

class FormActivity : AppCompatActivity() {

    var name =""
    var age = 0
    var song =""
    var color =""
    var phone = 0
    var movie =""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        val p1: EditText = findViewById(R.id.etName)
        val p2: EditText = findViewById(R.id.etAge)
        val p3: EditText = findViewById(R.id.etSong)
        val p4: EditText = findViewById(R.id.etColor)
        val pL: CheckBox = findViewById(R.id.cbLice)
        val p6: EditText = findViewById(R.id.etPhone)
        val p7: EditText = findViewById(R.id.etMovie)
        val pS: CheckBox = findViewById(R.id.cbSomeone)
        val verify: AppCompatButton = findViewById(R.id.btVerify)
        verify.setOnClickListener {

            var valid = true
            if (p1.text.toString() != "") {
                name = p1.text.toString()
            } else {
                p1.error = "Fill this blank"
                valid = false
            }


            if (p2.text.toString() != "") {
                age = p2.text.toString().toInt()
            } else {
                p2.error = "Fill this blank"
                valid = false

            }


            if (p3.text.toString() != "") {
                song = p3.text.toString()
            } else {
                p3.error = "Fill this blank"
                valid = false

            }


            if (p4.text.toString() != "") {
                color = p4.text.toString()
            } else {
                p4.error = "Fill this blank"
                valid = false

            }

            val lice: Boolean = pL.isChecked
            if (p6.text.toString() != "") {
                phone = p6.text.toString().toInt()
            } else {
                p6.error = "Fill this blank"
                valid = false

            }


            if (p7.text.toString() != "") {
                movie = p7.text.toString()
            } else {
                p7.error = "Fill this blank"
                valid = false

            }
            val someone: Boolean = pS.isChecked


            val intent = Intent(this, DataActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("age", age)
            intent.putExtra("song", song)
            intent.putExtra("color", color)
            intent.putExtra("lice", lice)
            intent.putExtra("phone", phone)
            intent.putExtra("movie", movie)
            intent.putExtra("someone", someone)

            if (valid) {
                startActivity(intent)
            }
        }


    }
}