package com.example.drippy;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class VpStatus extends FragmentStateAdapter {



    public VpStatus(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {

        if(position == 0){
            return new toShip();
        }
        if(position == 1){
            return new toCancelled();
        }
        if(position == 2){
            return new toReturn();
        }
        return new toReview();
    }


    @Override
    public int getItemCount() {
        return 4;
    }
}
