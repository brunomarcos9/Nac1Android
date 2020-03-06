package com.example.appwebview

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_sobre.*
import kotlinx.android.synthetic.main.activity_sobre.btnVoltar

class Sobre : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre)

        val sharedPreferences = getSharedPreferences("sobre", Context.MODE_PRIVATE)

        magalu.text = "Magalu: ${sharedPreferences.getInt("magalu", 0)} "
        ebay.text = "Ebay: ${sharedPreferences.getInt("ebay", 0)} "
        web.text = "Webmotors: ${sharedPreferences.getInt("web", 0)} "
        nets.text = "Netshoes: ${sharedPreferences.getInt("nets", 0)}"
        busca.text = "Buscapé: ${sharedPreferences.getInt("busca", 0)}"
        mercado.text = "MercadoLivre: ${sharedPreferences.getInt("mercado", 0)}"
        submarino.text = "Submarino: ${sharedPreferences.getInt("sub", 0)} "
        america.text = "Americanas: ${sharedPreferences.getInt("america", 0)}"


        btnLimpar.setOnClickListener {
            sharedPreferences.edit().clear().apply()

            recreate()
        }

        btnVoltar.setOnClickListener { v : View? ->

            var intent = Intent (this, MainActivity::class.java)

            startActivity(intent);
        }


    }
}
