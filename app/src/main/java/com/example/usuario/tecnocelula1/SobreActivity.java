package com.example.usuario.tecnocelula1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class SobreActivity extends AppCompatActivity {
    private ImageButton button_inicio;
    private ImageButton buttonCamera;

    private ZXingScannerView scannerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        button_inicio = (ImageButton) findViewById(R.id.button_inicio);

        button_inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SobreActivity.this, InicialActivity.class));
            }

        });
        buttonCamera = (ImageButton) findViewById(R.id.buttonCamera);

        buttonCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scannerView = new ZXingScannerView(SobreActivity.this);
                scannerView.setResultHandler(new ZXingScannerResultHandler());

                setContentView(scannerView);
                scannerView.startCamera();
            }

        });



    }

    @Override
    public void onPause(){
        super.onPause();
        scannerView.stopCamera();
    }

    class ZXingScannerResultHandler implements ZXingScannerView.ResultHandler {
        @Override
        public void handleResult(Result result){
            String resultCode = result.getText();
            if(resultCode.equals("complexo")) {
                setContentView(R.layout.activity_complexo);
                scannerView.stopCamera();
                final MediaPlayer mediaPlayer = MediaPlayer.create(SobreActivity.this, R.raw.complexo_golgi);
                mediaPlayer.start();
            }

        }
    }



    }

