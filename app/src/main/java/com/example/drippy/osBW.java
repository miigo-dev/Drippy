package com.example.drippy;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class osBW extends AppCompatActivity {


    ImageButton imageBtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os_bw);

        imageBtn4 = findViewById(R.id.btnBack3);
        imageBtn4.setOnClickListener(view -> {
            Intent intent = new Intent(osBW.this, OutfitSuggestion.class );
            startActivity(intent);
        });

        ImageButton showDialogButton = findViewById(R.id.btnInfo);
        showDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomDialog();
            }
        });
    }

    public void showCustomDialog(){

        Dialog dialog = new Dialog(osBW.this);
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
