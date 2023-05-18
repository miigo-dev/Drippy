package com.example.drippy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }

    public void onBackPressed() {
        moveTaskToBack(true);
    }
}