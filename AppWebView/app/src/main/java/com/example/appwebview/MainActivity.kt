package com.example.appwebview

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class   MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSub.setOnClickListener { view: View? ->
            var intent = Intent (this, WebView::class.java)
            saveSharedPreference("sub")
            startActivity(intent);
        }

        btnEbay.setOnClickListener { view: View? ->
            var intent = Intent (this, WebView2::class.java)
            saveSharedPreference("ebay")
            startActivity(intent);
        }

        btnBusca.setOnClickListener { view: View? ->
            var intent = Intent (this, WebView3::class.java)
            saveSharedPreference("busca")
            startActivity(intent);
        }

        btnMercado.setOnClickListener { view: View? ->
            var intent = Intent (this, WebView4::class.java)
            saveSharedPreference("mercado")
            startActivity(intent);
        }

        btnWeb.setOnClickListener { view: View? ->
            var intent = Intent (this, WebView5::class.java)
            saveSharedPreference("web")
            startActivity(intent);
        }

        btnMagalu.setOnClickListener { view: View? ->
            var intent = Intent (this, WebView6::class.java)
            saveSharedPreference("magalu")
            startActivity(intent);
        }

        btnNetshoes.setOnClickListener { view: View? ->
            var intent = Intent (this, WebView7::class.java)
            saveSharedPreference("nets")
            startActivity(intent);
        }

        btnAmerica.setOnClickListener { view: View? ->
            var intent = Intent (this, WebView8::class.java)
            saveSharedPreference("america")
            startActivity(intent);
        }

        btnSobre.setOnClickListener { view: View? ->
            var intent = Intent (this, Sobre::class.java)

            startActivity(intent);
        }

    }

    fun saveSharedPreference(site : String) {
        val sharedPreferences = getSharedPreferences("sobre", Context.MODE_PRIVATE)

        val x = sharedPreferences.getInt(site, 0)

        sharedPreferences.edit().putInt(site, x + 1).apply()
    }

}
