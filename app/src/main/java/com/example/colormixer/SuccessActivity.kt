package com.example.colormixer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SuccessActivity : AppCompatActivity() {

    private lateinit var Fullname: TextView
    private  var name: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.success)
        name = intent.getStringExtra("name").toString()
        Fullname = findViewById(R.id.congratsText)
        Fullname.setText("Congratulations $name")
    }
}