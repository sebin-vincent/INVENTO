package com.example.sebinvincent.invento;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by sebin vincent on 21-02-2018.
 */

public class Myadapter extends RecyclerView.Adapter<Myadapter.ViewHolder> {

    private List<card_view>listItems;
    private Context context;
    private Interface_Frag_Communi mCommunicator;



    public Myadapter(List<card_view> listItems, Context context, Interface_Frag_Communi communication) {
        this.listItems = listItems;
        this.context = context;
        mCommunicator=communication;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder holder = new ViewHolder(view,mCommunicator);
        return holder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

//        lisItem=listItems.get(position);

        holder.heading.setText(listItems.get(position).getHead());


        Picasso.with(context).load(listItems.get(position).getImage_url()).into(holder.image);

        frag_event_detail fragmentB=new frag_event_detail();
        Bundle bundle=new Bundle();
        bundle.putString("NAME",listItems.get(position).getHead());
        bundle.putString("DETAIL",listItems.get(position).getDesc());
        bundle.putString("IMAGE",listItems.get(position).getImage_url());
        bundle.putString("VENUE","college");
        bundle.putString("DATE","30/05/2018");
        bundle.putString("TIME","09:00to12:00");

        fragmentB.setArguments(bundle);

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mCommunicator.respond(listItems.get(position).getHead(),listItems.get(position).getDesc(),listItems.get(position).getImage_url()
                ,"college","30/05/2017","09:00to12:00");

                
            }
        });




    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder   {

        public TextView heading;
        public  TextView discription;
        public ImageView image;
        public LinearLayout linearLayout;


        public ViewHolder(View itemView, Interface_Frag_Communi Communicator) {
            super(itemView);

            heading=(TextView)itemView.findViewById(R.id.heading);
            discription=(TextView)itemView.findViewById(R.id.discription);
            image=(ImageView)itemView.findViewById(R.id.image);
            linearLayout=(LinearLayout)itemView.findViewById(R.id.linearLayout);
            mCommunicator=Communicator;



        }


    }


}
