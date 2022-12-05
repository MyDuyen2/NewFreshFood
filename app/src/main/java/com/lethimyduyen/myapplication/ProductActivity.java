package com.lethimyduyen.myapplication;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.lethimyduyen.adapter.ProductAdapter;
import com.lethimyduyen.model.Products;
import com.lethimyduyen.model.ShoppingCartItem;
import com.lethimyduyen.model.ThitCa;

import java.util.ArrayList;
import java.util.List;

public class ProductActivity extends AppCompatActivity {

    private RecyclerView rcvProduct;
    private ProductAdapter productAdapter;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.product_list);

        rcvProduct = findViewById(R.id.rcv_product);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvProduct.setLayoutManager(linearLayoutManager);

        productAdapter = new ProductAdapter(getListProduct());
        rcvProduct.setAdapter(productAdapter);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        rcvProduct.addItemDecoration(itemDecoration);
    }

    private List<Products> getListProduct() {
        List<Products> list = new ArrayList<>();
        list.add(new Products(R.drawable.cachua, "Cà chua", "250g", "10000"));
        list.add(new Products(R.drawable.bapcai, "Bắp cải", "1kg", "20000"));
        list.add(new Products(R.drawable.bap, "Bắp", "500g", "15000"));
        list.add(new Products(R.drawable.duiga, "Đùi gà", "500g", "60000"));
        list.add(new Products(R.drawable.bongcaitrang, "Bông cải trắng", "300g", "30000"));
        list.add(new Products(R.drawable.thitbo, "Thịt bò", "250g", "65000"));
        list.add(new Products(R.drawable.thitheo, "Thịt heo", "500g", "90000"));
        list.add(new Products(R.drawable.taoxanh, "Táo xanh", "500g", "35000"));
        list.add(new Products(R.drawable.cahoi, "Cà hồi đông lạnh cắt lát 300g", "300g", "99000" ));
       list.add(new Products(R.drawable.thitbo, "Thịt bò nạc", "500g", "119000" ));
        list.add(new Products(R.drawable.bo, "Thăn bò Úc tươi", "250g", "129000" ));
        list.add(new Products(R.drawable.thitheo, "Thịt heo", "500g", "90000" ));
        list.add(new Products(R.drawable.canh_ga, "Cánh gà", "500g", "59000" ));
        list.add(new Products(R.drawable.ca_bop, "Cá bớp tươi ngon loại to", "500g", "150000" ));
       list.add(new Products(R.drawable.ca_dieu_hong, "Cá diêu hồng", "1kg", "80000" ));
        list.add(new Products(R.drawable.cuden, "Củ dền", "300g", "30000" ));
        list.add(new Products(R.drawable.dualeo, "Dưa leo", "100g", "12000"));


        return list;
    }

//    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);

        SearchManager searchManager = (SearchManager)  getSystemService(Context.SEARCH_SERVICE);
         searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
         searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
         searchView.setMaxWidth(Integer.MAX_VALUE);

         searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
             @Override
             public boolean onQueryTextSubmit(String s) {
                 productAdapter.getFilter().filter(s);
                 return false;
             }

             @Override
             public boolean onQueryTextChange(String s) {
                 productAdapter.getFilter().filter(s);
                 return false;
             }
         });
return true;
    }

    @Override
    public void onBackPressed() {
        if (!searchView.isIconified()){
            searchView.setIconified(true);
            return;
        }
        super.onBackPressed();
    }
}
