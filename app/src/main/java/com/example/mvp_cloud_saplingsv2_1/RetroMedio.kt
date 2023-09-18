package com.example.mvp_cloud_saplingsv2_1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class RetroMedio : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retro_medio)

        val bundle = intent.extras
        val calificacion = bundle?.getInt("calificacionFinal")
        val f1= bundle?.getInt("f1")
        val f2= bundle?.getInt("f2")
        val f3= bundle?.getInt("f3")
        val f4= bundle?.getInt("f4")
        val f5= bundle?.getInt("f5")

        val s1 : ImageView = findViewById(R.id.msi1)
        val s2 : ImageView = findViewById(R.id.msi2)
        val s3 : ImageView = findViewById(R.id.msi3)
        val s4 : ImageView = findViewById(R.id.msi4)
        val s5 : ImageView = findViewById(R.id.msi5)

        val n1 : ImageView = findViewById(R.id.mno1)
        val n2 : ImageView = findViewById(R.id.mno2)
        val n3 : ImageView = findViewById(R.id.mno3)
        val n4 : ImageView = findViewById(R.id.mno4)
        val n5 : ImageView = findViewById(R.id.mno5)

        if(f1.toString() == "0") {
            s1.visibility = View.INVISIBLE
            n1.visibility = View.VISIBLE
        }
        if(f2.toString() == "0") {
            s2.visibility = View.INVISIBLE
            n2.visibility = View.VISIBLE
        }
        if(f3.toString() == "0") {
            s3.visibility = View.INVISIBLE
            n3.visibility = View.VISIBLE
        }
        if(f4.toString() == "0") {
            s4.visibility = View.INVISIBLE
            n4.visibility = View.VISIBLE
        }
        if(f5.toString() == "0") {
            s5.visibility = View.INVISIBLE
            n5.visibility = View.VISIBLE
        }
        val cal : TextView = findViewById(R.id.califM)
        cal.text = calificacion.toString()

        Toast.makeText(baseContext, "Calificacion: $calificacion", Toast.LENGTH_SHORT).show()
        val menu : Button = findViewById(R.id.menuM)
        menu.setOnClickListener(){
            startActivity(Intent(this,NivelesActivity::class.java))
        }
    }
}