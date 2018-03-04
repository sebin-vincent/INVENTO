package com.example.sebinvincent.invento;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
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


public class frag_cse_comp_list extends Fragment {

    private static final String url_data="https://inventogec.org/api/v1/events/cse/com/?format=json";

    private RecyclerView recyclerView;
    private Myadapter adapter;

    private List<card_view> listItems;



    public frag_cse_comp_list() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view;
        view=inflater.inflate(R.layout.frag_cse_comp_list, container, false);

        recyclerView=(RecyclerView)view.findViewById(R.id.recyclerview);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        recyclerView.setItemAnimator(new DefaultItemAnimator());


        listItems=new ArrayList<>();

        loadRecyclerviewData();



        return view;
    }

    protected boolean isNetworkConnected() {
        try {
            ConnectivityManager mConnectivityManager = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo mNetworkInfo = mConnectivityManager.getActiveNetworkInfo();
            return (mNetworkInfo == null) ? false : true;

        }catch (NullPointerException e){
            return false;

        }
    }
    public String stripHtml(String html) {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            return String.valueOf(Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY));
        } else {
            return String.valueOf(Html.fromHtml(html));
        }
    }


    private  void loadRecyclerviewData(){

        final ProgressDialog progressDialog =new ProgressDialog(getActivity());
        progressDialog.setMessage("Loading data....");
        progressDialog.show();

        if(!isNetworkConnected()){

            cse_comp_array array= new cse_comp_array();

            int l=array.getLength();
            Uri uri = Uri.parse("android.resource://com.example.sebinvincent.invento/drawable/loadings");
            progressDialog.dismiss();


            for (int i=0;i<l;i++){


                /*card_view listitem=new card_view(array.getNmaes(i),
                        array.getProgram(i),uri.toString());
                listItems.add(listitem);*/
                String rr=array.getDesc(i);

                String rrnew=rr.replace("/\\r/g",("xc"));
                rr=rrnew.replace("/\\r/g",("xc"));
                //.replace("/\\r/g","")

                card_view listitem=new card_view(array.getTitle(i),
                        array.getDesc(i),uri.toString(),array.getPrize(i),array.getDay(i),
                        array.getPk(i));
                listItems.add(listitem);


            }

            adapter=new Myadapter(listItems,getActivity(),communication);
            recyclerView.setAdapter(adapter);

        }
        else {

            final StringRequest stringRequest = new StringRequest(Request.Method.GET, url_data, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    progressDialog.dismiss();

                    try {
                        JSONArray array = new JSONArray(response);

                        for (int i = 0; i < array.length(); i++) {
                            JSONObject o = array.getJSONObject(i);



                            String normailString = stripHtml(o.getString("description"));
                            card_view listitem = new card_view(o.getString("title"),
                                    normailString, o.getString("imageurl"), o.getInt("prize"), o.getInt("day"),
                                    o.getInt("pk"));


                            listItems.add(listitem);

                            System.out.println("Title: "+o.getString("title"));
                            System.out.println("description"+o.getString("description"));
                            System.out.println("prize"+o.getInt("prize"));
                            System.out.println("day"+o.getInt("day"));
                            System.out.println("pk"+o.getInt("pk"));



                        }

                        adapter = new Myadapter(listItems, getContext(), communication);
                        recyclerView.setAdapter(adapter);


                    } catch (JSONException e) {




                        e.printStackTrace();
                    }


                }
            },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                            cse_comp_array array= new cse_comp_array();

                            int l=array.getLength();
                            Uri uri = Uri.parse("android.resource://com.example.sebinvincent.invento/drawable/loadings");
                            progressDialog.dismiss();


                            for (int i=0;i<l;i++){

                                card_view listitem=new card_view(array.getTitle(i),
                                        array.getDesc(i),uri.toString(),array.getPrize(i),array.getDay(i),
                                        array.getPk(i));
                                listItems.add(listitem);


                            }

                            adapter=new Myadapter(listItems,getActivity(),communication);
                            recyclerView.setAdapter(adapter);

                        }
                    }
            );

            RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
            requestQueue.add(stringRequest);

        }
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





