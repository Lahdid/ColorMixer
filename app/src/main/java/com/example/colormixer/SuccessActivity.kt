package com.example.colormixer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SuccessActivity : AppCompatActivity() {

    private lateinit var Fullname: TextView
    private lateinit var quit : Button
    private  var name: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.success)
        name = intent.getStringExtra("name").toString()
        Fullname = findViewById(R.id.congratsText)
        Fullname.setText("Congratulations $name")
        quit = findViewById(R.id.quit1)
        quit.setOnClickListener{
            finishAffinity()
        }
    }
}