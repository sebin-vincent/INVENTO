package com.example.sebinvincent.invento;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class acti_dprt_cse extends AppCompatActivity {

    int occurance_time=0;                                               //initialized by sebin
    TextView dprt_heading;
    ImageView menu;

    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dprt_cse);

        menu=(ImageView)findViewById(R.id.menu_cse);

        fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.Container,new frag_cse_events());
        fragmentTransaction.commit();


    }
}
