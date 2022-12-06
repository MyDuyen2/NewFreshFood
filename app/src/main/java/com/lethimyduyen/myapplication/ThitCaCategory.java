package com.lethimyduyen.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.lethimyduyen.adapter.RauCuAdapter;
import com.lethimyduyen.adapter.ThitCaAdapter;
import com.lethimyduyen.model.RauCu;
import com.lethimyduyen.model.ThitCa;
import com.lethimyduyen.myapplication.databinding.ActivityThitCaCategoryBinding;

import java.util.ArrayList;

public class ThitCaCategory extends AppCompatActivity {

    ActivityThitCaCategoryBinding binding;
    ThitCaAdapter adapter;
    ArrayList<ThitCa> danhsachThitCa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_thit_ca_category);
        binding = ActivityThitCaCategoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadData();
    }

    private void loadData() {
        danhsachThitCa = new ArrayList<>();
        danhsachThitCa.add(new ThitCa(R.drawable.cahoi, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Cà hồi đông lạnh cắt lát 300g", "300g", 99000 ));
        danhsachThitCa.add(new ThitCa(R.drawable.thitbo, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Thịt bò nạc", "500g", 119000 ));
        danhsachThitCa.add(new ThitCa(R.drawable.bo, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Thăn bò Úc tươi", "250g", 129000 ));
        danhsachThitCa.add(new ThitCa(R.drawable.thitheo, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Thịt heo", "500g", 90000 ));
        danhsachThitCa.add(new ThitCa(R.drawable.duiga, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Đùi gà", "600g", 60000 ));
        danhsachThitCa.add(new ThitCa(R.drawable.canh_ga, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Cánh gà", "500g", 59000 ));
        danhsachThitCa.add(new ThitCa(R.drawable.ca_bop, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Cá bớp tươi ngon loại to", "500g", 150000 ));
        danhsachThitCa.add(new ThitCa(R.drawable.ca_dieu_hong, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Cá diêu hồng", "1kg", 80000 ));


        adapter = new ThitCaAdapter(ThitCaCategory.this, R.layout.thit_ca_lst, danhsachThitCa);
        binding.lvThitca.setAdapter(adapter);
    }

    public void BackToWelcome(View view) {
        startActivity(new Intent(ThitCaCategory.this, MainActivity.class));
    }
}