package com.example.sebinvincent.invento;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class acti_dprt_cse extends AppCompatActivity {

    int occurance_time=0;                                               //initialized by sebin
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

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(occurance_time==0){
                    fragmentTransaction=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.setCustomAnimations(R.anim.enter_from_top,R.anim.exit_to_top,R.anim.enter_from_top,R.anim.exit_to_top);
                    fragmentTransaction.add(R.id.Container,new frag_menu());
                    fragmentTransaction.addToBackStack("");
                    fragmentTransaction.commit();
                    occurance_time=1;
                }
                else{
                    getSupportFragmentManager().popBackStack();
                    occurance_time=0;
                }
            }
        });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        occurance_time=0;
    }
}
