package com.lethimyduyen.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.lethimyduyen.model.RauCu;
import com.lethimyduyen.model.ThitCa;
import com.lethimyduyen.myapplication.R;

import java.util.List;

public class ThitCaAdapter extends BaseAdapter {
    Activity activity;
    int item_layout;
    List<ThitCa> thitca;

    public ThitCaAdapter(Activity activity, int item_layout, List<ThitCa> thitca) {
        this.activity = activity;
        this.item_layout = item_layout;
        this.thitca = thitca;
    }

    @Override
    public int getCount() {
        return thitca.size();
    }

    @Override
    public Object getItem(int i) {
        return thitca.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public static class ViewHolder{
        ImageView imv_HinhThitCa, imv_YeuThichThitCa, imv_GioHangThitCa;
        TextView txt_TenThitCa, txt_KhoiLuongThitCa, txt_GiaThitCa;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(item_layout, null);

            holder.imv_HinhThitCa = (ImageView) view.findViewById(R.id.imv_HinhThitCa);
            holder.imv_YeuThichThitCa = (ImageView) view.findViewById(R.id.imv_YeuThichThitCa);
            holder.imv_GioHangThitCa = (ImageView) view.findViewById(R.id.imv_GioHangThitCa);
            holder.txt_TenThitCa = (TextView) view.findViewById(R.id.txt_TenThitCa);
            holder.txt_KhoiLuongThitCa = (TextView) view.findViewById(R.id.txt_KhoiLuongThitCa);
            holder.txt_GiaThitCa = (TextView) view.findViewById(R.id.txt_GiaThitCa);

            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }

        ThitCa th = thitca.get(i);
        holder.imv_HinhThitCa.setImageResource(th.getHinhThitCa());
        holder.imv_YeuThichThitCa.setImageResource(th.getYeuthichThitCa());
        holder.imv_GioHangThitCa.setImageResource(th.getGiohangThitCa());
        holder.txt_TenThitCa.setText(th.getTenThitCa());
        holder.txt_KhoiLuongThitCa.setText(th.getKhoiluongThitCa());
        holder.txt_GiaThitCa.setText(String.valueOf(th.getGiaThitCa()));
        return view;
    }
}
