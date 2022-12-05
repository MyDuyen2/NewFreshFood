package com.lethimyduyen.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.lethimyduyen.myapplication.databinding.ActivityDeliverymethodBinding;

public class Deliverymethod extends AppCompatActivity {
    ActivityDeliverymethodBinding binding;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_deliverymethod);
        binding = ActivityDeliverymethodBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        addEvents();
    }

    private void addEvents() {
        binding.imvback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Deliverymethod.this, Pay.class);
                startActivity(intent);
            }
        });
        binding.btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Deliverymethod.this, Pay.class);
                startActivity(intent);
            }
        });
        binding.lnGhtc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Deliverymethod.this, Pay.class);
                startActivity(intent);
            }
        });
    }
}