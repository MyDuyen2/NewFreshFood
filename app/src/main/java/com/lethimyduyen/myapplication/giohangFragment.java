package com.lethimyduyen.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import com.lethimyduyen.adapter.SCItemAdapter;
import com.lethimyduyen.model.ShoppingCartItem;
import com.lethimyduyen.myapplication.databinding.FragmentGiohangBinding;

import java.util.ArrayList;

//public class giohangFragment extends AppCompatActivity {


   // @Override
   // public void onCreate(Bundle savedInstanceState) {
     //   super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
      //  binding = FragmentGiohangBinding.inflate(getLayoutInflater());
       // setContentView(binding.getRoot());

    //}

        public class giohangFragment extends Fragment {


            private ArrayList<ShoppingCartItem> shoppingList;
            private RecyclerView recyclerview;


            @Override
            public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            }

            @Override
            public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                     Bundle savedInstanceState) {
                // Inflate the layout for this fragment
                //return inflater.inflate(R.layout.fragment_giohang, container, false);

                View rootView = inflater.inflate(R.layout.fragment_giohang, container, false);
                Button b = (Button)rootView.findViewById(R.id.btn_Buy);
                b.setOnClickListener(new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent intent = new Intent(getActivity(), Pay.class);
                        startActivity(intent);

                    }

                });
                return rootView;

            }

            @Override
            public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
                super.onViewCreated(view, savedInstanceState);
                loadData();


                recyclerview = view.findViewById(R.id.rv_Product);
                recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
                recyclerview.setHasFixedSize(true);
                SCItemAdapter scItemAdapter = new SCItemAdapter(getContext(), shoppingList);
                recyclerview.setAdapter(scItemAdapter);
                scItemAdapter.notifyDataSetChanged();
            }



            private void loadData(){
                shoppingList = new ArrayList<>();
                shoppingList.add(new ShoppingCartItem(R.drawable.cachua, R.drawable.ic_baseline_add_24, R.drawable.ic_baseline_remove_24,
                        false, "Cà chua", "250g", 10000, 2));
                shoppingList.add(new ShoppingCartItem(R.drawable.bap, R.drawable.ic_baseline_add_24, R.drawable.ic_baseline_remove_24,
                        false, "Bắp", "500g", 15000, 1));
                shoppingList.add(new ShoppingCartItem(R.drawable.duiga, R.drawable.ic_baseline_add_24, R.drawable.ic_baseline_remove_24,
                        false, "Đùi gà", "500g", 60000, 1));
                shoppingList.add(new ShoppingCartItem(R.drawable.bongcaitrang, R.drawable.ic_baseline_add_24, R.drawable.ic_baseline_remove_24,
                        false, "Bông cải trắng", "300g", 30000, 2));
                shoppingList.add(new ShoppingCartItem(R.drawable.bapcai, R.drawable.ic_baseline_add_24, R.drawable.ic_baseline_remove_24,
                        false, "Bắp cải", "1kg", 20000, 3));
                shoppingList.add(new ShoppingCartItem(R.drawable.thitbo, R.drawable.ic_baseline_add_24, R.drawable.ic_baseline_remove_24,
                        false, "Thịt bò", "250g", 65000, 2));
                shoppingList.add(new ShoppingCartItem(R.drawable.thitheo, R.drawable.ic_baseline_add_24, R.drawable.ic_baseline_remove_24,
                        false, "Thịt heo", "500g", 90000, 1));
                shoppingList.add(new ShoppingCartItem(R.drawable.taoxanh, R.drawable.ic_baseline_add_24, R.drawable.ic_baseline_remove_24,
                        false, "Táo xanh", "500g", 35000, 1));
            }
        }

