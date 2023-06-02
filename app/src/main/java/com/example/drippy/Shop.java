package com.example.drippy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class Shop extends AppCompatActivity {

    ImageButton imgbtn;
    ImageButton imgbtn1;
    ImageButton imgbtn2;
    ImageButton imgbtn3;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        imgbtn = findViewById(R.id.btnHome);
        imgbtn.setOnClickListener(view -> {
            Intent intent = new Intent(Shop.this, Homepage.class );
            startActivity(intent);
        });

        imgbtn1 = findViewById(R.id.btnSelling);
        imgbtn1.setOnClickListener(view -> {
            Intent intent = new Intent(Shop.this, Sell.class );
            startActivity(intent);
        });

        imgbtn2 = findViewById(R.id.btnWardrobe);
        imgbtn2.setOnClickListener(view -> {
            Intent intent = new Intent(Shop.this, Wardrobe.class );
            startActivity(intent);
        });

        imgbtn3 = findViewById(R.id.btnProfile);
        imgbtn3.setOnClickListener(view -> {
            Intent intent = new Intent(Shop.this, Profile.class );
            startActivity(intent);
        });
    }

}