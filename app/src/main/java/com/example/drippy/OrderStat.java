package com.example.drippy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

public class OrderStat extends AppCompatActivity {


    private ImageButton back656;

    private TabLayout tabLayout;
    private ViewPager2 viewPager2;
    private VpStatus adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_stat);

        ImageButton back656 = findViewById(R.id.back656);

        back656.setOnClickListener(view -> {
            Intent intent = new Intent(OrderStat.this, Sell.class);
            startActivity(intent);
        });


        tabLayout = findViewById(R.id.tabOrderStatus);
        viewPager2 = findViewById(R.id.viewpagerOrderStatus);

        tabLayout.addTab(tabLayout.newTab().setText(""));
        tabLayout.addTab(tabLayout.newTab().setText(""));
        tabLayout.addTab(tabLayout.newTab().setText(""));
        tabLayout.addTab(tabLayout.newTab().setText(""));

        FragmentManager fragmentManager = getSupportFragmentManager();
        adapter = new VpStatus(fragmentManager, getLifecycle());
        viewPager2.setAdapter(adapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        }); {



        }


    }
}