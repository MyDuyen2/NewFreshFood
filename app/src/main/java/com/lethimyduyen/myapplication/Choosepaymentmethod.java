package com.lethimyduyen.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.lethimyduyen.myapplication.databinding.ActivityChoosepaymentmethodBinding;

public class Choosepaymentmethod extends AppCompatActivity {
    ActivityChoosepaymentmethodBinding binding;
    Intent intent;
    RadioButton rdbCash, rdbBank, rdbZaloPay, rdbMomo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_choosepaymentmethod);
        binding = ActivityChoosepaymentmethodBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



//        rdbCash = findViewById(R.id.rdbCash);
//        rdbBank = findViewById(R.id.rdbBank);
//        rdbZaloPay = findViewById(R.id.rdbZalopay);
//        rdbMomo = findViewById(R.id.rdbMomo);
//
//        rdbCash.setOnCheckedChangeListener(listenerRadio);

        addEvents();
    }

    private void addEvents() {
        binding.imvback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Choosepaymentmethod.this, Pay.class);
                startActivity(intent);
            }
        });
        binding.btnConfirm.setOnClickListener(new View.OnClickListener() {
            RadioGroup group = findViewById(R.id.rdgpaymentmethod);
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Choosepaymentmethod.this, Pay.class);

                int idChecked = group.getCheckedRadioButtonId();
                switch(idChecked){
                    case R.id.rdbCash:
                        break;
                    case R.id.rdbBank:
                        break;
                    case R.id.rdbZalopay:
                        break;
                    case R.id.rdbMomo:
                        break;
                }
                startActivity(intent);
            }
        });
    }
}