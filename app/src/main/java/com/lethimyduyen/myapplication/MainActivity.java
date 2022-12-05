package com.lethimyduyen.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    YethichFragment yethichFragment = new YethichFragment();
    taikhoanFragment taikhoanFragment = new taikhoanFragment();
    KhamPhaFragment khamPhaFragment = new KhamPhaFragment();
    giohangFragment giohangFragment = new giohangFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_nav);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();
                        return true;
                    case R.id.find:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,khamPhaFragment).commit();
                        return true;
                    case R.id.shopping:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,giohangFragment).commit();
                        return true;
                    case R.id.heart:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,yethichFragment).commit();
                        return true;
                    case R.id.setting:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,taikhoanFragment).commit();
                        return true;
                }
                return false;
            }
        });
    }
    public void Search(View view) {
        startActivity (new Intent(MainActivity.this, ProductActivity.class));

    }

}


