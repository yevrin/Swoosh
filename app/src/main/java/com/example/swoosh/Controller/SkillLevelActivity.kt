package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_GENDER
import com.example.swoosh.Utilities.EXTRA_SKILL_LVL
import kotlinx.android.synthetic.main.activity_skill_level.*

class SkillLevelActivity : BaseActivity() {

    var gender = ""
    var selectedSkillLvl = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_level)
        gender = intent.getStringExtra(EXTRA_GENDER)
        //println("LifeCycle ${gender}")
    }

    fun onFinishClick(view: View){
        if(!selectedSkillLvl.isEmpty()){
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_GENDER, gender)
            finishIntent.putExtra(EXTRA_SKILL_LVL, selectedSkillLvl)
            startActivity(finishIntent)
        }else{
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }

    fun onBeginnerClick(view: View){
        ballerSkillLvlBtn.isChecked = false
        selectedSkillLvl = "beginner"
    }

    fun onBallerClick(view: View){
        beginnerSkillLvlBtn.isChecked = false
        selectedSkillLvl = "baller"
    }

}
