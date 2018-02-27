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
public class frag_eee_events extends Fragment {

    ImageView competitions;
    ImageView workshops;
    ImageView talks;


    public frag_eee_events() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        view=inflater.inflate(R.layout.frag_eee_events, container, false);


        competitions=(ImageView)view.findViewById(R.id.eee_comp);
        workshops=(ImageView)view.findViewById(R.id.eee_wrkshp);
        talks=(ImageView)view.findViewById(R.id.eee_talksndshow);

        competitions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                frag_eee_comp_list eeeComp =new frag_eee_comp_list();
                FragmentManager manager=getFragmentManager();
                manager.beginTransaction().replace(R.id.Container,eeeComp,eeeComp.getTag()).addToBackStack("").commit();

            }
        });

        workshops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                frag_eee_work_list eeework =new frag_eee_work_list();
                FragmentManager manager=getFragmentManager();
                manager.beginTransaction().replace(R.id.Container,eeework,eeework.getTag()).addToBackStack("").commit();


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
