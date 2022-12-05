package com.lethimyduyen.adapter;

import android.app.Activity;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.lethimyduyen.model.BanChay;
import com.lethimyduyen.model.YeuThich;
import com.lethimyduyen.myapplication.LoginActivity;
import com.lethimyduyen.myapplication.R;
import com.lethimyduyen.myapplication.YethichFragment;

import java.util.List;

public class YeuThichAdapter extends BaseAdapter {

    Activity activity;
    int item_layout;
    List<YeuThich> yeuthich;

    public YeuThichAdapter(Activity activity, int item_layout, List<YeuThich> yeuthich) {
        this.activity = activity;
        this.item_layout = item_layout;
        this.yeuthich = yeuthich;
    }

    @Override
    public int getCount() {
        return yeuthich.size();
    }

    @Override
    public Object getItem(int i) {
        return yeuthich.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    public static class ViewHolder{
        ImageView imv_hinhYt, imv_chonmua, delete;
        TextView txt_TenYt, txt_giaYt,txt_massYt;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

    ViewHolder holder;
        if (view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(item_layout, null);

            holder.imv_hinhYt = (ImageView) view.findViewById(R.id.imv_hinhyeuthich);
            holder.imv_chonmua = (ImageView) view.findViewById(R.id.imv_chonmua);
            holder.delete = (ImageView) view.findViewById(R.id.mv_delete);
            holder.txt_TenYt = (TextView) view.findViewById(R.id.txt_tenYt);
            holder.txt_giaYt = (TextView) view.findViewById(R.id.txt_giaYt);
            holder.txt_massYt = (TextView) view.findViewById(R.id.txt_massYt);

            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }

        YeuThich b = yeuthich.get(i);
        holder.imv_hinhYt.setImageResource(b.getHinhYt());
        holder.imv_chonmua.setImageResource(b.getChonmua());
        holder.delete.setImageResource(b.getDelete());
        holder.txt_TenYt.setText(b.getTenYt());
        holder.txt_giaYt.setText(String.valueOf(b.getGiaYt()));
        holder.txt_massYt.setText(b.getMassYt());

        ImageView delete = (ImageView) view.findViewById(R.id.mv_delete);
        delete.setTag(i);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer index = (Integer) view.getTag();
                yeuthich.remove(index.intValue());
                notifyDataSetChanged();
                Toast.makeText(activity.getApplicationContext(),
                        "Bạn đã xóa một sản phẩm",
                        Toast.LENGTH_LONG).show();
            }
        });


        return view;
    }
}