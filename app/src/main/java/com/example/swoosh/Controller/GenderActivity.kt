package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_gender.*

class GenderActivity : BaseActivity() {

    //var selectedGender = ""
    var player = Player("", "")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gender)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun genderNextClick(view: View){
        if(!player.gender.isEmpty()) {
            val skillLevelIntent = Intent(this, SkillLevelActivity::class.java)
            //finishIntent.putExtra(EXTRA_GENDER, selectedGender)
            skillLevelIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(skillLevelIntent)
        }else{
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()

        }
    }

    fun onMensClick(view: View){
        womensGenderBtn.isChecked = false
        coedGenderBtn.isChecked = false

        player.gender = "mens"
    }

    fun onWomensClick(view: View){
        mensGenderBtn.isChecked = false
        coedGenderBtn.isChecked = false

        player.gender = "womens"
    }

    fun onCoedClick(view: View){
        mensGenderBtn.isChecked = false
        womensGenderBtn.isChecked = false

        player.gender = "coed"
    }

}
