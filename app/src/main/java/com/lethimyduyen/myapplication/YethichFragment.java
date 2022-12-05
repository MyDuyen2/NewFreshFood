package com.lethimyduyen.myapplication;



import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.lethimyduyen.adapter.BanChayAdapter;
import com.lethimyduyen.adapter.YeuThichAdapter;
import com.lethimyduyen.model.BanChay;
import com.lethimyduyen.model.YeuThich;


import java.util.ArrayList;


public class YethichFragment extends Fragment {

    YeuThichAdapter adapter;
    ArrayList<YeuThich> danhsachYeuthich;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//
//        return inflater.inflate(R.layout.fragment_yethich, container, false);

        View rootView = inflater.inflate(R.layout.fragment_yethich, container, false);
        ImageView back = (ImageView)rootView.findViewById(R.id.mv_back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });


        //loadData Danh sach san pham yeu thich
        danhsachYeuthich = new ArrayList<>();
        danhsachYeuthich.add( new YeuThich(R.drawable.bachi, R.drawable.btn_chon_mua, R.drawable.ic_baseline_delete_24,"Ba chỉ ","500g", 99000));
        danhsachYeuthich.add( new YeuThich(R.drawable.thanbo, R.drawable.btn_chon_mua, R.drawable.ic_baseline_delete_24,"Thăn bò ", "500g",129000));
        danhsachYeuthich.add( new YeuThich(R.drawable.ghe_haisan, R.drawable.btn_chon_mua,R.drawable.ic_baseline_delete_24, "Ghẹ xanh","1kg", 109000));
        danhsachYeuthich.add( new YeuThich(R.drawable.bongcaitrang, R.drawable.btn_chon_mua, R.drawable.ic_baseline_delete_24,"Bông cải", "500g",30000));
        danhsachYeuthich.add( new YeuThich(R.drawable.cahoi, R.drawable.btn_chon_mua, R.drawable.ic_baseline_delete_24,"Cá hồi ","300g", 99000));
        danhsachYeuthich.add( new YeuThich(R.drawable.taoxanh, R.drawable.btn_chon_mua,R.drawable.ic_baseline_delete_24, "Táo xanh ","500", 69000));

        adapter = new YeuThichAdapter(getActivity(), R.layout.yeuthich_list, danhsachYeuthich);
        ListView lvyeuthich = (ListView) rootView.findViewById(R.id.lv_yeuthich);
        lvyeuthich.setAdapter(adapter);

        return rootView;
    }

}
