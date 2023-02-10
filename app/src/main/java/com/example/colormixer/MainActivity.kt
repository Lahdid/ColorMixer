package com.example.colormixer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {



     lateinit var Fullname: EditText
    private lateinit var Blue: CheckBox
    private lateinit var Red: CheckBox
    private lateinit var Yellow: CheckBox
    private lateinit var Mix: Button
    var result:String = ""
    var choice:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Fullname = findViewById(R.id.fullname)

        Blue = findViewById(R.id.blueBox)
        Red = findViewById(R.id.redBox)
        Yellow = findViewById(R.id.yellowBox)
        Mix = findViewById(R.id.mix)
        Mix.setOnClickListener{

            if (Blue.isChecked && Red.isChecked || Blue.isChecked && Yellow.isChecked || Yellow.isChecked && Red.isChecked) {

                if (Blue.isChecked && Red.isChecked) {
                    choice = "Blue and Red"
                    result = "purple"
                }
                if (Yellow.isChecked && Red.isChecked) {
                    choice = "Yellow and Red"
                    result = "orange"
                }
                if (Blue.isChecked && Yellow.isChecked) {
                    choice = "Blue and Yellow"
                    result = "green"
                }
                val intent = Intent( this, AnswerCheckActivity::class.java)
                intent.putExtra("username",Fullname.text.toString())

                intent.putExtra("result",result)
                intent.putExtra("choice",choice)
                startActivity(intent)
            }
            else {
                Toast.makeText(this, "Please check two colors", Toast.LENGTH_SHORT).show()
            }
        }



    }
}