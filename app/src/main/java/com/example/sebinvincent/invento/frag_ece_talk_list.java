package com.example.sebinvincent.invento;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class frag_ece_talk_list extends Fragment {

    private static final String url_data="https://inventogec.org/api/v1/events/ece/sho/?format=json";

    private RecyclerView recyclerView;
    private Myadapter adapter;

    public frag_ece_talk_list() {
        // Required empty public constructor
    }

    private List<card_view> listItems;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.frag_ece_comp_list, container, false);

        recyclerView=(RecyclerView)view.findViewById(R.id.recyclerview_ece);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        recyclerView.setItemAnimator(new DefaultItemAnimator());


        listItems=new ArrayList<>();

        loadRecyclerviewData();



        return view;
    }

    private  void loadRecyclerviewData(){

        final ProgressDialog progressDialog =new ProgressDialog(getActivity());
        progressDialog.setMessage("Loading data....");
        progressDialog.show();

        final StringRequest stringRequest=new StringRequest(Request.Method.GET, url_data, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                progressDialog.dismiss();

                try {



                    JSONArray array=new JSONArray(response);

                    for (int i=0;i<array.length();i++){
                        JSONObject o= array.getJSONObject(i);
                        card_view listitem=new card_view(o.getString("title"),
                                o.getString("description"),o.getString("imageurl"),o.getInt("prize"),o.getInt("day"),
                                o.getInt("pk"));
                        listItems.add(listitem);



                    }

                    adapter=new Myadapter(listItems,getContext(),communication);
                    recyclerView.setAdapter(adapter);

                }catch (JSONException e){
                    e.printStackTrace();
                }


            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        progressDialog.dismiss();
                        Log.d(getTag(),error.getMessage());
                        Toast.makeText(getContext(),error.getMessage(),Toast.LENGTH_LONG).show();

                    }
                }
        );

        RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
        requestQueue.add(stringRequest);


    }

    Interface_Frag_Communi communication=new Interface_Frag_Communi() {
        @Override
        public void respond(String header,String discrptr,String photo,int prize,int day,int pk,String time) {
            frag_event_detail fragmentB=new frag_event_detail();
            Bundle bundle=new Bundle();
            bundle.putString("NAME",header);
            bundle.putString("DETAIL",discrptr);
            bundle.putString("IMAGE",photo);
            bundle.putInt("PRIZE",prize);
            bundle.putInt("DATE",day);
            bundle.putInt("PK",pk);
            bundle.putString("TIME",time);
            fragmentB.setArguments(bundle);
            FragmentManager manager=getFragmentManager();
            FragmentTransaction transaction=manager.beginTransaction();
            transaction.replace(R.id.Container,fragmentB).addToBackStack("").commit();
        }

    };



}

