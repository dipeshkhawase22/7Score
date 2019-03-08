package com.example.a7score.Controller

import android.content.Intent
import android.os.Bundle
import com.example.a7score.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startbutton.setOnClickListener {
            val leagueIntent = Intent(this, SecondActivity::class.java)
            startActivity(leagueIntent)
        }

    }
}
