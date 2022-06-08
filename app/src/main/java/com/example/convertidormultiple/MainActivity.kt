package com.example.convertidormultiple

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //Thread.sleep(1000)
        setTheme(R.style.Theme_ConvertidorMultiple)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnBinario(view: View) {

        Toast.makeText(this, "Binario", Toast.LENGTH_LONG).show()
        val intent = Intent(this, Binario::class.java)

        startActivity(intent)
    }

    fun btnOctal(view: View) {

        Toast.makeText(this, "Octal", Toast.LENGTH_LONG).show()
        val intent = Intent(this, Octal::class.java)
        startActivity(intent)


    }

    fun btnDecimal(view: View) {

        Toast.makeText(this, "Decimal", Toast.LENGTH_LONG).show()
        val intent = Intent(this, Decimal::class.java)
        startActivity(intent)

    }

    fun btnHexadecimal(view: View) {

        Toast.makeText(this, "Hexadecimal", Toast.LENGTH_LONG).show()
        val intent = Intent(this, Hexadecimal::class.java)
        startActivity(intent)
    }
}