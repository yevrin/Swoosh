package com.example.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        //val gender = intent.getStringExtra(EXTRA_GENDER)
        //val skillLevel = intent.getStringExtra(EXTRA_SKILL_LVL)
        //val player: Player = intent.getParcelableExtra(EXTRA_PLAYER)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        h1FinishTxt.text = "Looking for a ${player.gender} ${player.skillLevel} league near you..."
    }
}
