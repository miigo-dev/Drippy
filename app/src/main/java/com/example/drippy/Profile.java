package com.example.drippy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class Profile extends AppCompatActivity {

    ImageButton imgbtn;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imgbtn = findViewById(R.id.btnBack);
        imgbtn.setOnClickListener(view -> {
            Intent intent = new Intent(Profile.this, Shop.class );
            startActivity(intent);
        });
    }
}