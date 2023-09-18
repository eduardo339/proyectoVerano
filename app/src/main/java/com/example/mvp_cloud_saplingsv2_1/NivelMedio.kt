package com.example.mvp_cloud_saplingsv2_1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton

class NivelMedio : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nivel_medio)

        var calificacionFinal : Int = 0
        var cal : Int = 0

        val rb1 : RadioButton = findViewById(R.id.rb1M)
        val rb2 : RadioButton = findViewById(R.id.rb2M)
        val rb3 : RadioButton = findViewById(R.id.rb3M)
        val rb4 : RadioButton = findViewById(R.id.rb4M)
        val rb5 : RadioButton = findViewById(R.id.rb5M)

        var f1 : Int = 0
        var f2 : Int = 0
        var f3 : Int = 0
        var f4 : Int = 0
        var f5 : Int = 0

        val calificar : Button = findViewById(R.id.calificarM)
        calificar.setOnClickListener(){
            if(rb1.isChecked){
                calificacionFinal += 1
                f1  = 1
            }
            if(rb2.isChecked){
                calificacionFinal += 1
                f2  = 1
            }
            if(rb3.isChecked){
                calificacionFinal += 1
                f3  = 1
            }
            if(rb4.isChecked){
                calificacionFinal += 1
                f4  = 1
            }
            if(rb5.isChecked){
                calificacionFinal += 1
                f5  = 1
            }

            cal = calificacionFinal * 2
            calificacionFinal = 0
            startActivity(Intent(this,RetroMedio::class.java)
                .putExtra("calificacionFinal",cal)
                .putExtra("f1",f1)
                .putExtra("f2",f2)
                .putExtra("f3",f3)
                .putExtra("f4",f4)
                .putExtra("f5",f5))
        }


    }
}