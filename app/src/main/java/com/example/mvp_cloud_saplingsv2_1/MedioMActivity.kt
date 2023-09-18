package com.example.mvp_cloud_saplingsv2_1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MedioMActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_m_medio)

        val entendido : Button = findViewById(R.id.entendidoM)

        entendido.setOnClickListener(){
            startActivity(Intent(this,NivelMedio::class.java))
        }
    }
}