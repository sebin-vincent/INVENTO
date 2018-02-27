package com.example.sebinvincent.invento;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class frag_cse_events extends Fragment {

    ImageView competitions;
    ImageView workshops;
    ImageView talks;



    public frag_cse_events() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        view=inflater.inflate(R.layout.frag_cse_events, container, false);

        competitions=(ImageView)view.findViewById(R.id.cse_comp);
        workshops=(ImageView)view.findViewById(R.id.cse_wrkshp);
        talks=(ImageView)view.findViewById(R.id.cse_talksndshow);

        competitions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                frag_cse_comp_list cseComp =new frag_cse_comp_list();
                FragmentManager manager=getFragmentManager();
                manager.beginTransaction().replace(R.id.Container,cseComp,cseComp.getTag()).addToBackStack("").commit();

            }
        });


        workshops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                frag_cse_work_list csework =new frag_cse_work_list();
                FragmentManager manager=getFragmentManager();
                manager.beginTransaction().replace(R.id.Container,csework,csework.getTag()).addToBackStack("").commit();


            }
        });

        talks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                frag_cse_talk_list csetalks =new frag_cse_talk_list();
                FragmentManager manager=getFragmentManager();
                manager.beginTransaction().replace(R.id.Container,csetalks,csetalks.getTag()).addToBackStack("").commit();


            }
        });



        return view;
    }








}
