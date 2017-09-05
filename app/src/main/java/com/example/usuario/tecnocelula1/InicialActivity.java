package com.example.usuario.tecnocelula1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class InicialActivity extends AppCompatActivity {

    private ImageButton button_inicio;
    private ImageButton buttonCamera;
    private ImageButton buttonInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);

        button_inicio = (ImageButton) findViewById(R.id.button_inicio);
        button_inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
//        buttonCamera = (ImageButton) findViewById(R.id.buttonCamera);
//
//        buttonCamera.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //ir para tela
//            }
//
//        });
//
//        buttonInfo = (ImageButton) findViewById(R.id.lbuttonInfo);
//
//        buttonInfo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(InicialActivity.this, SobreActivity.class));
//            }
//
//        });


    }
    }

