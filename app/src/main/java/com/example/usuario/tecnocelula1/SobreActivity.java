package com.example.usuario.tecnocelula1;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class SobreActivity extends AppCompatActivity {
    private BottomNavigationView  bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.inicioItem) {
                    startActivity(new Intent(SobreActivity.this, MainActivity.class));

                } else if (item.getItemId() == R.id.camaraItem) {

                } else if (item.getItemId() == R.id.sobreItem) {
                    return false;
                }

                return true;
            }

        });

    }
}
