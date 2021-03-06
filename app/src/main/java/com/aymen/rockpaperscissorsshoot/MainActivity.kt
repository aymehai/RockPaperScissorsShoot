package com.aymen.rockpaperscissorsshoot

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.results_activity.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setOnClickListenerForButton()
        setExitListener()
    }

    private fun setOnClickListenerForButton(){

        btnYes.setOnClickListener{
            val intent = Intent(this,RockPaperSicssorsActivity::class.java)
            startActivity(intent)
        }
    }

    fun setExitListener(){
        btnNo.setOnClickListener {
            this.finishAffinity()
        }
    }

}
