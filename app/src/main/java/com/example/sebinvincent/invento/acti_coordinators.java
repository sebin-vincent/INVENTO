package com.example.sebinvincent.invento;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class acti_coordinators extends AppCompatActivity {

    private ListView lvProduct;
    private ProductListAdapterMob adapter;
    private List<ProductMobNumbers> mProductList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acti_coordinators);

        lvProduct=(ListView)findViewById(R.id.listCoordinators);
        mProductList=new ArrayList<>();

        coordinatorNumbers coordinator=new coordinatorNumbers();

        int l=coordinator.getLength();

        for (int i=0;i<l;i++){

            mProductList.add(new ProductMobNumbers(i+1,coordinator.getName(i),coordinator.getNumber(i)));

        }


        adapter =new ProductListAdapterMob(getApplicationContext(),mProductList);
        lvProduct.setAdapter(adapter);

        lvProduct.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @SuppressLint("MissingPermission")
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //do some thing
                // Toast.makeText(getApplicationContext(),"Bus Time =" + view.getTag(),Toast.LENGTH_SHORT).show();
                Intent callIntent=new Intent(Intent.ACTION_CALL);
                startActivity(callIntent);
            }
        });

    }
}
