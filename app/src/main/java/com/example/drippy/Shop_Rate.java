package com.example.drippy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class Shop_Rate extends AppCompatActivity {

    private ImageButton back3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_rate);

        ImageButton back3 = findViewById(R.id.back3);

        back3.setOnClickListener(view -> {
            Intent intent = new Intent(Shop_Rate.this, Sell.class);
            startActivity(intent);
        });
    }
}