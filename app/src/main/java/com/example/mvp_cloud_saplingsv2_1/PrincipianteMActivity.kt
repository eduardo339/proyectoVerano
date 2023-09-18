package com.example.mvp_cloud_saplingsv2_1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PrincipianteMActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_m_principiante)

        val entendido : Button = findViewById(R.id.entendidoP)

        entendido.setOnClickListener(){
            startActivity(Intent(this,NivelPrincipiante::class.java))
        }

    }
}