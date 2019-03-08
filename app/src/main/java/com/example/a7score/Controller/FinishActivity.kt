package com.example.a7score.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.a7score.R
import com.example.a7score.Utilities.EXTRA_LEAGUE
import com.example.a7score.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        league = intent.getStringExtra(EXTRA_LEAGUE)
        skill = intent.getStringExtra(EXTRA_SKILL)

        finalscreentext.text = "Looking for a $league $skill league for you..."

    }
}
