package com.example.drippy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class Sell extends AppCompatActivity {

    private ImageButton myProduct;
    private ImageButton rating;
    private ImageButton financeBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell);

        ImageButton myProduct = findViewById(R.id.myProduct);
        ImageButton rating = findViewById(R.id.rating);
        ImageButton financeBtn = findViewById(R.id.financeBtn);

        myProduct.setOnClickListener(view -> {
            Intent intent = new Intent(Sell.this, Add_Product.class);
            startActivity(intent);
        });
        rating.setOnClickListener(view -> {
            Intent intent = new Intent(Sell.this, Shop_Rate.class);
            startActivity(intent);
        });
        financeBtn.setOnClickListener(view -> {
            Intent intent = new Intent(Sell.this, Finance.class);
            startActivity(intent);
        });


    }
}