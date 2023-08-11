package com.example.asamarsal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ListStoreTerpilih extends AppCompatActivity {

    /*private static final int REQUEST_IMAGE_CAPTURE = 1;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_store_terpilih);

        // Button
        Button tombolVisit = findViewById(R.id.buttonvisit);
        Button tombolNovisit = findViewById(R.id.buttonnovisit);
        Button tombolReset = findViewById(R.id.buttonreset);
        ImageButton tombolBack = findViewById(R.id.tombolback);
        /*Button buttonCamera = findViewById(R.id.buttoncamera);*/

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

        tombolReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ListStoreTerpilih.this, MainMenu.class);
                startActivity(intent);
            }
        });

        /* Error Saat Buka Camera
        buttonCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCamera();
            }
        }); */
    }

    /* Error Saat Buka Camera
    private void openCamera() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    } */

}