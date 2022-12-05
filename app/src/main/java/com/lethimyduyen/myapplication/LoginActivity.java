package com.lethimyduyen.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {
   Button btnLogin;
   TextInputEditText edtEmail, edtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

      btnLogin = findViewById(R.id.btn_Login);
     edtEmail = findViewById(R.id.email_txt);
     edtPass =findViewById(R.id.password_txt);
        //click login
       btnLogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if (edtEmail.getText().toString().trim().isEmpty()
                       || edtPass.getText().toString().trim().isEmpty()) {
                   Toast.makeText(LoginActivity.this, "Điền thông tin để đăng nhập", Toast.LENGTH_SHORT).show();
                   return;
               } else {
                   Intent intent = new Intent(LoginActivity.this,  MainActivity.class);
                   startActivity(intent);
               }
           }
      });
   }


    public void BackToWelcome(View view) {
        startActivity(new Intent(LoginActivity.this, FirtActivity.class));
    }

    public void txtDangKy(View view) {
        startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
    }


    public void forgotpass(View view) {
        startActivity(new Intent(LoginActivity.this, Forgottenpwd.class));
    }
}