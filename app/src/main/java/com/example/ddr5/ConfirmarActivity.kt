package com.example.ddr5

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ConfirmarActivity : AppCompatActivity() {

    private lateinit var txtCod: TextView
    private lateinit var txtQuant: TextView
    private lateinit var txtValor: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmaractivity)

        txtCod = findViewById(R.id.txtCod)
        txtQuant = findViewById(R.id.txtQuant)
        txtValor = findViewById(R.id.txtValor)

        txtCod.text = intent.getStringExtra("cod")
        txtQuant.text = intent.getStringExtra("quant")
        txtValor.text = intent.getStringExtra("valor")
    }
}