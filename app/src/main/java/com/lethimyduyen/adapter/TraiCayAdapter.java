package com.lethimyduyen.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.lethimyduyen.model.RauCu;
import com.lethimyduyen.model.TraiCay;
import com.lethimyduyen.myapplication.R;

import java.util.List;

public class TraiCayAdapter extends BaseAdapter {
    Activity activity;
    int item_layout;
    List<TraiCay> traicay;

    public TraiCayAdapter(Activity activity, int item_layout, List<TraiCay> traicay) {
        this.activity = activity;
        this.item_layout = item_layout;
        this.traicay = traicay;
    }

    @Override
    public int getCount() {
        return traicay.size();
    }

    @Override
    public Object getItem(int i) {
        return traicay.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public static class ViewHolder{
        ImageView imv_HinhTraiCay, imv_YeuThichTraiCay, imv_GioHangTraiCay;
        TextView txt_TenTraiCay, txt_KhoiLuongTraiCay, txt_GiaTraiCay;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(item_layout, null);

            holder.imv_HinhTraiCay = (ImageView) view.findViewById(R.id.imv_HinhTraiCay);
            holder.imv_YeuThichTraiCay = (ImageView) view.findViewById(R.id.imv_YeuThichTraiCay);
            holder.imv_GioHangTraiCay = (ImageView) view.findViewById(R.id.imv_GioHangTraiCay);
            holder.txt_TenTraiCay = (TextView) view.findViewById(R.id.txt_TenTraiCay);
            holder.txt_KhoiLuongTraiCay = (TextView) view.findViewById(R.id.txt_KhoiLuongTraiCay);
            holder.txt_GiaTraiCay = (TextView) view.findViewById(R.id.txt_GiaTraiCay);

            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }

        TraiCay tr = traicay.get(i);
        holder.imv_HinhTraiCay.setImageResource(tr.getHinhTraiCay());
        holder.imv_YeuThichTraiCay.setImageResource(tr.getYeuthichTraiCay());
        holder.imv_GioHangTraiCay.setImageResource(tr.getGiohangTraiCay());
        holder.txt_TenTraiCay.setText(tr.getTenTraiCay());
        holder.txt_KhoiLuongTraiCay.setText(tr.getKhoiluongTraiCay());
        holder.txt_GiaTraiCay.setText(String.valueOf(tr.getGiaTraiCay()));
        return view;
    }
}
