package com.example.drippy;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseAuth;

import kotlin.Lazy;

public class Wardrobe extends AppCompatActivity {
    private ImageButton imageButton;
    private ImageButton btnBack4;


    private ImageView imageView;

    ImageButton imgBtn;
    ImageButton imgBtn1;

    ImageButton imgBtn2;

    FloatingActionButton wardrobe;
    FloatingActionButton planning;
    FloatingActionButton suggestion;

    boolean aBoolean = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wardrobe);

        wardrobe = findViewById(R.id.btnWardrobe);
        planning = findViewById(R.id.btnPlanning);
        suggestion = findViewById(R.id.btnSuggestion);

        wardrobe.setOnClickListener(view -> {
            Intent intent = new Intent(Wardrobe.this, Homepage.class);
            startActivity(intent);
        });


        TextView textView = findViewById(R.id.Viewall);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        textView.setOnClickListener(v -> {
            Intent intent = new Intent(Wardrobe.this, Viewall.class);
            startActivity(intent);
        });


        imageButton = findViewById(R.id.camera);


        ImageButton btnBack4 = findViewById(R.id.btnBack4);

        btnBack4.setOnClickListener(view -> {
            Intent intent = new Intent(Wardrobe.this, Homepage.class);
            startActivity(intent);
        });

        imgBtn = findViewById(R.id.btnPlanning);
        imgBtn.setOnClickListener(view -> {
            Intent intent = new Intent(Wardrobe.this, Outfit_Planning.class);
            startActivity(intent);
        });

        imgBtn1 = findViewById(R.id.btnSuggestion);

        imgBtn1.setOnClickListener(view -> {
            Intent intent = new Intent(Wardrobe.this, OutfitSuggestion.class);
            startActivity(intent);
        });

        ImageButton imgbtn3 = findViewById(R.id.btnSelling);
        imgbtn3.setOnClickListener(view -> {
            Intent intent = new Intent(Wardrobe.this, Sell.class);
            startActivity(intent);
        });

        imgBtn2 = findViewById(R.id.btnBack4);

        imgBtn2.setOnClickListener(view -> {
            Intent intent = new Intent(Wardrobe.this, Shop.class);
            startActivity(intent);
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open_camera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(open_camera, 100);


            }
        });


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap photo = (Bitmap) data.getExtras().get("data");
        imageView.setImageBitmap(photo);
    }


}