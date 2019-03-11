package com.example.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SkillLevelActivity : BaseActivity() {

    var gender = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_level)
        gender = intent.getStringExtra(EXTRA_GENDER)
        println("LifeCycle ${gender}")
    }
}
