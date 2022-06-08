package com.example.convertidormultiple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class Hexadecimal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hexadecimal)
    }

    fun btnCalcularHexadecimal(view: View){

        var edtHexadecimal = findViewById<EditText>(R.id.editTextNumber2).text.toString()
        val characterHex = "0123456789ABCDEF"
        val longitud = edtHexadecimal.length
        var i = -1
        edtHexadecimal = edtHexadecimal.uppercase()
        var valorDecimal = 0
        while (++i < longitud) {
            val caracter = edtHexadecimal[i].toString()
            val pos = characterHex.indexOf(caracter)
            valorDecimal = 16 * valorDecimal + pos
        }

        findViewById<TextView>(R.id.resultadoEnDecimal).text = valorDecimal.toString()
        var hexaDecim: String = valorDecimal.toString()

        /* ************************************* */

        var edtResultadoBinario : EditText = findViewById(R.id.resultadoEnBinario)

        var cadenaBinaria : String = hexaDecim.toString()
        var x: Int = Integer.parseInt(cadenaBinaria)
        var binario:String = Integer.toBinaryString(x)
        edtResultadoBinario.setText(binario)

        /* ************************************* */

        var edtResultadoOctall :EditText = findViewById(R.id.resultadoEnOctal)

        var cadenaDeOctall : String= hexaDecim.toString()
        var y: Int = Integer.parseInt(cadenaDeOctall)
        var octa:String = Integer.toOctalString(y)
        edtResultadoOctall.setText(octa)

    }

    fun btnBorrarHexa(view: View) {

        var limpiar1 :EditText = findViewById(R.id.editTextNumber2)
        var limpiar2 :EditText = findViewById(R.id.resultadoEnOctal)
        var limpiar3 :EditText = findViewById(R.id.resultadoEnDecimal)
        var limpiar4 :EditText = findViewById(R.id.resultadoEnBinario)

        limpiar1.setText("")
        limpiar2.setText("")
        limpiar3.setText("")
        limpiar4.setText("")



    }
}