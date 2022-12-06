package com.lethimyduyen.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Sp_CaHoi extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sp_cahoi);
        //
    }

    public void BackToWelcome(View view) {
        startActivity(new Intent(Sp_CaHoi.this, MainActivity.class));
    }
    public void Chonmua(View view) {
        startActivity(new Intent(Sp_CaHoi.this, Pay.class));
    }

}

