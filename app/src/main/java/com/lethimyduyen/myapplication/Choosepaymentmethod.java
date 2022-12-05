package com.lethimyduyen.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.lethimyduyen.myapplication.databinding.ActivityChoosepaymentmethodBinding;

public class Choosepaymentmethod extends AppCompatActivity {
    //ActivityChoosepaymentmethodBinding binding;

    RadioButton radioButton;
    RadioGroup radioGroup;
    ImageView imvback;
    Button btnConfirm;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosepaymentmethod);
        //binding = ActivityChoosepaymentmethodBinding.inflate(getLayoutInflater());
        //setContentView(binding.getRoot());

        imvback = findViewById(R.id.imvback);
        btnConfirm = findViewById(R.id.btn_Confirm);
        radioGroup = findViewById(R.id.rdgpaymentmethod);




//        rdbCash = findViewById(R.id.rdbCash);
//        rdbBank = findViewById(R.id.rdbBank);
//        rdbZaloPay = findViewById(R.id.rdbZalopay);
//        rdbMomo = findViewById(R.id.rdbMomo);
//
//        rdbCash.setOnCheckedChangeListener(listenerRadio);


        addEvents();
    }
    public void checkButton(View view){
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        Toast.makeText(Choosepaymentmethod.this, "Bạn đã chọn" + radioButton.getText(), Toast.LENGTH_SHORT).show();

    }

    private void addEvents() {
        imvback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Choosepaymentmethod.this, Pay.class);
                startActivity(intent);
            }
        });
        btnConfirm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Choosepaymentmethod.this, Pay.class);

                startActivity(intent);
            }
        });
    }
}