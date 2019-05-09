package com.example.kotlinfirstcode

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var age : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            age = edittext.text.toString().toInt()
            if(age >= 18) startGrantedAccessActivity() else startDeniedAccessActivity()
        }

    }

    private fun startDeniedAccessActivity() {
        var intent = Intent(this, GrantedAccessActivity::class.java)
        intent.putExtra(Constants.AGE, age)
        startActivity(intent)
    }

    private fun startGrantedAccessActivity(){
        var intent = Intent(this, DeniedAccessActivity::class.java)
        startActivity(intent)
    }
}
