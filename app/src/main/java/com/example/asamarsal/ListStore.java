package com.example.asamarsal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ListStore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_store);

        // Linear Layout
        LinearLayout tombolToko1 = findViewById(R.id.toko1);
        LinearLayout tombolToko2 = findViewById(R.id.toko2);
        LinearLayout tombolToko3 = findViewById(R.id.toko3);
        LinearLayout tombolToko4 = findViewById(R.id.toko4);

        // Button
        ImageButton tombolBack = findViewById(R.id.tombolback);

        // Onclicklistener Pindah Activity
        tombolBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ListStore.this, MainMenu.class);
                startActivity(intent);
            }
        });

        tombolToko1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ListStore.this, ListStoreTerpilih.class);
                startActivity(intent);
            }
        });

        tombolToko2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ListStore.this, ListStoreTerpilih.class);
                startActivity(intent);
            }
        });

        tombolToko3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ListStore.this, ListStoreTerpilih.class);
                startActivity(intent);
            }
        });

        tombolToko4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ListStore.this, ListStoreTerpilih.class);
                startActivity(intent);
            }
        });
    }
}