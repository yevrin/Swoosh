 package com.example.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welecome.*

 class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welecome)
        startWelcomeBtn.setOnClickListener {
            val leagueIntent = Intent(this, GenderActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
