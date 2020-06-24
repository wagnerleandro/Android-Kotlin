package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            //Criar Banco
            SQLiteDatabase bancoDados = openOrCreateDatabase("app", MODE_PRIVATE, null);

            //Criar Tabela

            bancoDados.execSQL("CREATE TABLE IF NOT EXISTS frases( id INTEGER PRIMARY KEY AUTOINCREMENT, frase VARCHAR) ");

             // Excluir tabela
            //bancoDados.execSQL("DROP TABLE frases");



            //INSERIR DADOS
            bancoDados.execSQL("INSERT INTO frases(frase) VALUES('Eu vi. Você, veja... Eu já vi, parei de ver. Voltei a ver, e acho que o Neymar e o Ganso têm essa capacidade de fazer a gente olha')");
            bancoDados.execSQL("INSERT INTO frases(frase) VALUES('Nós não vamos colocar uma meta. Nós vamos deixar uma meta aberta. Quando a gente atingir a meta, nós dobramos a meta')");
            bancoDados.execSQL("INSERT INTO frases(frase) VALUES('Eu já entendi que você entende, pois se você não tivesse entendido não entenderia que você teria entendido para ser explicado antes de você entender')");
            bancoDados.execSQL("INSERT INTO frases(frase) VALUES('Não acho que quem ganhar ou quem perder, nem quem ganhar nem perder, vai ganhar ou perder.Vai todo mundo perder')");
            bancoDados.execSQL("INSERT INTO frases(frase) VALUES('Não chore! Não é necessário chorar para sofrer. Você sofre. Sem chorar')");




            //RECUPERAR E EXIBIR DADOS

            String consulta = "SELECT frase, id " +
                    "FROM frases order by RANDOM() ";

            Cursor cursor =  bancoDados.rawQuery(consulta, null);

            //INDICE DA TABELA

            int indiceFrase = cursor.getColumnIndex("frase");
            int indiceId = cursor.getColumnIndex("id");



            textView = findViewById(R.id.texto);

            cursor.moveToFirst();

            String frase = cursor.getString(indiceFrase);


            //Log.i("RESULTADO "," numero de linha" + frase);


            textView.setText(frase);
            cursor.moveToNext();



        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
