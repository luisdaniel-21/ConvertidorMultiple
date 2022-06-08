package com.example.convertidormultiple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class Decimal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_decimal)
    }

    fun btnResultado(view: View) {

        val edtnum1 : EditText = findViewById<EditText>(R.id.editTextNumber)
        val edtres : EditText = findViewById(R.id.resultadoBinarioO)

        var str : String = edtnum1.text.toString()
        var i : Int = Integer.parseInt(str)
        var binary : String = Integer.toBinaryString(i)
        edtres.setText(binary)

        /* +++++++++++++++++++++++++++++++++++++++++ */

        val edtingresar : EditText = findViewById<EditText>(R.id.editTextNumber)
        val resultadoHexa : EditText = findViewById(R.id.resultadoHexadecimal)

        var stri : String = edtingresar.text.toString()
        var x : Int = Integer.parseInt(stri)
        var hexadecimal : String = Integer.toHexString(x)
        resultadoHexa.setText(hexadecimal)

        /* +++++++++++++++++++++++++++++++++++++++ */

        val edtingresarOctal : EditText = findViewById<EditText>(R.id.editTextNumber)
        val resultadoOcta : EditText = findViewById(R.id.resultadoOactalOf)

        var st : String = edtingresarOctal.text.toString()
        var y : Int = Integer.parseInt(st)
        var octal : String = Integer.toOctalString(y)
        resultadoOcta.setText(octal)

    }

    fun btnBorrar(view: View){

        val clean : EditText = findViewById<EditText>(R.id.editTextNumber)
        val clean1 : EditText = findViewById(R.id.resultadoBinarioO)
        val clean2 : EditText = findViewById(R.id.resultadoHexadecimal)
        val clean3 : EditText = findViewById(R.id.resultadoOactalOf)

        clean.setText("")
        clean1.setText("")
        clean2.setText("")
        clean3.setText("")


    }
}