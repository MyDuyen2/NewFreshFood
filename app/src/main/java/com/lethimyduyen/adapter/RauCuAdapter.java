package com.lethimyduyen.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.lethimyduyen.model.RauCu;
import com.lethimyduyen.myapplication.R;

import java.util.List;

public class RauCuAdapter extends BaseAdapter {
    Activity activity;
    int item_layout;
    List<RauCu> raucu;

    public RauCuAdapter(Activity activity, int item_layout, List<RauCu> raucu) {
        this.activity = activity;
        this.item_layout = item_layout;
        this.raucu = raucu;
    }

    @Override
    public int getCount() {
        return raucu.size();
    }

    @Override
    public Object getItem(int i) {
        return raucu.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public static class ViewHolder{
        ImageView imv_HinhRauCu, imv_YeuThichRauCu, imv_GioHangRauCu;
        TextView txt_TenRauCu, txt_KhoiLuongRauCu, txt_GiaRauCu;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(item_layout, null);

            holder.imv_HinhRauCu = (ImageView) view.findViewById(R.id.imv_HinhRauCu);
            holder.imv_YeuThichRauCu = (ImageView) view.findViewById(R.id.imv_YeuThichRauCu);
            holder.imv_GioHangRauCu = (ImageView) view.findViewById(R.id.imv_GioHangRauCu);
            holder.txt_TenRauCu = (TextView) view.findViewById(R.id.txt_TenRauCu);
            holder.txt_KhoiLuongRauCu = (TextView) view.findViewById(R.id.txt_KhoiLuongRauCu);
            holder.txt_GiaRauCu = (TextView) view.findViewById(R.id.txt_GiaRauCu);

            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }

        RauCu r = raucu.get(i);
        holder.imv_HinhRauCu.setImageResource(r.getHinhRauCu());
        holder.imv_YeuThichRauCu.setImageResource(r.getYeuthichRauCu());
        holder.imv_GioHangRauCu.setImageResource(r.getGiohangRauCu());
        holder.txt_TenRauCu.setText(r.getTenRauCu());
        holder.txt_KhoiLuongRauCu.setText(r.getKhoiluongRauCu());
        holder.txt_GiaRauCu.setText(String.valueOf(r.getGiaRauCu()));
        return view;
    }
}
