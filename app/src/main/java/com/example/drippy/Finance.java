package com.example.drippy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class Finance extends AppCompatActivity {

    private ImageButton back2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finance);


        ImageButton back2 = findViewById(R.id.back2);

        back2.setOnClickListener(view -> {
            Intent intent = new Intent(Finance.this, Sell.class);
            startActivity(intent);
        });
    }
}