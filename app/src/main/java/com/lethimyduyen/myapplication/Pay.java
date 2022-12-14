package com.lethimyduyen.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.lethimyduyen.myapplication.databinding.ActivityPayBinding;

public class Pay extends AppCompatActivity {

    ActivityPayBinding binding;
    //TextView pmmethod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_pay);
        binding = ActivityPayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        pmmethod = findViewById(R.id.txt_choosepmmethod);
//
//
//
//        Intent intent = getIntent();
//        String str = getIntent().getExtras().getString("checked");
//        pmmethod.setText(str);



        addEvents();
    }
    public void BackToWelcome(View view) {
        startActivity(new Intent(Pay.this, MainActivity.class));
    }
    private void addEvents() {
        binding.txtChoosepayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pay.this, Deliverymethod.class);
                startActivity(intent);
            }
        });
        binding.txtChoosepmmethod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pay.this, Choosepaymentmethod.class);
                startActivity(intent);
            }
        });
        binding.txtChoosevoucher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pay.this, Choosevoucher_Activity.class);
                startActivity(intent);
            }
        });
        binding.btnDathang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent intent = new Intent(Pay.this, HomeFragment.class);
//                startActivity(intent);

                Toast.makeText(Pay.this, "?????t h??ng th??nh c??ng", Toast.LENGTH_SHORT).show();
            }
        });
        binding.imvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Pay.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}