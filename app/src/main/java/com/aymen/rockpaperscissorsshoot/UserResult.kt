package com.aymen.rockpaperscissorsshoot

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.results_activity.*
import kotlinx.android.synthetic.main.rockpapersicssors_activity.*
import java.util.Random

class UserResult  : AppCompatActivity() {

    val list = ArrayList<String>()
    var results : String = "loser"
    var rock = 0
    var paper = 1
    var scissors = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.results_activity)

        list.add("rock")
        list.add("paper")
        list.add("scissors")

        showResults()
        setOnClickListenerForButtonPlayAgain()

    }


    private fun showResults(){


        var random = Random()
        var randomNum = random.nextInt(3)
        println(random)

        var userPick = getIntent().getExtras().getString("userPick")

        if(userPick.equals("rock")){
            if(list.get(randomNum) == "rock"){
                txtResult.setText("Its a draw")
                txtOpp.setText("Your opponent choose: " + list.get(randomNum))
            }
            else if(list.get(randomNum) == "paper"){
                txtResult.setText("You Lose")
                txtOpp.setText("Your opponent choose: " + list.get(randomNum))
            }
            else if(list.get(randomNum) == "scissors"){
                txtResult.setText("You Win")
                txtOpp.setText("Your opponent choose: " + list.get(randomNum))
            }
        }

        else if(userPick.equals("paper")){

            if(list.get(randomNum) == "paper"){
                txtResult.setText("Its a draw")
                txtOpp.setText("Your opponent choose: " + list.get(randomNum))
            }
            else if(list.get(randomNum) == "scissors"){
                txtResult.setText("You Lose")
                txtOpp.setText("Your opponent choose: " + list.get(randomNum))
            }
            else if(list.get(randomNum) == "rock"){
                txtResult.setText("You Win")
                txtOpp.setText("Your opponent choose: " + list.get(randomNum))
            }

        }

        else if(userPick.equals("scissors")){

            if(list.get(randomNum).equals("scissors")){
                txtResult.setText("Its a draw")
                txtOpp.setText("Your opponent choose: " + list.get(randomNum))
            }
            else if(list.get(randomNum).equals("rock")){
                txtResult.setText("You Lose")
                txtOpp.setText("Your opponent choose: " + list.get(randomNum))
            }
            else if(list.get(randomNum).equals("paper")){
                txtResult.setText("You Win")
                txtOpp.setText("Your opponent choose: " + list.get(randomNum))
            }

        }

    }

    private fun setOnClickListenerForButtonPlayAgain(){
        btnPlay.setOnClickListener{
            val intent = Intent(this,RockPaperSicssorsActivity::class.java)
            startActivity(intent)
        }
    }

}