package com.lethimyduyen.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.lethimyduyen.model.BanChay;
import com.lethimyduyen.myapplication.R;

import java.util.List;

public class BanChayAdapter extends BaseAdapter {

    Activity activity;
    int item_layout;
    List<BanChay> banchay;

    public BanChayAdapter(Activity activity, int item_layout, List<BanChay> banchay) {
        this.activity = activity;
        this.item_layout = item_layout;
        this.banchay = banchay;
    }

    @Override
    public int getCount() {
        return banchay.size();
    }

    @Override
    public Object getItem(int i) {
        return banchay.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public static class ViewHolder{
        ImageView imv_HinhBanChay, imv_NutChonMua;
        TextView txt_TenBanChay, txt_GiaBanChay;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(item_layout, null);

            holder.imv_HinhBanChay = (ImageView) view.findViewById(R.id.imv_HinhBanChay);
            holder.imv_NutChonMua = (ImageView) view.findViewById(R.id.imv_NutChonMua);
            holder.txt_TenBanChay = (TextView) view.findViewById(R.id.txt_TenBanChay);
            holder.txt_GiaBanChay = (TextView) view.findViewById(R.id.txt_GiaBanChay);

            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }

        BanChay b = banchay.get(i);
        holder.imv_HinhBanChay.setImageResource(b.getHinhBanChay());
        holder.imv_NutChonMua.setImageResource(b.getNutChonMua());
        holder.txt_TenBanChay.setText(b.getTenBanChay());
        holder.txt_GiaBanChay.setText(String.valueOf(b.getGiaBanChay()));

        return view;
    }
}
