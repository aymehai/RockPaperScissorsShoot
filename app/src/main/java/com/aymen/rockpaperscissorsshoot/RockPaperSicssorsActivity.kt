package com.aymen.rockpaperscissorsshoot

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.rockpapersicssors_activity.*

class RockPaperSicssorsActivity  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rockpapersicssors_activity)

        setOnClickListenerForButtonRock()
        setOnClickListenerForButtonPaper()
        setOnClickListenerForButtonScissors()
    }


    private fun setOnClickListenerForButtonRock(){
        btnRock.setOnClickListener{
            val intent = Intent(this,UserResult::class.java)
            intent.putExtra("userPick", "rock")
            startActivity(intent)
        }
    }

    private fun setOnClickListenerForButtonPaper(){
        btnPaper.setOnClickListener{
            val intent = Intent(this,UserResult::class.java)
            intent.putExtra("userPick", "paper")
            startActivity(intent)
        }
    }

    private fun setOnClickListenerForButtonScissors(){
        btnSci.setOnClickListener{
            val intent = Intent(this,UserResult::class.java)
            intent.putExtra("userPick", "scissors")
            startActivity(intent)
        }
    }

}