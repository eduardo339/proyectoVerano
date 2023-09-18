package com.example.mvp_cloud_saplingsv2_1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AvanzadoMActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_m_avanzado)

        val entendido : Button = findViewById(R.id.entendidoA)

        entendido.setOnClickListener(){
            startActivity(Intent(this,NivelAvanzado::class.java))
        }
    }
}