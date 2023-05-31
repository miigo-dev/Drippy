package com.example.drippy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class Variation extends AppCompatActivity {

    private ImageButton selectCategoryBtn;
    private ImageButton back5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variation);

        ImageButton selectCategoryBtn = findViewById(R.id.selectCategoryBtn);
        ImageButton back5 = findViewById(R.id.back5);


        selectCategoryBtn.setOnClickListener(view -> {
            Intent intent = new Intent(Variation.this, ChooseCategory.class);
            startActivity(intent);

        });

        back5.setOnClickListener(view -> {
            Intent intent = new Intent(Variation.this, Add_Product.class);
            startActivity(intent);

        });
    }
}