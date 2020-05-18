package com.example.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragments.R;
import com.example.fragments.fragment.ContatoFragment;
import com.example.fragments.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    private ConversasFragment conversasFragment;
    private ContatoFragment contatoFragment;
    private Button buttonConversa, buttonContato;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonContato = findViewById(R.id.buttonContatos);
        buttonConversa = findViewById(R.id.buttonConversas);

        getSupportActionBar().setElevation(0);

        conversasFragment = new ConversasFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo, conversasFragment);
        transaction.commit();

        buttonContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contatoFragment = new ContatoFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, contatoFragment);
                transaction.commit();
            }
        });

        buttonConversa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conversasFragment = new ConversasFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, conversasFragment);
                transaction.commit();
            }
        });
    }
}
