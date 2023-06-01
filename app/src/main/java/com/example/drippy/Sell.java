package com.example.drippy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Sell extends AppCompatActivity {

    private ImageButton myProduct;
    private ImageButton rating;
    private ImageButton financeBtn;

    private ImageButton toShip;
    private ImageButton cancelled;
    private ImageButton toReturn;
    private ImageButton review;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell);

        ImageButton myProduct = findViewById(R.id.myProduct);
        ImageButton rating = findViewById(R.id.rating);
        ImageButton financeBtn = findViewById(R.id.financeBtn);

        ImageButton toShip = findViewById(R.id.toShip);
        ImageButton cancelled = findViewById(R.id.cancelled);
        ImageButton toReturn = findViewById(R.id.toReturn);
        ImageButton review = findViewById(R.id.review);



        toShip.setOnClickListener(view -> {
            Intent intent = new Intent(Sell.this, OrderStat.class);
            startActivity(intent);
        });
        cancelled.setOnClickListener(view -> {
            Intent intent = new Intent(Sell.this, OrderStat.class);
            startActivity(intent);
        });
        toReturn.setOnClickListener(view -> {
            Intent intent = new Intent(Sell.this, OrderStat.class);
            startActivity(intent);
        });
        review.setOnClickListener(view -> {
            Intent intent = new Intent(Sell.this, OrderStat.class);
            startActivity(intent);
        });

        
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