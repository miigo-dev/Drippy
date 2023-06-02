package com.example.drippy;

import android.annotation.SuppressLint;
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
                showCustomDialog1();
            }
        });

        ImageButton btnShowDialog2 = view.findViewById(R.id.imgbtn1);
        btnShowDialog2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomDialog2();
            }
        });

        ImageButton btnShowDialog3 = view.findViewById(R.id.imgbtn);
        btnShowDialog3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomDialog3();
            }
        });

        ImageButton btnShowDialog4 = view.findViewById(R.id.imgbtn4);
        btnShowDialog4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomDialog4();
            }
        });

        ImageButton btnShowDialog5 = view.findViewById(R.id.imgbtn3);
        btnShowDialog5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomDialog5();
            }
        });
        ImageButton btnShowDialog6 = view.findViewById(R.id.imgbtn5);
        btnShowDialog6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomDialog6();
            }
        });

        ImageButton btnShowDialog7 = view.findViewById(R.id.imgbtn7);
        btnShowDialog7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomDialog7();
            }
        });

        ImageButton btnShowDialog8 = view.findViewById(R.id.imgbtn6);
        btnShowDialog8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomDialog8();
            }
        });

        ImageButton btnShowDialog9 = view.findViewById(R.id.imgbtn72);
        btnShowDialog9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomDialog9();
            }
        });

        ImageButton btnShowDialog10 = view.findViewById(R.id.imgbtn73);
        btnShowDialog10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomDialog10();
            }
        });

        ImageButton btnShowDialog11 = view.findViewById(R.id.imgbtn74);
        btnShowDialog11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomDialog11();
            }
        });

        return view;
    }


    public void showCustomDialog() {
        // Create the custom dialog
        Dialog dialog = new Dialog(getActivity());
        dialog.setContentView(R.layout.custom_popupbtn);

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
        Dialog dialog1 = new Dialog(getActivity());
        dialog1.setContentView(R.layout.custom_popupbtn1);

        // Set dialog properties (optional)
        dialog1.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog1.setCancelable(true);

        // Find views within the dialog
        ImageButton btnClose = dialog1.findViewById(R.id.btnClose1);

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
        dialog2.setContentView(R.layout.custom_popupbtn2);

        // Set dialog properties (optional)
        dialog2.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog2.setCancelable(true);

        // Find views within the dialog
        ImageButton btnClose = dialog2.findViewById(R.id.btnClose2);

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
        dialog3.setContentView(R.layout.custom_popupbtn3);

        // Set dialog properties (optional)
        dialog3.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog3.setCancelable(true);

        // Find views within the dialog
        ImageButton btnClose = dialog3.findViewById(R.id.btnClose3);

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
    public void showCustomDialog4() {
        // Create the custom dialog
        Dialog dialog4 = new Dialog(getActivity());
        dialog4.setContentView(R.layout.custom_popupbtn4);

        // Set dialog properties (optional)
        dialog4.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog4.setCancelable(true);

        // Find views within the dialog
        ImageButton btnClose = dialog4.findViewById(R.id.btnClose4);

        // Set click listener for the button
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close the dialog when the button is clicked
                dialog4.dismiss();
            }
        });

        // Show the dialog
        dialog4.show();
    }
    public void showCustomDialog5() {
        // Create the custom dialog
        Dialog dialog5 = new Dialog(getActivity());
        dialog5.setContentView(R.layout.custom_popupbtn5);

        // Set dialog properties (optional)
        dialog5.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog5.setCancelable(true);

        // Find views within the dialog
        ImageButton btnClose = dialog5.findViewById(R.id.btnClose5);

        // Set click listener for the button
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close the dialog when the button is clicked
                dialog5.dismiss();
            }
        });

        // Show the dialog
        dialog5.show();
    }
    public void showCustomDialog6() {
        // Create the custom dialog
        Dialog dialog6 = new Dialog(getActivity());
        dialog6.setContentView(R.layout.custom_popupbtn6);

        // Set dialog properties (optional)
        dialog6.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog6.setCancelable(true);

        // Find views within the dialog
        ImageButton btnClose = dialog6.findViewById(R.id.btnClose6);

        // Set click listener for the button
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close the dialog when the button is clicked
                dialog6.dismiss();
            }
        });

        // Show the dialog
        dialog6.show();
    }
    public void showCustomDialog7() {
        // Create the custom dialog
        Dialog dialog7 = new Dialog(getActivity());
        dialog7.setContentView(R.layout.custom_popupbtn7);

        // Set dialog properties (optional)
        dialog7.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog7.setCancelable(true);

        // Find views within the dialog
        ImageButton btnClose = dialog7.findViewById(R.id.btnClose7);

        // Set click listener for the button
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close the dialog when the button is clicked
                dialog7.dismiss();
            }
        });

        // Show the dialog
        dialog7.show();
    }
    public void showCustomDialog8() {
        // Create the custom dialog
        Dialog dialog8 = new Dialog(getActivity());
        dialog8.setContentView(R.layout.custom_popupbtn8);

        // Set dialog properties (optional)
        dialog8.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog8.setCancelable(true);

        // Find views within the dialog
        ImageButton btnClose = dialog8.findViewById(R.id.btnClose8);

        // Set click listener for the button
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close the dialog when the button is clicked
                dialog8.dismiss();
            }
        });

        // Show the dialog
        dialog8.show();
    }
    public void showCustomDialog9() {
        // Create the custom dialog
        Dialog dialog9 = new Dialog(getActivity());
        dialog9.setContentView(R.layout.custom_popupbtn9);

        // Set dialog properties (optional)
        dialog9.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog9.setCancelable(true);

        // Find views within the dialog
        ImageButton btnClose = dialog9.findViewById(R.id.btnClose9);

        // Set click listener for the button
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close the dialog when the button is clicked
                dialog9.dismiss();
            }
        });

        // Show the dialog
        dialog9.show();
    }
    public void showCustomDialog10() {
        // Create the custom dialog
        Dialog dialog10 = new Dialog(getActivity());
        dialog10.setContentView(R.layout.custom_popupbtn10);

        // Set dialog properties (optional)
        dialog10.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog10.setCancelable(true);

        // Find views within the dialog
        ImageButton btnClose = dialog10.findViewById(R.id.btnClose10);

        // Set click listener for the button
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close the dialog when the button is clicked
                dialog10.dismiss();
            }
        });

        // Show the dialog
        dialog10.show();
    }
    public void showCustomDialog11() {
        // Create the custom dialog
        Dialog dialog11 = new Dialog(getActivity());
        dialog11.setContentView(R.layout.custom_popupbtn11);

        // Set dialog properties (optional)
        dialog11.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog11.setCancelable(true);

        // Find views within the dialog
        ImageButton btnClose = dialog11.findViewById(R.id.btnClose11);

        // Set click listener for the button
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close the dialog when the button is clicked
                dialog11.dismiss();
            }
        });

        // Show the dialog
        dialog11.show();
    }

}