package com.example.usuario.tecnocelula1;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class InicialActivity extends AppCompatActivity {

    private ImageButton buttonInicio;
    private ImageButton buttonCamera;
    private ImageButton buttonInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        buttonInicio = (ImageButton) findViewById(R.id.buttonInicio);

        buttonInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //colocar toast
            }

        });
        buttonCamera = (ImageButton) findViewById(R.id.buttonCamera);

        buttonCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ir para tela
            }

        });

        buttonInfo = (ImageButton) findViewById(R.id.lbuttonInfo);

        buttonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InicialActivity.this, SobreActivity.class));
            }

        });


    }
    }

