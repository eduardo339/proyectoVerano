package com.example.mvp_cloud_saplingsv2_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NivelesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_niveles)

        var btnPrincipiante : Button = findViewById(R.id.btnPrincipiante)
        var btnMedio : Button = findViewById(R.id.btnMedio)
        var btnAvanzado : Button = findViewById(R.id.btnAvanzado)

        btnPrincipiante.setOnClickListener(){
            startActivity(Intent(this,PrincipianteMActivity::class.java))
        }

        btnMedio.setOnClickListener(){
            startActivity(Intent(this,MedioMActivity::class.java))
        }

        btnAvanzado.setOnClickListener(){
            startActivity(Intent(this,AvanzadoMActivity::class.java))
        }
    }
}