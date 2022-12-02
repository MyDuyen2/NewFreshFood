package com.lethimyduyen.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class IdentifyActivity extends AppCompatActivity {
    private EditText inputCode1, inputCode2, inputCode3, inputCode4, inputCode5;
    private String verificationId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identify);

        inputCode1 = findViewById(R.id.edt_InputCode1);
        inputCode2 = findViewById(R.id.edt_InputCode2);
        inputCode3 = findViewById(R.id.edt_InputCode3);
        inputCode4 = findViewById(R.id.edt_InputCode4);
        inputCode5 = findViewById(R.id.edt_InputCode5);
        setupOTPInput();
final ProgressBar progressBar = findViewById(R.id.progressBar);
final Button btn_Tieptuc = findViewById(R.id.btn_Tieptuc);

verificationId = getIntent().getStringExtra("Mã đăng ký");


btn_Tieptuc.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        ;
        if(inputCode1.getText().toString().trim().isEmpty()
        || inputCode2.getText().toString().trim().isEmpty()
                || inputCode3.getText().toString().trim().isEmpty()
                || inputCode4.getText().toString().trim().isEmpty()
                || inputCode5.getText().toString().trim().isEmpty()) {
            Toast.makeText(IdentifyActivity.this, "Nhập mã code của bạn", Toast.LENGTH_SHORT).show();
            return;
        }
        else {
            Intent intent = new Intent(IdentifyActivity.this, MainActivity.class);
            startActivity(intent);
        }

        }

});

    }
    private void setupOTPInput(){
        inputCode1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(!s.toString().trim().isEmpty()){
                     inputCode2.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        inputCode2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(!s.toString().trim().isEmpty()){
                    inputCode3.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        inputCode3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(!s.toString().trim().isEmpty()){
                    inputCode4.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        inputCode4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(!s.toString().trim().isEmpty()){
                    inputCode5.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void txtDangNhap(View view) {
        startActivity(new Intent(IdentifyActivity.this, LoginActivity.class));
    }

    public void BackToWelcome(View view) {
        startActivity(new Intent(IdentifyActivity.this, RegisterActivity.class));
    }
    public void Tieptuc(View view) {
        startActivity(new Intent(IdentifyActivity.this, MainActivity.class));
    }

}