package com.example.sebinvincent.invento;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class frag_it_events extends Fragment {

    ImageView competitions;
    ImageView workshops;
    ImageView talks;


    public frag_it_events() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;

        view=inflater.inflate(R.layout.frag_it_events, container, false);

        competitions=(ImageView)view.findViewById(R.id.it_comp);
        talks=(ImageView)view.findViewById(R.id.it_talksndshow);

        competitions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                frag_it_comp_list itComp =new frag_it_comp_list();
                FragmentManager manager=getFragmentManager();
                manager.beginTransaction().replace(R.id.Container,itComp,itComp.getTag()).addToBackStack("").commit();

            }
        });


        talks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                frag_it_talk_list ittalks =new frag_it_talk_list();
                FragmentManager manager=getFragmentManager();
                manager.beginTransaction().replace(R.id.Container,ittalks,ittalks.getTag()).addToBackStack("").commit();


            }
        });



        return view;
    }








}
