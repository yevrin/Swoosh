package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill_level.*

class SkillLevelActivity : BaseActivity() {

    //var gender = ""
    //var selectedSkillLvl = ""
    //var player = Player("", "")
    lateinit var player : Player

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_level)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
        //println("LifeCycle ${gender}")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun onFinishClick(view: View){
        if(!player.skillLevel.isEmpty()){
            val finishIntent = Intent(this, FinishActivity::class.java)
            //finishIntent.putExtra(EXTRA_GENDER, gender)
            //finishIntent.putExtra(EXTRA_SKILL_LVL, selectedSkillLvl)
            finishIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(finishIntent)
        }else{
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }

    fun onBeginnerClick(view: View){
        ballerSkillLvlBtn.isChecked = false
        player.skillLevel = "beginner"
    }

    fun onBallerClick(view: View){
        beginnerSkillLvlBtn.isChecked = false
        player.skillLevel = "baller"
    }

}
