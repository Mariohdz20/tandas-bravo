package com.example.tandasbravo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class RegistrarseActivity : AppCompatActivity() {

    private var bnRegistrarse: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrarse)

        inicializarVistas()
        bnRegistrarse?.setOnClickListener {
            val i = Intent( this@RegistrarseActivity, MainActivity::class.java)
            startActivity(i)
            Toast.makeText(this, "Su registro de usuario ha sido exitoso", Toast.LENGTH_SHORT).show()
        }

    }

    fun inicializarVistas() {
        bnRegistrarse = findViewById(R.id.registrarse)
    }

}