package com.example.asamarsal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailToko extends AppCompatActivity {

    TextView tulisanrunningtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_toko);

        tulisanrunningtext=(TextView) findViewById(R.id.runningtext);
        tulisanrunningtext.setSelected(true);
    }
}