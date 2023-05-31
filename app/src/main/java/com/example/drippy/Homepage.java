package com.example.drippy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Homepage extends AppCompatActivity {

    Button btnGetStarted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        btnGetStarted = findViewById(R.id.btnGetStarted);
        btnGetStarted.setOnClickListener(view -> {
            Intent intent = new Intent(Homepage.this, Wardrobe.class);
            startActivity(intent);
        });
    }

    public void onBackPressed() {
        moveTaskToBack(true);
    }
}