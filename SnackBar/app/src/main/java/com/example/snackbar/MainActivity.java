package com.example.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view = findViewById(R.id.activity_main);

        snackbar = Snackbar.make(view, "Bem vindo", Snackbar.LENGTH_INDEFINITE);
        snackbar.setDuration(5000);
        snackbar.show();
    }
}
