package com.example.drippy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class ChooseCategory extends AppCompatActivity {

    private ImageButton back7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_category);

        ImageButton back7 = findViewById(R.id.back7);

        back7.setOnClickListener(view -> {
            Intent intent = new Intent(ChooseCategory.this, Variation.class);
            startActivity(intent);

        });
    }
}