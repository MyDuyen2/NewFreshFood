package com.lethimyduyen.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lethimyduyen.adapter.RauCuAdapter;
import com.lethimyduyen.adapter.TraiCayAdapter;
import com.lethimyduyen.model.RauCu;
import com.lethimyduyen.model.TraiCay;
import com.lethimyduyen.myapplication.databinding.ActivityTraiCayCategoryBinding;

import java.util.ArrayList;

public class TraiCayCategory extends AppCompatActivity {

    ActivityTraiCayCategoryBinding binding;
    TraiCayAdapter adapter;
    ArrayList<TraiCay> danhsachTraiCay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_trai_cay_category);
        binding = ActivityTraiCayCategoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadData();
    }

    private void loadData() {
        danhsachTraiCay = new ArrayList<>();
        danhsachTraiCay.add(new TraiCay(R.drawable.taoxanh, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Táo xanh nhập khẩu", "1kg", 69000 ));
        danhsachTraiCay.add(new TraiCay(R.drawable.trai_cay_1, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Chôm chôm", "500g", 15000 ));
        danhsachTraiCay.add(new TraiCay(R.drawable.trai_cay_2, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Xoài cát Hòa Lộc", "300g", 30000 ));
        danhsachTraiCay.add(new TraiCay(R.drawable.trai_cay_3, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Nhãn xuồng Thái", "1kg", 40000 ));
        danhsachTraiCay.add(new TraiCay(R.drawable.trai_cay_4, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Mãng cầu", "300g", 20000 ));
        danhsachTraiCay.add(new TraiCay(R.drawable.trai_cay_5, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Cam ruột đỏ cara Mỹ", "1kg", 249000 ));
        danhsachTraiCay.add(new TraiCay(R.drawable.trai_cay_6, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Sapoche", "300g", 25000 ));

        adapter = new TraiCayAdapter(TraiCayCategory.this, R.layout.trai_cay_lst, danhsachTraiCay);
        binding.lvTraicay.setAdapter(adapter);
    }
}