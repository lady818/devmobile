package com.example.bibliothequeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

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
