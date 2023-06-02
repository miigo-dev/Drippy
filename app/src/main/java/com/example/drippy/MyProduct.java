package com.example.drippy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

public class MyProduct extends AppCompatActivity {


    private ImageButton btnBack7;
    private ImageButton btnAddProduct;



    private TabLayout tabLayout;
    private ViewPager2 viewPager2;
    private VpMyProduct adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_product);


        ImageButton btnBack7 = findViewById(R.id.btnBack7);

        btnBack7.setOnClickListener(view -> {
            Intent intent = new Intent(MyProduct.this, Sell.class);
            startActivity(intent);
        });

        ImageButton btnAddProduct = findViewById(R.id.btnAddProduct);

        btnAddProduct.setOnClickListener(view -> {
            Intent intent = new Intent(MyProduct.this, Add_Product.class);
            startActivity(intent);
        });


        tabLayout = findViewById(R.id.tabMyProduct);
        viewPager2 = findViewById(R.id.viewpagerMyProduct);

        tabLayout.addTab(tabLayout.newTab().setText(""));
        tabLayout.addTab(tabLayout.newTab().setText(""));
        tabLayout.addTab(tabLayout.newTab().setText(""));

        FragmentManager fragmentManager = getSupportFragmentManager();
        adapter = new VpMyProduct(fragmentManager, getLifecycle());
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