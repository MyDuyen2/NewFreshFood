package com.lethimyduyen.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class HomeFragment extends Fragment {

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
        return rootView;
    }

}