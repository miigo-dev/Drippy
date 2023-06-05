package com.example.drippy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ShopItem extends AppCompatActivity {

    Button buyNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_item);

        buyNow = findViewById(R.id.btnBuyNow);
        buyNow.setOnClickListener(view -> {
            Intent intent = new Intent(ShopItem.this, shop_checkout.class );
            startActivity(intent);
        });
    }
}