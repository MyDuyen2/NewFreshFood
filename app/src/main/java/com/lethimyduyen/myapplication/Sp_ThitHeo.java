package com.lethimyduyen.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Sp_ThitHeo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sp_thitheo);
    }
    public void BackToWelcome(View view) {
        startActivity(new Intent(Sp_ThitHeo.this, MainActivity.class));
    }
}
