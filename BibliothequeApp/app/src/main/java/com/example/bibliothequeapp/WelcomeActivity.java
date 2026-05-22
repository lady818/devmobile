package com.example.bibliothequeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Lab 3 — Écran d'accueil (TP Pr. FALL).
 * Clic sur le bouton : Toast « Accès à la liste des livres ».
 * Puis ouverture de la liste (transition Lab 4 : écran principal = liste).
 */
public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Button btnVoirLivres = findViewById(R.id.btnVoirLivres);

        btnVoirLivres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WelcomeActivity.this,
                        "Accès à la liste des livres",
                        Toast.LENGTH_SHORT).show();
                startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
            }
        });
    }
}
