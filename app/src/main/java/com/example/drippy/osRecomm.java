package com.example.drippy;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class osRecomm extends AppCompatActivity {

    ImageButton imageBtn9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os_recomm);


        imageBtn9 = findViewById(R.id.btnBack3);
        imageBtn9.setOnClickListener(view -> {
            Intent intent = new Intent(osRecomm.this, OutfitSuggestion.class);
            startActivity(intent);
        });

        ImageButton showDialogButton = findViewById(R.id.btnInfo4);
        showDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showCustomDialog();
            }
        });
    }
            public void showCustomDialog(){
                Dialog dialog = new Dialog(osRecomm.this);
                dialog.setContentView(R.layout.custominfo);

                // Set dialog properties (optional)
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.setCancelable(true);

                // Find views within the dialog
                ImageButton btnClose = dialog.findViewById(R.id.btnCloseInfo);

                // Set click listener for the button
                btnClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Close the dialog when the button is clicked
                        dialog.dismiss();
                    }
                });

                // Show the dialog
                dialog.show();
            }
    }
