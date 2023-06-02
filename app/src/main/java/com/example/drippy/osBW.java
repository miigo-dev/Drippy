package com.example.drippy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class osBW extends AppCompatActivity {


    ImageButton imageBtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os_bw);

        imageBtn4 = findViewById(R.id.btnBack3);
        imageBtn4.setOnClickListener(view -> {
            Intent intent = new Intent(osBW.this, OutfitSuggestion.class );
            startActivity(intent);
        });
    }
}