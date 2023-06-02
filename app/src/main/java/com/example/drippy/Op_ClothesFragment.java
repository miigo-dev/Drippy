package com.example.drippy;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class Op_ClothesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.clothesfragment_op, container, false);

        ImageButton btnShowDialog = view.findViewById(R.id.imgbtn2);
        btnShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomDialog();
            }
        });

        ImageButton btnShowDialog1 = view.findViewById(R.id.imgbtn8);
        btnShowDialog1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomDialog();
            }
        });
        return view;
    }



    public void showCustomDialog() {
        // Create the custom dialog
        Dialog dialog = new Dialog(getActivity());
        dialog.setContentView(R.layout.custom_popupbtn1);

        // Set dialog properties (optional)
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(true);

        // Find views within the dialog
        ImageButton btnClose = dialog.findViewById(R.id.btnClose);

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

    public void showCustomDialog1() {
        // Create the custom dialog
        Dialog dialog = new Dialog(getActivity());
        dialog.setContentView(R.layout.custom_popupbtn1);

        // Set dialog properties (optional)
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(true);

        // Find views within the dialog
        ImageButton btnClose = dialog.findViewById(R.id.btnClose1);

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