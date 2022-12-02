package com.lethimyduyen.myapplication;

import static com.lethimyduyen.myapplication.R.id.txt_chinhsua;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;




public class YethichFragment extends Fragment {

    //FragmentYethichBinding binding;
//    Button txtChinhsua;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//
//        return inflater.inflate(R.layout.fragment_yethich, container, false);

        //binding = FragmentYethichBinding.inflate(getLayoutInflater());
        View rootview = inflater.inflate(R.layout.fragment_yethich, container, false);
        Button txtchinhsua = rootview.findViewById(R.id.txt_chinhsua);


        txtchinhsua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Edit();
            }
        });


        return rootview;
    }

    public void Edit(){
        Intent intent = new Intent(getActivity(), EditYeuThichActivity.class);
        startActivity(intent);
    }


}
