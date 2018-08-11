package com.example.bappi.weight.ActivityController

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bappi.weight.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result.*

class MainActivity : AppCompatActivity() {

     var earth = ""
     val marsGravity = 0.38
     val jupiterGravity = 2.34
     val saturnGravity = 1.06

     var result:Double? = null

  val weight = enterWeightText.text

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var weight = enterWeightText.text

    }



    fun marsButtonClicked (view: View) {
  jupiterButtonId.isChecked = false
        saturnButtonId.isChecked = false
 earth = "mars"


    }
    fun jupiterButtonClicked (view: View) {
     marsButtonId.isChecked = false
        saturnButtonId.isChecked = false
        earth = "jupiter"
    }

    fun saturnButtonClicked (view: View) {
        marsButtonId.isChecked = false
        jupiterButtonId.isChecked = false
        earth = "saturn"

    }

    fun calculatedWeight (userWeight: Double) {

        var weight = enterWeightText.text
        var userWeight: Double = weight.toString().toDouble()
        result = userWeight * marsGravity
        result = userWeight * jupiterGravity
        result = userWeight * saturnGravity

        showWeightButtonId.setOnClickListener {

            if (marsButtonId.isChecked) {
                resultTextId.text = calculatedWeight(result.toString().toDouble()).toString()
            }

        }

    }
    fun showWeightButtonClicked (view: View) {

        var resultIntent = Intent(this, resultTextId::class.java)

        startActivity(resultIntent)

    }

}

