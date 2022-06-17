package com.ltbth.demoviewmodel

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var mViewModel: ScoreViewModel
    private lateinit var btnPlusA: Button
    private lateinit var btnPlusB: Button
    private lateinit var aTotalPoint: TextView
    private lateinit var bTotalPoint: TextView
//    private var aPoint = 0
//    private var bPoint = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlusA = findViewById(R.id.btn_plus_a)
        btnPlusB = findViewById(R.id.btn_plus_b)
        aTotalPoint = findViewById(R.id.team_a_score)
        bTotalPoint = findViewById(R.id.team_b_score)

        mViewModel = ViewModelProvider(this).get(ScoreViewModel::class.java)
        aTotalPoint.text = mViewModel.scoreTeamA.toString()
        bTotalPoint.text = mViewModel.scoreTeamB.toString()
//        aTotalPoint.text = aPoint.toString()
//        bTotalPoint.text = bPoint.toString()


        btnPlusA.setOnClickListener {
            mViewModel.scoreTeamA++
            aTotalPoint.text = mViewModel.scoreTeamA.toString()
//            aTotalPoint.text = aPoint++.toString()
        }

        btnPlusB.setOnClickListener {
            mViewModel.scoreTeamB++
            bTotalPoint.text = mViewModel.scoreTeamB.toString()
//            bTotalPoint.text = bPoint++.toString()
        }
    }

}