package com.example.drippy;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import java.io.FileInputStream;


public class Startup extends AppCompatActivity {

    private static final int ANIMATION_DURATION = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);

        /*
        FileInputStream serviceAccount =
                new FileInputStream("path/to/serviceAccountKey.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://drippy-16d7d-default-rtdb.asia-southeast1.firebasedatabase.app")
                .build();

        FirebaseApp.initializeApp(options);
         */


        // Fade-in Logo Animation
        ImageView logoImageView = findViewById(R.id.imageView3);

        // Set initial transparency to 0
        logoImageView.setAlpha(0f);

        // Create fade-in animation
        ObjectAnimator fadeIn = ObjectAnimator.ofFloat(logoImageView, View.ALPHA, 0f, 1f);
        fadeIn.setDuration(ANIMATION_DURATION);
        fadeIn.setInterpolator(new AccelerateDecelerateInterpolator());

        // Start the animation
        fadeIn.start();

        // Wait for the animation to finish and navigate to the next activity
        fadeIn.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {
                // Animation started
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                // Animation ended, navigate to the next activity
                startActivity(new Intent(Startup.this, Signup.class));
                finish();
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                // Animation cancelled
            }

            @Override
            public void onAnimationRepeat(Animator animator) {
                // Animation repeated
            }
        });
    }
}