package com.example.drippy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class osCreme extends AppCompatActivity {

    ImageButton imageBtn9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os_creme);

        imageBtn9 = findViewById(R.id.btnBack3);
        imageBtn9.setOnClickListener(view -> {
            Intent intent = new Intent(osCreme.this, OutfitSuggestion.class );
            startActivity(intent);
        });

    }
}