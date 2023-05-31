package com.example.drippy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class Add_Product extends AppCompatActivity {

    private ImageButton categoryBtn;
    private ImageButton shippingFeeBtn;
    private ImageButton back1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);

        ImageButton categoryBtn = findViewById(R.id.categoryBtn);
        ImageButton shippingFeeBtn = findViewById(R.id.shippingFeeBtn);
        ImageButton back1 = findViewById(R.id.back1);

        categoryBtn.setOnClickListener(view -> {
            Intent intent = new Intent(Add_Product.this, Variation.class);
            startActivity(intent);

        });

        shippingFeeBtn.setOnClickListener(view -> {
            Intent intent = new Intent(Add_Product.this, Shipping_Fee.class);
            startActivity(intent);
        });

        back1.setOnClickListener(view -> {
            Intent intent = new Intent(Add_Product.this, Sell.class);
            startActivity(intent);
        });

    }
}