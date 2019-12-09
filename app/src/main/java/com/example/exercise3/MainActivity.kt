package com.example.exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     buttonCalc.setOnClickListener(){
         val<String> age = spinnerAge.selectedItem.toString().trim()
         var<double> premium = 0
             when(age){
                 "Less than 17" -> {premium = 60}
                 "17 - 25" -> {premium = 70}
                 "26 - 30" -> {premium = 90}
                 "31 - 40" -> {premium = 120}
                 "41 - 55" -> {premium = 150}
                 "More than 55" -> {premium = 150}
             }


         var<double> gender = 0
         if(radioMale.isChecked == true){
             when(age){
                 "Less than 17" -> {gender = 0}
                 "17 - 25" -> {gender = 50}
                 "26 - 30" -> {gender = 100}
                 "31 - 40" -> {gender = 150}
                 "41 - 55" -> {gender = 200}
                 "More than 55" -> {gender = 200}
             }
         }


         var<double> smoke = 0
         if(checkSmoker.isChecked == true){
             when(age){
                 "Less than 17" -> {gender = 0}
                 "17 - 25" -> {smoke = 100}
                 "26 - 30" -> {smoke = 150}
                 "31 - 40" -> {smoke = 200}
                 "41 - 55" -> {smoke = 250}
                 "More than 55" -> {smoke = 300}
             }
         }

         var<double> total = premium + gender + smoke
         textTotalAmount.text = "Total Amount: RM"+ total.toString();



         

     }


    }
}
