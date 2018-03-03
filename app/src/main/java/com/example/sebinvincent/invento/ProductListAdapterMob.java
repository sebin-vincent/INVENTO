package com.example.sebinvincent.invento;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by anoop on 21/9/16.
 */
public class ProductListAdapterMob extends BaseAdapter {


    private Context mContext;
    private List<ProductMobNumbers> mProductList;

    //constructor


    public ProductListAdapterMob(Context mContext, List<ProductMobNumbers> mProductList) {
        this.mContext = mContext;
        this.mProductList = mProductList;
    }

    @Override
    public int getCount() {
        return mProductList.size();
    }

    @Override
    public Object getItem(int position) {
        return mProductList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v;
        v = View.inflate(mContext, R.layout.layout,null);
        TextView tvName =(TextView)v.findViewById(R.id.tv_name);
        TextView tvTime =(TextView)v.findViewById(R.id.tv_time);
        //set text view
        tvName.setText(mProductList.get(position).getName());
        tvTime.setText((mProductList.get(position).getTime()));

        //save product id to tag

        v.setTag(mProductList.get(position).getTime());
        return v;
    }
}

