package com.example.a7score.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.a7score.Utilities.EXTRA_LEAGUE
import com.example.a7score.R
import com.example.a7score.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : BaseActivity() {

    var league = ""
    var skillSelected = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBeginnerClicked (view : View) {
        expertbtn.isChecked = false
        skillSelected = "Beginner"
    }

    fun onExpertClicked (view: View) {
        beginnerbtn.isChecked = false
        skillSelected = "Expert"
    }

    fun onFinishClicked (view: View) {

        if (skillSelected != "") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_LEAGUE, league)
            finishIntent.putExtra(EXTRA_SKILL, skillSelected)
            startActivity(finishIntent)
        }
        else {
            Toast.makeText(this, "Please select a skill to continue.", Toast.LENGTH_LONG).show()
        }

    }


}
