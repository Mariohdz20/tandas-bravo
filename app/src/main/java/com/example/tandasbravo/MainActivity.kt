package com.example.tandasbravo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckedTextView
import android.widget.EditText



class MainActivity : AppCompatActivity() {

    private var simpleCheckedTextView: CheckedTextView? = null
    private var email: EditText? = null
    private var password: EditText? = null
    private var bnRegistrar: Button? = null
    private var bnIniciarSesion: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var contrato  = simpleCheckedTextView

        inicializarVistas()

        simpleCheckedTextView?.setOnClickListener(View.OnClickListener() {
            if (simpleCheckedTextView?.isChecked == true){
                contrato?.setCheckMarkDrawable(0)
                contrato?.isChecked() == false
            }else{
                contrato?.setCheckMarkDrawable(R.drawable.checked)
                contrato?.isChecked
            }
        })

        bnRegistrar?.setOnClickListener {
            val i = Intent(this@MainActivity, RegistrarseActivity::class.java)
            startActivity(i)
        }

        bnIniciarSesion?.setOnClickListener {
            val i = Intent(this@MainActivity, IniciarSesionActivity::class.java)
            startActivity(i)
        }

    }

    fun inicializarVistas() {

        simpleCheckedTextView = findViewById(R.id.simpleCheckedTextView)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        bnRegistrar = findViewById(R.id.registrar)
        bnIniciarSesion = findViewById(R.id.iniciarSesion)

    }

}