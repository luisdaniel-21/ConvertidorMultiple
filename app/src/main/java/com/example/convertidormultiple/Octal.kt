package com.example.convertidormultiple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class Octal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_octal)
    }

    fun btnOctal(view: View) {

   // val edtOcta : EditText = findViewById(R.id.editTextNumberOctal)
    //val resultado : TextView = findViewById(R.id.editTextNumber3)

        var edtHexadecimal = findViewById<EditText>(R.id.editTextNumberOctal).text.toString()
        val characterHex = "01234567"
        val longitud = edtHexadecimal.length
        var i = -1
        edtHexadecimal = edtHexadecimal
        var valorDecimal = 0
        while (++i < longitud) {
            val dt = edtHexadecimal[i].toString()
            val pos = characterHex.indexOf(dt)
            valorDecimal = 8 * valorDecimal + pos
        }

        findViewById<TextView>(R.id.resultadoDecimalO).text = valorDecimal.toString()
        var octalnum: String = valorDecimal.toString()

        /* **************************************************** */

        val edtingresar1 : EditText = findViewById<EditText>(R.id.editTextNumberOctal)
        var resultadoBinarioO : EditText = findViewById(R.id.resultadoBinarioO)

        var numBin : String = edtingresar1.text.toString()
        var x: Int = Integer.parseInt(numBin)
        var binar:String = Integer.toBinaryString(x)
        resultadoBinarioO.setText(binar)

        /* ****************************************************** */
        val edtingresar2 : EditText = findViewById<EditText>(R.id.editTextNumberOctal)
        var resultadoHexa0 : EditText = findViewById(R.id.resultadoHexadecimalO)

        var numHx : String = edtingresar2.text.toString()
        var y: Int = Integer.parseInt(numHx)
        var hex:String = Integer.toHexString(y)
        resultadoHexa0.setText(hex)


    }

    fun btnBorrarHexa(view: View) {
        var limpiar1 :EditText = findViewById(R.id.editTextNumberOctal)
        var limpiar2 :EditText = findViewById(R.id.resultadoDecimalO)
        var limpiar3 :EditText = findViewById(R.id.resultadoBinarioO)
        var limpiar4 :EditText = findViewById(R.id.resultadoHexadecimalO)

        limpiar1.setText("")
        limpiar2.setText("")
        limpiar3.setText("")
        limpiar4.setText("")

    }
}