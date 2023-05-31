package com.example.drippy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Button btnGetStarted = findViewById(R.id.btnGetStarted);
        btnGetStarted.setOnClickListener(view -> {
            Intent intent = new Intent(Homepage.this, Wardrobe.class);
            startActivity(intent);
        });

        ImageButton ibSelling = findViewById(R.id.ibSelling);
        ibSelling.setOnClickListener(view -> {
            Intent intent = new Intent(Homepage.this, Sell.class);
            startActivity(intent);
        });
    }

    public void onBackPressed() {
        moveTaskToBack(true);
    }
}