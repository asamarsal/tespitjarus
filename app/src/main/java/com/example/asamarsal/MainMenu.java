package com.example.asamarsal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        // Button
        ImageButton tombolLogout = findViewById(R.id.tombollogout);
        ImageButton tombolKunjungan = findViewById(R.id.tombolkunjungan);
        ImageButton tombolDashboard = findViewById(R.id.tomboldashboard);
        ImageButton tombolTransmission = findViewById(R.id.tomboltransmission);
        ImageButton tombolTarget = findViewById(R.id.tomboltarget);

        // Onclicklistener Pindah Activity
        tombolLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainMenu.this, MainActivity.class);
                startActivity(intent);
            }
        });

        tombolKunjungan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainMenu.this, ListStore.class);
                startActivity(intent);
            }
        });

        tombolDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainMenu.this, Blank2.class);
                startActivity(intent);
            }
        });

        tombolTransmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainMenu.this, Blank3.class);
                startActivity(intent);
            }
        });

        tombolTarget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainMenu.this, Blank1.class);
                startActivity(intent);
            }
        });

    }
}