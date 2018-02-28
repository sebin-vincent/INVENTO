package com.example.sebinvincent.invento;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class frag_mech_events extends Fragment {

    ImageView competitions;
    ImageView workshops;
    ImageView talks;

    public frag_mech_events() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        view=inflater.inflate(R.layout.frag_mech_events, container, false);

        competitions =(ImageView)view.findViewById(R.id.mech_comp);
        workshops = (ImageView)view.findViewById(R.id.mech_wrkshp);
        talks = (ImageView)view.findViewById(R.id.mech_talksndshow);


        competitions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frag_mech_comp_list mechComp =new frag_mech_comp_list();
                FragmentManager manager=getFragmentManager();
                manager.beginTransaction().replace(R.id.Container,mechComp,mechComp.getTag()).addToBackStack("").commit();

            }
        });

        workshops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frag_mech_work_list mechwork =new frag_mech_work_list();
                FragmentManager manager=getFragmentManager();
                manager.beginTransaction().replace(R.id.Container,mechwork,mechwork.getTag()).addToBackStack("").commit();

            }
        });

        talks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frag_mech_talk_list mechtalk =new frag_mech_talk_list();
                FragmentManager manager=getFragmentManager();
                manager.beginTransaction().replace(R.id.Container,mechtalk,mechtalk.getTag()).addToBackStack("").commit();

            }
        });


        return view;
    }

}
