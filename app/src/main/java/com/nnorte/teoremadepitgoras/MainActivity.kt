package com.nnorte.teoremadepitgoras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {

    /**
     * Programa em android + kotlin, que calcula a hipotenusa de um triângulo retângulo
     * com entrada de dois valores referentes a cada um dos catetos desse triângulo,
     * utilizando o teorema de Pitágoras
     *
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcularHipotenusa(view: View){

        //Declaracao e inicializacao de variaveis com valores passados pelo utilizador

        val catetoA : Double = ed_catetoA.text.toString().toDouble()
        val catetoB : Double = ed_catetoB.text.toString().toDouble()

        //Declaracao de variavel que vai receber o resultado da hipotenusa
                                  //Calculo da hipotenusa
        val hipotenusa : Double = sqrt(Math.pow(catetoA, 2.0)+ Math.pow(catetoB,2.0))

        // Apresentacao do resultado

        Snackbar.make(view,"Hipotenusa = $hipotenusa", Snackbar.LENGTH_INDEFINITE).show()

        tv_solucaoH.text = hipotenusa.toString()

    }
}
