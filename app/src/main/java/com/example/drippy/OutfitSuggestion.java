package com.example.drippy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageButton;

public class OutfitSuggestion extends AppCompatActivity {

    ImageButton imageBtn;
    ImageButton imageBtn1;
    ImageButton imageBtn2;
    ImageButton imageBtn3;

    ImageButton imageBtn4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outfit_suggestion);

        imageBtn = findViewById(R.id.btnPlanning2);
        imageBtn.setOnClickListener(view -> {
            Intent intent = new Intent(OutfitSuggestion.this, Outfit_Planning.class );
            startActivity(intent);
        });

        imageBtn1 = findViewById(R.id.btnWardrobe2);
        imageBtn1.setOnClickListener(view -> {
            Intent intent = new Intent(OutfitSuggestion.this, Wardrobe.class );
            startActivity(intent);
        });

        imageBtn2 = findViewById(R.id.btnHome2);
        imageBtn2.setOnClickListener(view -> {
            Intent intent = new Intent(OutfitSuggestion.this, Homepage.class );
            startActivity(intent);
        });

        imageBtn3 = findViewById(R.id.btnBack2);
        imageBtn3.setOnClickListener(view -> {
            Intent intent = new Intent(OutfitSuggestion.this, Wardrobe.class );
            startActivity(intent);
        });

        imageBtn4 = findViewById(R.id.BnW);
        imageBtn4.setOnClickListener(view -> {
            Intent intent = new Intent(OutfitSuggestion.this, Os_BNWFragment.class );
            startActivity(intent);
        });

    }
}