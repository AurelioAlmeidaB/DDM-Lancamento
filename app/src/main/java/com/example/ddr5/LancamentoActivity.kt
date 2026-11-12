package com.example.ddr5

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LancamentoActivity : AppCompatActivity() {

    private lateinit var edtCod: EditText
    private lateinit var edtQuant: EditText
    private lateinit var edtValor: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lancamentoactivity)

        edtCod = findViewById(R.id.edtCod)
        edtQuant = findViewById(R.id.edtQuant)
        edtValor = findViewById(R.id.edtValor)
    }

    fun btnConfirmarOnClick(view: View) {
        val intent = Intent(this, ConfirmarActivity::class.java)
        intent.putExtra("cod", edtCod.text.toString())
        intent.putExtra("quant", edtQuant.text.toString())
        intent.putExtra("valor", edtValor.text.toString())
        startActivity(intent)
    }
}