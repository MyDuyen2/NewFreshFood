package com.lethimyduyen.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class RegisterActivity extends AppCompatActivity {
  TextInputEditText edtEmail, edtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        edtEmail = findViewById(R.id.email_txt);
        edtPass =findViewById(R.id.password_txt);
        final Button btn_Register = findViewById(R.id.btn_Register);
        btn_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ;
                if(edtEmail.getText().toString().trim().isEmpty()
                        || edtPass.getText().toString().trim().isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "Điền thông tin để đăng ký", Toast.LENGTH_SHORT).show();
                    return;
                }
                else {
                    Intent intent = new Intent(RegisterActivity.this, IdentifyActivity.class);
                    startActivity(intent);
                }
            }
        });

    }

//    public void register(View view) {
//        startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
//    }

    public void BackToWelcome(View view) {
        startActivity(new Intent(RegisterActivity.this, FirtActivity.class));
    }

    public void txtDangNhap(View view) {
        startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
    }
    public void register(View view) {
        startActivity (new Intent(RegisterActivity.this, IdentifyActivity.class));
    }
}