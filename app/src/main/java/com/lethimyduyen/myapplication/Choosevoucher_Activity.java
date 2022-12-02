package com.lethimyduyen.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.lethimyduyen.myapplication.databinding.ActivityChoosevoucherBinding;

public class Choosevoucher_Activity extends AppCompatActivity {
    ActivityChoosevoucherBinding binding;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_choosevoucher);
        binding = ActivityChoosevoucherBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        addEvents();
    }

    private void addEvents() {
        binding.imvback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Choosevoucher_Activity.this, Pay.class);
                startActivity(intent);
            }
        });
    }
}