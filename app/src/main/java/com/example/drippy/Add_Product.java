package com.example.drippy;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Add_Product extends AppCompatActivity {

    private ImageButton categoryBtn;
    private ImageButton shippingFeeBtn;
    private ImageButton back1;
    private ImageButton saveBtn;
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);

        ImageButton categoryBtn = findViewById(R.id.categoryBtn);
        ImageButton shippingFeeBtn = findViewById(R.id.shippingFeeBtn);
        ImageButton saveBtn = findViewById(R.id.saveBtn);


        ImageButton back1 = findViewById(R.id.back1);

        imageButton = findViewById(R.id.uploadBtn);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open_camera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(open_camera, 100);



            }
        });

        categoryBtn.setOnClickListener(view -> {
            Intent intent = new Intent(Add_Product.this, Variation.class);
            startActivity(intent);

        });

        shippingFeeBtn.setOnClickListener(view -> {
            Intent intent = new Intent(Add_Product.this, Shipping_Fee.class);
            startActivity(intent);
        });

        back1.setOnClickListener(view -> {
            Intent intent = new Intent(Add_Product.this, Sell.class);
            startActivity(intent);
        });
        saveBtn.setOnClickListener(view -> {
            Toast.makeText(Add_Product.this, "Item Added.",
                    Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Add_Product.this, Sell.class);
            startActivity(intent);
        });
    }
}