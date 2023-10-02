package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    var contador1: Int = 0
    var oper: Int = 0

    lateinit var numero1 : TextView
    lateinit var numero2 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numero1 = findViewById(R.id.numero1)
        numero2 = findViewById(R.id.numero2)
        val borrador = findViewById<Button>(R.id.borrar)
        val igual = findViewById<Button>(R.id.resultado)

        igual.setOnClickListener{

            var contador2: Int = numero2.text.toString().toInt()
            var resp: Int = 0

            when(oper){

                1 ->  resp = contador1 + contador2
                2 ->  resp = contador1 - contador2
                3 ->  resp = contador1 * contador2
                4 ->  resp = contador1 / contador2
            }

            numero2.setText(resp.toString())
            numero1.setText("")
        }

        borrador.setOnClickListener{
            numero1.setText("")
            numero2.setText("")
            contador1 = 0
            oper = 0
        }
    }

    fun ingresarDigito(view: View){

        //val numeIngresado = findViewById<TextView>(R.id.numeros)
        var nume2 : String = numero2.text.toString()

        when(view.id){

            R.id.cero -> numero2.setText(nume2 + "0")
            R.id.uno -> numero2.setText(nume2 + "1")
            R.id.dos -> numero2.setText(nume2+ "2")
            R.id.tres -> numero2.setText(nume2 + "3")
            R.id.cuatro -> numero2.setText(nume2 + "4")
            R.id.cinco -> numero2.setText(nume2 + "5")
            R.id.seis ->  numero2.setText(nume2 + "6")
            R.id.siete -> numero2.setText(nume2 + "7")
            R.id.ocho -> numero2.setText(nume2 + "8")
            R.id.nueve -> numero2.setText(nume2 + "9")

        }
    }

    fun operaciones(view: View){

        contador1 = numero2.text.toString().toInt()
        var nume2_text: String = numero2.text.toString()

        when(view.id){

            R.id.suma ->{
                numero1.setText(nume2_text + "+")
                oper = 1
            }
            R.id.resta ->{
                numero1.setText(nume2_text + "-")
                oper = 2
            }
            R.id.multiplicacion ->{
                numero1.setText(nume2_text + "x")
                oper = 3
            }
            R.id.division ->{
                numero1.setText(nume2_text + "/")
                oper = 4
            }

        }


    }
}