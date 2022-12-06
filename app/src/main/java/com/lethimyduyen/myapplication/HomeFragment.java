package com.lethimyduyen.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.lethimyduyen.adapter.BanChayAdapter;
import com.lethimyduyen.adapter.ThitCaAdapter;
import com.lethimyduyen.model.BanChay;
import com.lethimyduyen.model.ThitCa;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    BanChayAdapter adapter;
    ArrayList<BanChay> danhsachBanChay;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_home, container, false);
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        ImageView imv1 = (ImageView)rootView.findViewById(R.id.imv_RauCu);
        ImageView imv2 = (ImageView)rootView.findViewById(R.id.imv_HaiSan);
        ImageView imv3 = (ImageView)rootView.findViewById(R.id.imv_TraiCay);
        ImageView imv4 = (ImageView)rootView.findViewById(R.id.imv_ThitCa);
        imv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),RauCuCategory.class);
                startActivity(intent);
            }
        });

        imv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),HaiSanCategory.class);
                startActivity(intent);
            }
        });

        imv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),TraiCayCategory.class);
                startActivity(intent);
            }
        });

        imv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),ThitCaCategory.class);
                startActivity(intent);
            }
        });

        //loadData Danh sach san pham ban chay
        danhsachBanChay = new ArrayList<>();
        danhsachBanChay.add( new BanChay(R.drawable.bachi, R.drawable.btn_chon_mua, "Ba chỉ heo 500g", 99000));
        danhsachBanChay.add( new BanChay(R.drawable.thanbo, R.drawable.btn_chon_mua, "Thăn bò Úc tươi hút chân không 250g", 129000));
        danhsachBanChay.add( new BanChay(R.drawable.ghe_haisan, R.drawable.btn_chon_mua, "Ghẹ xanh loại 1", 109000));
        danhsachBanChay.add( new BanChay(R.drawable.bongcaitrang, R.drawable.btn_chon_mua, "Bông cải trắng", 30000));
        danhsachBanChay.add( new BanChay(R.drawable.cahoi, R.drawable.btn_chon_mua, "Cá hồi đông lạnh cắt khúc khay 300g", 99000));
        danhsachBanChay.add( new BanChay(R.drawable.taoxanh, R.drawable.btn_chon_mua, "Táo xanh nhập khẩu", 69000));
//        danhsachBanChay.add(new BanChay(R.drawable.cahoi, R.drawable.btn_chon_mua, "Cá hồi",99000, 129000,
//                "Cá hồi được xử lý và dùng công nghệ cấp đông của nước ngoài ở nhiệt độ -40°C thật nhanh và bảo quản ở nhiệt độ -18°C. " +
//                        "Với cách xử lý này cá vẫn giữ được độ tươi, màu sắc, chất lượng của cá và bảo quản được lâu dài." ));


        adapter = new BanChayAdapter(getActivity(), R.layout.ban_chay_lst, danhsachBanChay);
        ListView lvBanChay = (ListView) rootView.findViewById(R.id.lv_BanChay);
        lvBanChay.setAdapter(adapter);
        Helper.getListViewSize(lvBanChay);
//        lvBanChay.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Intent intent = new Intent(getActivity(), ShowDetailBanChay.class);
//                startActivity(intent);
//
//                //holder.imv_HinhBanChay.getContext().startActivities(android.content.Intent[]);
//            }
//        });


        return rootView;
    }

}