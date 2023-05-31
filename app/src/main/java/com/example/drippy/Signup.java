package com.example.drippy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Signup extends AppCompatActivity {

    Button btnCreate;
    TextView txtLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        btnCreate = findViewById(R.id.btnCreate);
        btnCreate.setOnClickListener(view -> {
            Intent intent = new Intent(Signup.this, Homepage.class);
            startActivity(intent);
        });

        txtLogin = findViewById(R.id.textViewSignIn);
        txtLogin.setOnClickListener(view -> {
            Intent intent = new Intent(Signup.this, Login.class);
            startActivity(intent);
        });
    }
}