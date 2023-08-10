package com.example.asamarsal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Blank2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank2);

        ImageButton tombolBackblank2 = findViewById(R.id.tombolbackblank2);

        tombolBackblank2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Blank2.this, MainMenu.class);
                startActivity(intent);
            }
        });
    }
}