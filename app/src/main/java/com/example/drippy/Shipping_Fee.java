package com.example.drippy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class Shipping_Fee extends AppCompatActivity {

    private ImageButton back4;
    private ImageButton submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipping_fee);


        ImageButton back4 = findViewById(R.id.back4);
        ImageButton submitBtn = findViewById(R.id.submitBtn);

        back4.setOnClickListener(view -> {
                Intent intent = new Intent(Shipping_Fee.this, Add_Product.class);
            startActivity(intent);
        });

        submitBtn.setOnClickListener(view -> {
            Intent intent = new Intent(Shipping_Fee.this, Add_Product.class);
            startActivity(intent);
        });
    }
}