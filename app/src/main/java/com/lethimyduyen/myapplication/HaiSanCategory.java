package com.lethimyduyen.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.lethimyduyen.adapter.HaiSanAdapter;
import com.lethimyduyen.adapter.RauCuAdapter;
import com.lethimyduyen.model.HaiSan;
import com.lethimyduyen.model.RauCu;
import com.lethimyduyen.myapplication.databinding.ActivityHaiSanCategoryBinding;

import java.util.ArrayList;

public class HaiSanCategory extends AppCompatActivity {

    ActivityHaiSanCategoryBinding binding;
    HaiSanAdapter adapter;
    ArrayList<HaiSan> danhsachHaiSan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_hai_san_category);
         binding = ActivityHaiSanCategoryBinding.inflate(getLayoutInflater());
         setContentView(binding.getRoot());
         loadData();
    }

    private void loadData(){
        danhsachHaiSan = new ArrayList<>();
        danhsachHaiSan.add(new HaiSan(R.drawable.cahoi, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Cá hồi đông lạnh cắt khúc 300g", "300g", 99000 ));
        danhsachHaiSan.add(new HaiSan(R.drawable.ghe_haisan, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Ghẹ xanh loại 1", "200g", 109000 ));
        danhsachHaiSan.add(new HaiSan(R.drawable.tom_haisan, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Tôm sú", "1kg", 390000 ));
        danhsachHaiSan.add(new HaiSan(R.drawable.muc_haisan, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Mực ống", "1kg", 249000 ));
        danhsachHaiSan.add(new HaiSan(R.drawable.ngheu_bien, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Ngêu biển", "500g", 79000 ));
        danhsachHaiSan.add(new HaiSan(R.drawable.bach_tuoc_haisan, R.drawable.ic_baseline_favorite_border_24, R.drawable.ic_baseline_shopping_cart_24,
                "Bạch tuộc biển baby", "200g", 89000 ));

        adapter = new HaiSanAdapter(HaiSanCategory.this, R.layout.hai_san_lst, danhsachHaiSan);
        binding.lvHaisan.setAdapter(adapter);
    }

    public void BackToWelcome(View view) {
        startActivity(new Intent(HaiSanCategory.this, MainActivity.class));
    }
}