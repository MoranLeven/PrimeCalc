package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val eP: EditText = findViewById(R.id.enterPrime)
        val cP: Button = findViewById(R.id.checkPrime)
        val dP: TextView = findViewById(R.id.displayPrime)



        cP.setOnClickListener{
            val enteredPrime = eP.text.toString().toLong()
            if (isPrime(enteredPrime) == true) {
                dP.text = "$enteredPrime is a Prime No."
            }
            else{
                dP.text = "$enteredPrime is not a Prime No."
            }
    }


    }



    fun isPrime(n:Long):Boolean{
        if(n < 2.toLong()){
            return false
        }
        for(i in 2.until(n)){
            for(j in i .. n/2.toLong()){
                if(n%j==0.toLong()){
                    return false
                }
            }
        }
        return true
    }


}
