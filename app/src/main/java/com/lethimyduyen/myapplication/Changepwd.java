package com.lethimyduyen.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.lethimyduyen.myapplication.databinding.ActivityChangepwdBinding;

public class Changepwd extends AppCompatActivity {
    ActivityChangepwdBinding binding;
    TextInputEditText edtNhaplai, edtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_changepwd);
        binding =ActivityChangepwdBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        edtPass = findViewById(R.id.txt_Matkhau);
        edtNhaplai =findViewById(R.id.txt_Nhaplai);

        addEvents();
    }

    private void addEvents() {
        binding.btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Changepwd.this, Forgottenpwd.class);
                startActivity(intent);
            }
        });
    }

    public void Continue(View view) {
        if (edtPass.getText().toString().trim().isEmpty()
                || edtNhaplai.getText().toString().trim().isEmpty()) {
            Toast.makeText(Changepwd.this, "Vui lòng điền mật khẩu mới", Toast.LENGTH_SHORT).show();
            return;
        } else {
            Intent intent = new Intent(Changepwd.this,MainActivity.class);
            startActivity(intent);
        }
    }
}