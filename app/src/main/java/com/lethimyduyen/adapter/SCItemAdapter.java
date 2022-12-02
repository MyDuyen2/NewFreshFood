package com.lethimyduyen.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lethimyduyen.model.ShoppingCartItem;
import com.lethimyduyen.myapplication.R;
import com.lethimyduyen.myapplication.giohangFragment;

import java.util.ArrayList;
import java.util.List;

public class SCItemAdapter extends RecyclerView.Adapter<SCItemAdapter.MyViewHolder> {

    Context context;
    ArrayList<ShoppingCartItem> shoppingItems;
    public SCItemAdapter( Context context, ArrayList<ShoppingCartItem> shoppingItems) {
        this.context = context;
        this.shoppingItems = shoppingItems;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.shoppingitems_lst, parent, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ShoppingCartItem s = shoppingItems.get(position);
        holder.chb_Item.setChecked(s.getProductCheck());
        holder.imv_Product.setImageResource(s.getProductThumb());
        holder.imv_Increase.setImageResource(s.getProductIncrease());
        holder.imv_Decrease.setImageResource(s.getProductDecrease());
        holder.txt_ProductName.setText(s.getProductName());
        holder.txt_ProductMass.setText(s.getProductMass());
        holder.txt_ProductPrice.setText(String.valueOf(s.getProductPrice()));
        holder.txt_ProductNumb.setText(String.valueOf(s.getProductNumb()));

    }

    @Override
    public int getItemCount() {
        return shoppingItems.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        CheckBox chb_Item;
        ImageView imv_Product, imv_Increase, imv_Decrease;
        TextView txt_ProductName, txt_ProductMass, txt_ProductPrice, txt_ProductNumb;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            chb_Item = itemView.findViewById(R.id.chb_Item);
            imv_Product = itemView.findViewById(R.id.imv_Product);
            imv_Increase = itemView.findViewById(R.id.imv_Increase);
            imv_Decrease = itemView.findViewById(R.id.imv_Decrease);
            txt_ProductName = itemView.findViewById(R.id.txt_ProductName);
            txt_ProductMass = itemView.findViewById(R.id.txt_ProductMass);
            txt_ProductPrice = itemView.findViewById(R.id.txt_ProductPrice);
            txt_ProductNumb = itemView.findViewById(R.id.txt_ProductNumb);
        }
    }


}
