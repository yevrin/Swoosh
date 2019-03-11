package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_GENDER
import kotlinx.android.synthetic.main.activity_gender.*

class GenderActivity : BaseActivity() {

    var selectedGender = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gender)
    }
    fun genderNextClick(view: View){
        if(!selectedGender.isEmpty()) {
            val skillLevelIntent = Intent(this, SkillLevelActivity::class.java)
            skillLevelIntent.putExtra(EXTRA_GENDER, selectedGender)
            startActivity(skillLevelIntent)
        }else{
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()

        }
    }

    fun onMensClick(view: View){
        womensGenderBtn.isChecked = false
        coedGenderBtn.isChecked = false

        selectedGender = "mens"
    }

    fun onWomensClick(view: View){
        mensGenderBtn.isChecked = false
        coedGenderBtn.isChecked = false

        selectedGender = "womens"
    }

    fun onCoedClick(view: View){
        mensGenderBtn.isChecked = false
        womensGenderBtn.isChecked = false

        selectedGender = "coed"
    }

}
