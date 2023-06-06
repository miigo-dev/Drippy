package com.example.drippy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {

    Button btnLogin;
    EditText editTextEmail, editTextPassword;
    CheckBox rememberMe;

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        mAuth = FirebaseAuth.getInstance();

        editTextEmail = findViewById(R.id.email);
        editTextPassword = findViewById(R.id.password);
        rememberMe = findViewById(R.id.checkBoxRemember);

        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(view -> {
            String email, password;
            email = String.valueOf(editTextEmail.getText());
            password = String.valueOf(editTextPassword.getText());

            StringBuilder errorMessage = new StringBuilder();

            if (TextUtils.isEmpty(email)) {
                errorMessage.append("Enter Email\n");
            }

            if (TextUtils.isEmpty(password)) {
                errorMessage.append("Enter Password\n");
            }

            if (errorMessage.length() > 0) {
                Toast.makeText(Login.this, errorMessage.toString(), Toast.LENGTH_SHORT).show();
                return;
            }

            if (rememberMe.isChecked()) {
                FirebaseUser currentUser = mAuth.getCurrentUser();
                if (currentUser != null) {
                    startActivity(new Intent(Login.this, Homepage.class));
                }
            }

            mAuth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(task -> {
                        if (task.isSuccessful()) {
                            Toast.makeText(Login.this, "Successfully Logged-in.",
                                    Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(Login.this, Homepage.class));
                        } else {
                            Toast.makeText(Login.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                            }
                    });
        });
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}