package com.example.usuario.tecnocelula1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ComplexoActivity extends AppCompatActivity {
    private ImageButton button_inicio;
    private ImageButton buttonCamera;
    private ImageButton lbuttonInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complexo);

        button_inicio = (ImageButton) findViewById(R.id.button_inicio);
        button_inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ComplexoActivity.this, InicialActivity.class));
                
            }
        });
        buttonCamera = (ImageButton) findViewById(R.id.buttonCamera);

        buttonCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ir para tela
            }

        });

        lbuttonInfo = (ImageButton) findViewById(R.id.lbuttonInfo);

        lbuttonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ComplexoActivity.this, SobreActivity.class));
            }
        });


    }
}
