package com.example.thasbeehcounter

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter:Int=0

        var sp: SharedPreferences =getSharedPreferences("thasbeeh", Context.MODE_PRIVATE)
        val ed:SharedPreferences.Editor=sp.edit()

        var shwcnt=findViewById<TextView>(R.id.showcount)

        var count=findViewById<Button>(R.id.countbtn)

        var reset=findViewById<Button>(R.id.resetbtn)

        shwcnt.setText(sp.getString("counts",""))

        count.setOnClickListener{
            counter++
            ed.putString("counts",counter.toString())

            ed.commit()


            shwcnt.setText(sp.getString("counts","Error...!!"))


        }

        reset.setOnClickListener{
            var a=0
            ed.putString("counts",a.toString())
            ed.commit()

            shwcnt.setText(sp.getString("counts","Error...!!"))
        }




//        ed.putString("username",usrnme.text.toString())
//
//        ed.putString("password",passwrd.text.toString())
//
//        ed.putString("loginstatus",logstatus)
//
//
//        ed.commit()





    }
}