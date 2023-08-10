package com.example.asamarsal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class DetailToko extends AppCompatActivity {

    TextView tulisanrunningtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_toko);

        tulisanrunningtext=(TextView) findViewById(R.id.runningtext);
        tulisanrunningtext.setSelected(true);

        Button tombolSelesai = findViewById(R.id.buttonselesai);

        tombolSelesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DetailToko.this, ListStore.class);
                startActivity(intent);
            }
        });
    }
}