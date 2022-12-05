package com.lethimyduyen.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lethimyduyen.model.Products;
import com.lethimyduyen.myapplication.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> implements Filterable {

    private List<Products> mListProducts;
    private List<Products> mListProductsOld;

    public ProductAdapter(List<Products> mListProducts) {
        this.mListProducts = mListProducts;
        this.mListProductsOld = mListProducts;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {

        Products products = mListProducts.get(position);
        if (products == null) {
            return;
        }
        holder.imgProduct.setImageResource(products.getImage());
        holder.txtName.setText(products.getName());
        holder.txtMass.setText(products.getMass());
        holder.txtPrice.setText(products.getPrice());

    }

    @Override
    public int getItemCount() {
        if (mListProducts != null) {
            return mListProducts.size();
        }
        return 0;
    }


    public class ProductViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgProduct;
        private TextView txtName;
        private TextView txtMass;
        private TextView txtPrice;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProduct = itemView.findViewById(R.id.imv_Product);
            txtName = itemView.findViewById(R.id.txt_Name);
            txtMass = itemView.findViewById(R.id.txt_Mass);
            txtPrice = itemView.findViewById(R.id.txt_Price);
        }
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String strSearch = charSequence.toString();
                if (strSearch.isEmpty()) {
                    mListProducts = mListProductsOld;
                }else {
                    List<Products>list = new ArrayList<>();
                    for (Products products : mListProductsOld){
                        if (products.getName().toLowerCase().contains(strSearch.toLowerCase())) {
                            list.add(products);
                        }
                    }

                   mListProducts = list;
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = mListProducts;

                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                mListProducts = (List<Products>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }
}