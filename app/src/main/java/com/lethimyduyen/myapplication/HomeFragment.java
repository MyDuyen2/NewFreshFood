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
    ListView listView;

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
        danhsachBanChay.add( new BanChay(R.drawable.bachi, R.drawable.btn_chon_mua, "Ba ch??? heo 500g", 99000));
        danhsachBanChay.add( new BanChay(R.drawable.thanbo, R.drawable.btn_chon_mua, "Th??n b?? ??c t????i h??t ch??n kh??ng 250g", 129000));
        danhsachBanChay.add( new BanChay(R.drawable.cahoi, R.drawable.btn_chon_mua, "C?? h???i ????ng l???nh c???tkh??c khay 300g", 99000));
        danhsachBanChay.add( new BanChay(R.drawable.saurieng, R.drawable.btn_chon_mua, "C??m s???u ri??ng Ri 6 Foodmap", 99000));
        danhsachBanChay.add( new BanChay(R.drawable.bongcaitrang, R.drawable.btn_chon_mua, "B??ng c???i tr???ng", 99000));
        danhsachBanChay.add( new BanChay(R.drawable.taoxanh, R.drawable.btn_chon_mua, "T??o xanh nh???p kh???u", 69000));

        adapter = new BanChayAdapter(getActivity(), R.layout.ban_chay_lst, danhsachBanChay);
        ListView lvBanChay = (ListView) rootView.findViewById(R.id.lv_BanChay);
        lvBanChay.setAdapter(adapter);
        Helper.getListViewSize(lvBanChay);

        lvBanChay.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    startActivity(new Intent(getActivity(), Sp_ThitHeo.class));
                }else if(i == 1){
                    startActivity(new Intent(getActivity(), Sp_ThitBo.class));

                }else if(i == 2) {
                    startActivity(new Intent(getActivity(), Sp_CaHoi.class));
                }else if(i == 3) {
                    startActivity(new Intent(getActivity(), Sp_SauRieng.class));
                }else if(i == 4) {
                    startActivity(new Intent(getActivity(), BongCaiTrang.class));
                }else if(i == 5) {
                    startActivity(new Intent(getActivity(), SP_TaoXanh.class));

                }

            }
        });
        return rootView;
    }

}