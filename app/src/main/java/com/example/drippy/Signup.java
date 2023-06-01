package com.example.drippy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Signup extends AppCompatActivity {

    EditText editTextEmail, editTextPassword, editTextUsername;
    TextView error;
    FirebaseAuth mAuth;

    @Override
    public void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            startActivity(new Intent(Signup.this, Homepage.class));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        mAuth = FirebaseAuth.getInstance();

        editTextEmail = findViewById(R.id.email);
        editTextPassword = findViewById(R.id.password);
        editTextUsername = findViewById(R.id.username);
        Button btnCreate = findViewById(R.id.btnCreate);
        btnCreate.setOnClickListener(view -> {
            String email, password, username;
            email = String.valueOf(editTextEmail.getText());
            password = String.valueOf(editTextPassword.getText());
            username = String.valueOf(editTextUsername.getText());

            if (TextUtils.isEmpty(email)) {
                Toast.makeText(Signup.this, "Enter Email", Toast.LENGTH_SHORT).show();
                return;
            }

            if (TextUtils.isEmpty(password)) {
                Toast.makeText(Signup.this, "Enter Password", Toast.LENGTH_SHORT).show();
                return;
            }

            if (password.length() < 6) {
                error = findViewById(R.id.errorMsg);
                error.setVisibility(View.VISIBLE);
                error.setText(R.string.passLength);
                return;
            } else {
                error.setVisibility(View.GONE);
            }

            if (TextUtils.isEmpty(username)) {
                error = findViewById(R.id.errorMsg);
                error.setVisibility(View.VISIBLE);
                error.setText(R.string.userEmpty);
                return;
            } else {
                error.setVisibility(View.GONE);
            }

            mAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(task -> {
                        if (task.isSuccessful()) {
                            Toast.makeText(Signup.this, "Account Created",
                                    Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(Signup.this, Homepage.class));
                        } else {
                            Toast.makeText(Signup.this, "Error",
                                    Toast.LENGTH_SHORT).show();
                        }
                    });
        });

        TextView txtLogin = findViewById(R.id.textViewSignIn);
        txtLogin.setOnClickListener(view -> {
            Intent intent = new Intent(Signup.this, Login.class);
            startActivity(intent);
        });
    }
}