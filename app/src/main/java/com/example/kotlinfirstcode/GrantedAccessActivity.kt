package com.example.kotlinfirstcode

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_granted_access.*

class GrantedAccessActivity : AppCompatActivity() {

    var age : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_granted_access)

        age = intent.getIntExtra(Constants.AGE, 0)

        textview.setText("Your age is : $age")
    }
}
