package com.example.calculadoradenotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = btCalcular
        val resultado = txtResultado

        //Recebe notas, calcula media e faltas
        btCalcular.setOnClickListener {

            val nota1 = Integer.parseInt(inNota1.text.toString())
            val nota2 = Integer.parseInt(inNota2.text.toString())
            val media = (nota1 + nota2) / 2
            val faltas = Integer.parseInt(inFaltas.text.toString())

            //Condição para aprovação
            if (media >= 6 && faltas <= 10) {
                resultado.setText(
                    "Aluno aprovado!" + "\n" + "Nota final: " + media + "\n" + "Faltas: " + faltas)
            }
            else {
                resultado.setText(
                    "Aluno reprovado!" + "\n" + "Nota final: " + media + "\n" + "Faltas: " + faltas)
            }
        }
    }
}