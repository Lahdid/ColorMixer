package com.example.colormixer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class WrongActivity : AppCompatActivity() {
    private lateinit var Fullname: TextView
    private lateinit var quit : Button
    private  var name: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wrong)
        name = intent.getStringExtra("name").toString()
        Fullname = findViewById(R.id.sorryText)
        Fullname.setText("Congratulations $name")
        quit = findViewById(R.id.quit2)
        quit.setOnClickListener{
            finishAffinity()
        }
    }
}