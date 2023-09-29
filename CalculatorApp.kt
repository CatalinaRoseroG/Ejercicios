package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    private lateinit var Numero1EditText: EditText
    private lateinit var Numero2EditText: EditText
    private lateinit var resultadoEditText: EditText

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Obtener referencias a los elementos de la interfaz grafica

        val botonSuma = findViewById<Button>(R.id.Suma)
        val botonResta = findViewById<Button>(R.id.Resta)
        val botonMulti = findViewById<Button>(R.id.Multiplicacion)
        val botonDivi = findViewById<Button>(R.id.Division)


        //Configurar los botones

           botonSuma.setOnClickListener {
            calcularSuma()
        }

        botonResta.setOnClickListener{
            calcularResta()
        }


    }

    private fun calcularSuma() {

        val num1 = Numero1EditText.text.toString().toDoubleOrNull() ?: 0.0
        val num2 = Numero2EditText.text.toString().toDoubleOrNull() ?: 0.0

        val resultado = num1 + num2

        resultadoEditText.setText(resultado.toString())

    }

    private fun calcularResta(){

        val num1 = Numero1EditText.text.toString().toDoubleOrNull() ?: 0.0
        val num2 = Numero2EditText.text.toString().toDoubleOrNull() ?: 0.0

        val resultado = num1 - num2

        resultadoEditText.setText(resultado.toString())

    }


}