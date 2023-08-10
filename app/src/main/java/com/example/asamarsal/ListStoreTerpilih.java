package com.example.asamarsal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ListStoreTerpilih extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_store_terpilih);

        // Button
        Button tombolVisit = findViewById(R.id.buttonvisit);
        Button tombolNovisit = findViewById(R.id.buttonnovisit);
        ImageButton tombolBack = findViewById(R.id.tombolback);

        tombolVisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ListStoreTerpilih.this, DetailToko.class);
                startActivity(intent);
            }
        });

        tombolNovisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ListStoreTerpilih.this, ListStore.class);
                startActivity(intent);
            }
        });

        tombolBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ListStoreTerpilih.this, ListStore.class);
                startActivity(intent);
            }
        });
    }
}