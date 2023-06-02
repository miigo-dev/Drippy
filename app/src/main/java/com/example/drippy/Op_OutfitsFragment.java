package com.example.drippy;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

public class Op_OutfitsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.outfitsfragment_op, container, false);

        ImageButton btnShowDialog = view.findViewById(R.id.imageButton27);
        btnShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomDialog();
            }
        });

        ImageButton btnShowDialog1 = view.findViewById(R.id.imageButton32);
        btnShowDialog1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomDialog1();
            }
        });

        ImageButton btnShowDialog2 = view.findViewById(R.id.imageButton33);
        btnShowDialog2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomDialog2();
            }
        });

        ImageButton btnShowDialog3 = view.findViewById(R.id.imageButton35);
        btnShowDialog3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomDialog3();
            }
        });
        return view;
    }
    public void showCustomDialog() {
        // Create the custom dialog
        Dialog dialog = new Dialog(getActivity());
        dialog.setContentView(R.layout.popupoutfit);

        // Set dialog properties (optional)
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(true);

        // Find views within the dialog
        ImageButton btnClose = dialog.findViewById(R.id.btnClose12);

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
        Dialog dialog1 = new Dialog(getActivity());
        dialog1.setContentView(R.layout.popupoutfit1);

        // Set dialog properties (optional)
        dialog1.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog1.setCancelable(true);

        // Find views within the dialog
        ImageButton btnClose = dialog1.findViewById(R.id.btnClose13);

        // Set click listener for the button
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close the dialog when the button is clicked
                dialog1.dismiss();
            }
        });

        // Show the dialog
        dialog1.show();
    }
    public void showCustomDialog2() {
        // Create the custom dialog
        Dialog dialog2 = new Dialog(getActivity());
        dialog2.setContentView(R.layout.popupoutfit2);

        // Set dialog properties (optional)
        dialog2.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog2.setCancelable(true);

        // Find views within the dialog
        ImageButton btnClose = dialog2.findViewById(R.id.btnClose14);

        // Set click listener for the button
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close the dialog when the button is clicked
                dialog2.dismiss();
            }
        });

        // Show the dialog
        dialog2.show();
    }
    public void showCustomDialog3() {
        // Create the custom dialog
        Dialog dialog3 = new Dialog(getActivity());
        dialog3.setContentView(R.layout.popupoutfit3);

        // Set dialog properties (optional)
        dialog3.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog3.setCancelable(true);

        // Find views within the dialog
        ImageButton btnClose = dialog3.findViewById(R.id.btnClose15);

        // Set click listener for the button
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close the dialog when the button is clicked
                dialog3.dismiss();
            }
        });

        // Show the dialog
        dialog3.show();
    }
}