package com.example.a7score.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.a7score.Utilities.EXTRA_LEAGUE
import com.example.a7score.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : BaseActivity() {

    var leagueSelected = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        nextButton.setOnClickListener {

            if (leagueSelected != "" ){
                val secondIntent = Intent (this, ThirdActivity::class.java)
                secondIntent.putExtra(EXTRA_LEAGUE, leagueSelected)
                startActivity(secondIntent)
            }
            else {
                Toast.makeText(this@SecondActivity, "Please select a league to play.", Toast.LENGTH_SHORT).show()
            }
        }

    }

    fun onMenClicked (view: View) {
        womenButton.isChecked = false
        mixedButton.isChecked = false

        leagueSelected = "Men's"
    }

    fun onWomenClicked(view: View) {
        menButton.isChecked = false
        mixedButton.isChecked = false

        leagueSelected = "Women's"
    }

    fun onMixedClicked(view: View) {
        womenButton.isChecked = false
        menButton.isChecked = false

        leagueSelected = "Mixed"
    }
}
