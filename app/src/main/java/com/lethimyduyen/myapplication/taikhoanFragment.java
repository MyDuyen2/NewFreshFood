package com.lethimyduyen.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class taikhoanFragment extends Fragment {


//
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_taikhoan, container, false);
        Button button = (Button) rootView.findViewById(R.id.btn_thongtin);
        Button button1 = (Button) rootView.findViewById(R.id.btn_Logout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),thongtincanhan.class);
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),FirtActivity.class);
                startActivity(intent);
                Toast.makeText(getActivity(), "Bạn đã đăng xuất",Toast.LENGTH_SHORT).show();



            }
        });
        return rootView;
    }

}