package com.example.convertidormultiple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class Binario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_binario)
    }

    fun btnCalcular(view: View) {

        val edtbinario : EditText = findViewById(R.id.editTextBinario)
        val txtresultado : TextView = findViewById(R.id.resultadoDecimalO)

        var binario : String = edtbinario.text.toString()
        binario = binario.reversed()

        val sisbinario : String = "1248"
        val longitud : Int = binario.length
        var i : Int = 0
        var decimal : Int = 0
        while (i<longitud){
            if (binario.get(i).toString() =="1")
                decimal += sisbinario.get(i).toString().toInt()
            i++
        }
        txtresultado.setText(decimal.toString())

        /* ********************************* */

       var numeroDec : String = decimal.toString()
        var edtResultadoOctal : EditText = findViewById(R.id.resultadoOctal)

        var cadenaoctal : String = numeroDec.toString()
        var y : Int = Integer.parseInt(cadenaoctal)
        var numoctal : String = Integer.toOctalString(y)
        edtResultadoOctal.setText(numoctal)

        /* ************************************** */

        var numeroDecimal : String = decimal.toString()
        var edtResultadoHexa : EditText = findViewById(R.id.resultadoHexdecimal)

        var cadenaHexadecimal : String = numeroDecimal.toString()
        var x : Int = Integer.parseInt(cadenaHexadecimal)
        var numhexa : String = Integer.toHexString(x)
        edtResultadoHexa.setText(numhexa)
    }

    fun btnBorrar(view: View) {

        val delete1 : EditText = findViewById(R.id.editTextBinario)
        val delete2 : TextView = findViewById(R.id.resultadoDecimalO)
        var delete3 : EditText = findViewById(R.id.resultadoOctal)
        var clean : EditText = findViewById(R.id.resultadoHexdecimal)

        delete1.setText("")
        delete2.setText("")
        delete3.setText("")
        clean.setText("")


    }


}





