package com.example.drippy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class shop_checkout extends AppCompatActivity {
    TextView numOfItems, total;
    int itemCount = 1;
    double itemPrice = 10057.22;
    double totalPrice = itemPrice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_checkout);

        DecimalFormat df = new DecimalFormat("#,###.00");

        numOfItems = findViewById(R.id.numberOfItems);
        total = findViewById(R.id.totalPrice);

        ImageButton addItem = findViewById(R.id.addItem);
        addItem.setOnClickListener(view -> {
            itemCount++;
            totalPrice = itemPrice * Math.pow(itemCount, 1);
            numOfItems.setText(itemCount + " item" + (itemCount > 0 ? "s" : ""));
            total.setText("P" + df.format(totalPrice));
        });

        ImageButton removeItem = findViewById(R.id.removeItem);
        removeItem.setOnClickListener(view -> {
            if (itemCount >= 1) {
                itemCount--;
                totalPrice = itemPrice * Math.pow(itemCount, 1);
                numOfItems.setText(itemCount + " item" + (itemCount > 0 ? "s" : ""));
                total.setText("P" + df.format(totalPrice));
            }
        });

        ImageView backButton = findViewById(R.id.backBtnItem);
        backButton.setOnClickListener(view -> {
            Intent intent = new Intent(shop_checkout.this, ShopItem.class);
            startActivity(intent);
        });

        ImageButton home = findViewById(R.id.btnHome);
        home.setOnClickListener(view -> {
            Intent intent = new Intent(shop_checkout.this, Homepage.class);
            startActivity(intent);
        });

        ImageButton sell = findViewById(R.id.btnSelling);
        sell.setOnClickListener(view -> {
            Intent intent = new Intent(shop_checkout.this, Sell.class);
            startActivity(intent);
        });

        ImageButton wardrobe = findViewById(R.id.btnWardrobe);
        wardrobe.setOnClickListener(view -> {
            Intent intent = new Intent(shop_checkout.this, Wardrobe.class);
            startActivity(intent);
        });

        ImageButton profile = findViewById(R.id.btnProfile);
        profile.setOnClickListener(view -> {
            Intent intent = new Intent(shop_checkout.this, Profile.class);
            startActivity(intent);
        });

        Button payment = findViewById(R.id.btnPayment);
        payment.setOnClickListener(view -> {
            Toast.makeText(shop_checkout.this, "Unavailable",
                    Toast.LENGTH_SHORT).show();
        });
    }
}