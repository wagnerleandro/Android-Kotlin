package com.example.idadedocachorro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_idade_cachorro.*



class IdadeCachorroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_idade_cachorro)

        val calcula: Bundle? = intent.extras

        if (intent != null || intent.equals("")) {

            val idade_cachorro = calcula?.getString("idade")

            text_idade.text = ("A idade do seu cachorro é de " +calculaIdade(idade_cachorro).toString()+ " anos Humanos")

        }
        }

        fun calculaIdade(idade_cachorro: String?): Int {
            val valor_idade = idade_cachorro?.toInt()

            val resultado = valor_idade!! * 7

            return resultado

        }




}
