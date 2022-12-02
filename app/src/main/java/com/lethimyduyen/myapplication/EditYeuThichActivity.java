package com.lethimyduyen.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EditYeuThichActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_yeu_thich);
    }
    public void Hoantat(View view) {
        startActivity(new Intent(EditYeuThichActivity.this, Hoantatyeuthich_Activity.class));
    }
}