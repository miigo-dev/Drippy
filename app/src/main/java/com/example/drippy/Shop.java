package com.example.drippy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Shop extends AppCompatActivity {

    ImageButton imgbtn, imgbtn1, imgbtn2, imgbtn3, imageButton17;
    ImageView btnSearch, btnCart;

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

        imageButton17 = findViewById(R.id.imageButton17);
        imageButton17.setOnClickListener(view -> {
            Intent intent = new Intent(Shop.this, ShopItem.class );
            startActivity(intent);
        });

        btnSearch = findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(view -> Toast.makeText(Shop.this, "Unavailable", Toast.LENGTH_SHORT).show());

        btnCart = findViewById(R.id.btnShoppingBag);
        btnCart.setOnClickListener(view -> {
            Intent intent = new Intent(Shop.this, shop_checkout.class );
            startActivity(intent);
        });
    }
}