package com.example.sebinvincent.invento;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

/**
 * Created by Rakshith on 27-Feb-18.
 */

public class frag_menu extends Fragment{

    public frag_menu(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view;

        view = inflater.inflate(R.layout.frag_menu,container, false);
        return view;
    }


}
