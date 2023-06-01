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

public class Signup extends AppCompatActivity {

    EditText editTextEmail, editTextPassword, editTextUsername;
    TextView error;
    FirebaseAuth mAuth;

    /*
    @Override
    public void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            startActivity(new Intent(Signup.this, Homepage.class));
        }
    }
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        mAuth = FirebaseAuth.getInstance();

        editTextUsername = findViewById(R.id.username);
        editTextEmail = findViewById(R.id.email);
        editTextPassword = findViewById(R.id.password);
        Button btnCreate = findViewById(R.id.btnCreate);
        btnCreate.setOnClickListener(view -> {
            String username, email, password;
            username = String.valueOf(editTextUsername.getText());
            email = String.valueOf(editTextEmail.getText());
            password = String.valueOf(editTextPassword.getText());

            StringBuilder errorMessage = new StringBuilder();

            if (TextUtils.isEmpty(username)) {
                errorMessage.append("Enter Username\n");
            }

            if (TextUtils.isEmpty(email)) {
                errorMessage.append("Enter Email\n");
            }

            if (TextUtils.isEmpty(password)) {
                errorMessage.append("Enter Password\n");
            }

            if (password.length() < 6) {
                errorMessage.append(getString(R.string.passLength));
            }

            if (errorMessage.length() > 0) {
                Toast.makeText(Signup.this, errorMessage.toString(), Toast.LENGTH_SHORT).show();
                return;
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