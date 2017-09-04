package com.example.usuario.tecnocelula1;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TesteSom extends AppCompatActivity {

    Button buttonSom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste_som);

        buttonSom = (Button) findViewById(R.id.buttonSom);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.testesomsom);
        buttonSom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            mediaPlayer.start();
            }
        });
    }
}
