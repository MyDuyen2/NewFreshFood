package com.lethimyduyen.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.lethimyduyen.model.HaiSan;
import com.lethimyduyen.model.RauCu;
import com.lethimyduyen.myapplication.R;

import java.util.List;

public class HaiSanAdapter extends BaseAdapter {
    Activity activity;
    int item_layout;
    List<HaiSan> haisan;

    public HaiSanAdapter(Activity activity, int item_layout, List<HaiSan> haisan) {
        this.activity = activity;
        this.item_layout = item_layout;
        this.haisan = haisan;
    }

    @Override
    public int getCount() {
        return haisan.size();
    }

    @Override
    public Object getItem(int i) {
        return haisan.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public static class ViewHolder{
        ImageView imv_HinhHaiSan, imv_YeuThichHaiSan, imv_GioHangHaiSan;
        TextView txt_TenHaiSan, txt_KhoiLuongHaiSan, txt_GiaHaiSan;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(item_layout, null);

            holder.imv_HinhHaiSan = (ImageView) view.findViewById(R.id.imv_HinhHaiSan);
            holder.imv_YeuThichHaiSan = (ImageView) view.findViewById(R.id.imv_YeuThichHaiSan);
            holder.imv_GioHangHaiSan = (ImageView) view.findViewById(R.id.imv_GioHangHaiSan);
            holder.txt_TenHaiSan = (TextView) view.findViewById(R.id.txt_TenHaiSan);
            holder.txt_KhoiLuongHaiSan = (TextView) view.findViewById(R.id.txt_KhoiLuongHaiSan);
            holder.txt_GiaHaiSan = (TextView) view.findViewById(R.id.txt_GiaHaiSan);

            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }

        HaiSan h = haisan.get(i);
        holder.imv_HinhHaiSan.setImageResource(h.getHinhHaiSan());
        holder.imv_YeuThichHaiSan.setImageResource(h.getYeuthichHaiSan());
        holder.imv_GioHangHaiSan.setImageResource(h.getGiohangHaiSan());
        holder.txt_TenHaiSan.setText(h.getTenHaiSan());
        holder.txt_KhoiLuongHaiSan.setText(h.getKhoiluongHaiSan());
        holder.txt_GiaHaiSan.setText(String.valueOf(h.getGiaHaiSan()));
        return view;
    }
}
