package com.example.usuario.tecnocelula1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SobreActivity extends AppCompatActivity {
    private ImageButton buttonInicio;
    private ImageButton buttonCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        buttonInicio = (ImageButton) findViewById(R.id.button_inicio);

        buttonInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SobreActivity.this, InicialActivity.class));
            }

        });
        buttonCamera = (ImageButton) findViewById(R.id.buttonCamera);

        buttonCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ir para tela
            }

        });



    }



    }

