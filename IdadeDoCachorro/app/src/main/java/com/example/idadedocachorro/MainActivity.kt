package com.example.idadedocachorro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button_calcula.setOnClickListener{

            val idade_cachorro = edit_Idade.text.toString()

            val intent = Intent(applicationContext, IdadeCachorroActivity::class.java)

            intent.putExtra("idade", idade_cachorro)



            startActivity(intent)

        }



    }


}

