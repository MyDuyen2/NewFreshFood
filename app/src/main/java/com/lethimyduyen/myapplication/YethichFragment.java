package com.lethimyduyen.myapplication;

import static com.lethimyduyen.myapplication.R.id.btn_chinhsua;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.lethimyduyen.myapplication.databinding.FragmentYethichBinding;


public class YethichFragment extends Fragment {

    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//
//        return inflater.inflate(R.layout.fragment_yethich, container, false);

        View rootView = inflater.inflate(R.layout.fragment_yethich, container, false);
     Button b = (Button)rootView.findViewById(R.id.btn_chinhsua);
        b.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(getActivity(), EditYeuThichActivity.class);
                startActivity(intent);

            }

        });
        return rootView;
    }

}

