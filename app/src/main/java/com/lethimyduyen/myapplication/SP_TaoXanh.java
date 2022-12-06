package com.lethimyduyen.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SP_TaoXanh extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sp_taoxanh);
        //
    }
    public void BackToWelcome(View view) {
        startActivity(new Intent(SP_TaoXanh.this, MainActivity.class));
    }
    public void Chonmua(View view) {
        startActivity(new Intent(SP_TaoXanh.this, Pay.class));
    }


}
