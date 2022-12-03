package com.lethimyduyen.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class thongtincanhan extends AppCompatActivity {
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongtincanhan);
    }
    public void back(View view) {
        startActivity(new Intent(thongtincanhan.this, taikhoanFragment.class));
    }
}
