package com.example.assignment_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ProductAdapter.IOnClickItem {

    List<Product> listProduct = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        ProductAdapter adapter = new ProductAdapter(this,listProduct,this);

        GridLayoutManager layoutManager = new GridLayoutManager(this,2);

        RecyclerView rvProduct = (RecyclerView) findViewById(R.id.rvProduct);
        rvProduct.setLayoutManager(layoutManager);
        rvProduct.setAdapter(adapter);

    }

    private void initData(){
        listProduct.add(new Product("Zara P1","Love Shift 1","1.100.000",R.drawable.p1));
        listProduct.add(new Product("Zara P2","Love Shift 2","1.100.000",R.drawable.p2));
        listProduct.add(new Product("Zara P3","Love Shift 3","1.100.000",R.drawable.p3));
        listProduct.add(new Product("Zara P4","Love Shift 4","1.100.000",R.drawable.p4));
        listProduct.add(new Product("Zara P5","Love Shift 5","1.100.000",R.drawable.p5));
        listProduct.add(new Product("Zara P6","Love Shift 6","1.100.000",R.drawable.p6));
        listProduct.add(new Product("Zara P1","Love Shift 7","1.100.000",R.drawable.p1));
        listProduct.add(new Product("Zara P2","Love Shift 8","1.100.000",R.drawable.p2));
    }
    @Override
    public void onClickItem(int position){
        Product product = listProduct.get(position);
        Toast.makeText(this,product.getTitle(),Toast.LENGTH_SHORT).show();
    }
}