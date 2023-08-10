package com.example.asamarsal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Blank3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank3);

        ImageButton tombolBackblank3 = findViewById(R.id.tombolbackblank3);

        tombolBackblank3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Blank3.this, MainMenu.class);
                startActivity(intent);
            }
        });
    }
}