 package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

 class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        startWelcomeBtn.setOnClickListener {
            val leagueIntent = Intent(this, GenderActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
