package com.example.sebinvincent.invento;



import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class frag_menu extends Fragment {

    Button cse,mech,it,eee,ece,general,home;


    public frag_menu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentTransaction fragmentTransaction;

        View view;
        view=inflater.inflate(R.layout.frag_menu,container, false);

        cse=(Button)view.findViewById(R.id.cseevents);
        ece=(Button)view.findViewById(R.id.eceevents);
        it=(Button)view.findViewById(R.id.itevents);
        mech=(Button)view.findViewById(R.id.meevents);
        eee=(Button)view.findViewById(R.id.eeeevents);
        general=(Button)view.findViewById(R.id.generalevents);
        home=(Button)view.findViewById(R.id.backtohome);
        fragmentTransaction=getFragmentManager().beginTransaction();

        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"#LetsInvento",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), acti_dprt_cse.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                getActivity().finish();

            }
        });

        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(),"#LetsInvento",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), acti_dprt_it.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                getActivity().finish();

            }
        });

        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(),"#LetsInvento",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), acti_dprt_ece.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                getActivity().finish();

            }
        });

        mech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(),"#LetsInvento",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), acti_dprt_mech.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                getActivity().finish();

            }
        });

        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(),"#LetsInvento",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), acti_dprt_eee.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                getActivity().finish();

            }
        });

        general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(),"#LetsInvento",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), acti_dprt_general.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                getActivity().finish();

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(),"#LetsInvento",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), main_activiy.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                getActivity().finish();

            }
        });




        return view;
    }



}
