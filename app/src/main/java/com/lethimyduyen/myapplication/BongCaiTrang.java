package com.lethimyduyen.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class BongCaiTrang extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bongcaitrang);
        //
    }
    public void BackToWelcome(View view) {
        startActivity(new Intent(BongCaiTrang.this, MainActivity.class));
    }
    public void Chonmua(View view) {
        startActivity(new Intent(BongCaiTrang.this, Pay.class));
    }
}
