package com.example.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_gender.*

class GenderActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gender)

        fun genderNextClick(view: View){
            val skillLevelIntent = Intent(this, SkillLevelActivity::class.java)
            startActivity(skillLevelIntent)

        }
    }
}
