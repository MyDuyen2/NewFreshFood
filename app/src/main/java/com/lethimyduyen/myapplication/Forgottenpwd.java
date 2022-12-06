package com.lethimyduyen.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Forgottenpwd extends AppCompatActivity {
   // ActivityForgottenpwdBinding binding;
    Button btnContinue;
    EditText edtEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgottenpwd);


        btnContinue = findViewById(R.id.btn_Continue);
        edtEmail = findViewById(R.id.edt_Email);

//        binding = ActivityForgottenpwdBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());

        addEvents();

    }

    private void addEvents() {
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtEmail.getText().toString().trim().isEmpty()) {
                    Toast.makeText(Forgottenpwd.this, "Điền email để tiếp tục", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    Intent intent = new Intent(Forgottenpwd.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        });




    }

    public void login(View view) {
        Intent intent = new Intent(Forgottenpwd.this, LoginActivity.class);
        startActivity(intent);
    }

    public void BackToWelcome(View view) {
        Intent intent = new Intent(Forgottenpwd.this, LoginActivity.class);
        startActivity(intent);
    }
}