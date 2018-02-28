package com.example.sebinvincent.invento;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class acti_dprt_mech extends AppCompatActivity {

    int occurence_time=0;
    TextView dprt_heading;
    ImageView menu;

    android.support.v4.app.FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dprt_mech);

        fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.Container,new frag_mech_events());
        fragmentTransaction.commit();

        menu=(ImageView)findViewById(R.id.menu_mech);



        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (occurence_time==0){

                    fragmentTransaction=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.setCustomAnimations(R.anim.enter_from_top,R.anim.exit_to_top,R.anim.enter_from_top,R.anim.exit_to_top);
                    fragmentTransaction.add(R.id.Container,new frag_menu());
                    fragmentTransaction.addToBackStack("");
                    fragmentTransaction.commit();
                    occurence_time=1;
                }
                else {

                    getSupportFragmentManager().popBackStack();
                    occurence_time=0;
                }
            }
        });
    }
}
