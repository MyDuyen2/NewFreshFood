package com.lethimyduyen.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.lethimyduyen.adapter.RauCuAdapter;
import com.lethimyduyen.model.RauCu;
import com.lethimyduyen.myapplication.databinding.ActivityRauCuCategoryBinding;

import java.util.ArrayList;

public class RauCuCategory extends AppCompatActivity {
     ActivityRauCuCategoryBinding binding;
     RauCuAdapter adapter;
     ArrayList<RauCu> danhsachRauCu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_rau_cu_category);
        binding = ActivityRauCuCategoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadData();
    }

    private void loadData(){
        danhsachRauCu = new ArrayList<>();
        danhsachRauCu.add(new RauCu(R.drawable.cachua, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Cà chua", "500g", 10000 ));
        danhsachRauCu.add(new RauCu(R.drawable.bap, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Bắp", "500g", 15000 ));
        danhsachRauCu.add(new RauCu(R.drawable.bongcaitrang, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Bông cải trắng", "300g", 30000 ));
        danhsachRauCu.add(new RauCu(R.drawable.bapcai, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Bắp cải", "1kg", 20000 ));
        danhsachRauCu.add(new RauCu(R.drawable.cuden, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Củ dền", "300g", 30000 ));
        danhsachRauCu.add(new RauCu(R.drawable.dualeo, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Dưa leo", "100g", 12000 ));

        adapter = new RauCuAdapter(RauCuCategory.this, R.layout.rau_cu_lst, danhsachRauCu);
        binding.lvRaucu.setAdapter(adapter);
    }

    public void BackToWelcome(View view) {
        startActivity(new Intent(RauCuCategory.this, MainActivity.class));
    }
}