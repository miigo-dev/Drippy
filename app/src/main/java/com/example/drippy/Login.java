package com.example.drippy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Login extends AppCompatActivity {

    Button btnClickable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        btnClickable = findViewById(R.id.btnLogin);
        btnClickable.setOnClickListener(view -> {
            Intent intent = new Intent(Login.this, Homepage.class);
            startActivity(intent);
        });
    }
}