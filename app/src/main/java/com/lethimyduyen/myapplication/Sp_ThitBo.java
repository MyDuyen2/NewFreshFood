package com.lethimyduyen.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Sp_ThitBo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sp_thitbo);
        //
    }
    public void BackToWelcome(View view) {
        startActivity(new Intent(Sp_ThitBo.this, MainActivity.class));
    }
    public void Chonmua(View view) {
        startActivity(new Intent(Sp_ThitBo.this, Pay.class));
    }

}

