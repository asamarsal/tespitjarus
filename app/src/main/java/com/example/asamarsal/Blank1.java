package com.example.asamarsal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Blank1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank1);

        ImageButton tombolBackblank1 = findViewById(R.id.tombolbackblank1);

        tombolBackblank1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Blank1.this, MainMenu.class);
                startActivity(intent);
            }
        });

    }
}