package com.example.mvp_cloud_saplingsv2_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuth.AuthStateListener
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var authStateListener: AuthStateListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIngresar : Button = findViewById(R.id.btnEntrar)
        val email : TextView = findViewById(R.id.edTxtmail)
        val pass : TextView = findViewById(R.id.edTxtpass)

        firebaseAuth = Firebase.auth
        btnIngresar.setOnClickListener()
        {
            singIn(email.text.toString(),pass.text.toString())
        }
    }
    private fun singIn(email: String, pass: String){
        firebaseAuth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(this){
                task ->
            if(task.isSuccessful){
                startActivity(Intent(this,NivelesActivity::class.java))
            }else{
                Toast.makeText(baseContext, "Email o contraseña incorrectos",Toast.LENGTH_SHORT).show()
            }
        }
    }
}