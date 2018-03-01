package com.example.sebinvincent.invento;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class frag_menu extends Fragment {


    public frag_menu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.frag_menu,container, false);
    }

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.cseevents) {

            Intent intent =new Intent(frag_menu.this,.class);
            startActivity(intent);
            return true;
        }
        else if (id == R.id.notifications) {

            Intent intent =new Intent(main_activiy.this,Notification.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/




}