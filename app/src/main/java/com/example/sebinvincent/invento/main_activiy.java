package com.example.sebinvincent.invento;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class main_activiy extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{


    Button it,cs,eee,mech,ec,general;
    TextView textView;
    TextView showmore;
    String department;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        department = "cse";

        it = findViewById(R.id.it);
        cs = findViewById(R.id.cse);
        eee = findViewById(R.id.eee);
        ec = findViewById(R.id.ece);
        mech = findViewById(R.id.mech);
        general = findViewById(R.id.general);
        textView = (TextView) findViewById(R.id.dprtmntname);
        showmore = (TextView) findViewById(R.id.showmore);


        it.setRotation(270);
        cs.setRotation(0);
        cs.setTranslationX(40);
        eee.setRotation(270);
        ec.setRotation(270);
        mech.setRotation(270);
        general.setRotation(270);

        cs.setTranslationX(40);
        it.setTranslationX(0);
        ec.setTranslationX(0);
        eee.setTranslationX(0);
        mech.setTranslationX(0);
        general.setTranslationX(0);

        cs.setGravity(Gravity.CENTER | Gravity.RIGHT);
        it.setGravity(Gravity.CENTER | Gravity.BOTTOM);
        ec.setGravity(Gravity.CENTER | Gravity.BOTTOM);
        mech.setGravity(Gravity.CENTER | Gravity.BOTTOM);
        eee.setGravity(Gravity.CENTER | Gravity.BOTTOM);
        general.setGravity(Gravity.CENTER | Gravity.BOTTOM);

        showmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (department) {

                    case "cse":


                        Intent intent = new Intent(getApplicationContext(), acti_dprt_cse.class);
                        startActivity(intent);

                        break;
                    case "it":

                        intent = new Intent(getApplicationContext(), acti_dprt_it.class);
                        startActivity(intent);

                        break;

                    case "mech":
                        intent = new Intent(getApplicationContext(), acti_dprt_mech.class);
                        startActivity(intent);
                        break;

                    case "ece":

                        intent = new Intent(getApplicationContext(), acti_dprt_ece.class);
                        startActivity(intent);
                        break;

                    case "eee":

                        intent = new Intent(getApplicationContext(), acti_dprt_eee.class);
                        startActivity(intent);
                        break;
                    case "general":

                        intent = new Intent(getApplicationContext(), acti_dprt_general.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }




    public void click(View view) {

        ViewGroup.LayoutParams params;
        switch (view.getId()) {

            case R.id.cse:
                department = "cse";

                textView.setText("COMPUTER SCIENCE \nAND \nENGINEERING");

                it.setRotation(270);
                eee.setRotation(270);
                ec.setRotation(270);
                mech.setRotation(270);
                general.setRotation(270);
                cs.setRotation(0);


                cs.setTranslationX(40);
                it.setTranslationX(0);
                ec.setTranslationX(0);
                eee.setTranslationX(0);
                mech.setTranslationX(0);
                general.setTranslationX(0);

                cs.setGravity(Gravity.CENTER | Gravity.RIGHT);
                it.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                ec.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                mech.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                eee.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                general.setGravity(Gravity.CENTER | Gravity.BOTTOM);

                cs.setPadding(10, 0, 10, 0);

                break;

            case R.id.it:

                department = "it";

                textView.setText("INFORMATION\nTECHNOLOGY");

                it.setRotation(0);
                cs.setRotation(270);
                eee.setRotation(270);
                ec.setRotation(270);
                mech.setRotation(270);
                general.setRotation(270);

                cs.setTranslationX(0);
                it.setTranslationX(40);
                ec.setTranslationX(0);
                eee.setTranslationX(0);
                mech.setTranslationX(0);
                general.setTranslationX(0);


                it.setGravity(Gravity.CENTER | Gravity.RIGHT);
                cs.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                ec.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                mech.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                eee.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                general.setGravity(Gravity.CENTER | Gravity.BOTTOM);

                break;

            case R.id.ece:

                department = "ece";

                textView.setText("ELECTRONICS AND \nCOMMUNICATION \nENGINEERING");

                it.setRotation(270);
                cs.setRotation(270);
                eee.setRotation(270);
                ec.setRotation(0);
                mech.setRotation(270);
                general.setRotation(270);


                cs.setTranslationX(0);
                it.setTranslationX(0);
                ec.setTranslationX(40);
                eee.setTranslationX(0);
                mech.setTranslationX(0);
                general.setTranslationX(0);


                ec.setGravity(Gravity.CENTER | Gravity.RIGHT);
                cs.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                it.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                mech.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                eee.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                general.setGravity(Gravity.CENTER | Gravity.BOTTOM);


                break;
            case R.id.mech:

                department = "mech";

                textView.setText("MECHANICAL\nENGINEERING");

                it.setRotation(270);
                cs.setRotation(270);
                eee.setRotation(270);
                ec.setRotation(270);
                mech.setRotation(0);
                general.setRotation(270);


                cs.setTranslationX(0);
                it.setTranslationX(0);
                ec.setTranslationX(0);
                eee.setTranslationX(0);
                mech.setTranslationX(40);
                general.setTranslationX(0);

                mech.setGravity(Gravity.CENTER | Gravity.RIGHT);
                it.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                ec.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                cs.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                eee.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                general.setGravity(Gravity.CENTER | Gravity.BOTTOM);

                break;
            case R.id.eee:

                department = "eee";
                textView.setText("ELECTRICAL AND \nELECTRONICS \nENGINEERING");

                it.setRotation(270);
                cs.setRotation(270);
                eee.setRotation(0);
                ec.setRotation(270);
                mech.setRotation(270);
                general.setRotation(270);


                cs.setTranslationX(0);
                it.setTranslationX(0);
                ec.setTranslationX(0);
                eee.setTranslationX(40);
                mech.setTranslationX(0);
                general.setTranslationX(0);


                eee.setGravity(Gravity.CENTER | Gravity.RIGHT);
                it.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                ec.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                mech.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                cs.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                general.setGravity(Gravity.CENTER | Gravity.BOTTOM);

                break;


            case R.id.general:

                department = "general";

                textView.setText("GENERAL\nEVENTS");


                it.setRotation(270);
                cs.setRotation(270);
                general.setRotation(0);
                ec.setRotation(270);
                mech.setRotation(270);
                eee.setRotation(270);


                cs.setTranslationX(0);
                it.setTranslationX(0);
                ec.setTranslationX(0);
                general.setTranslationX(40);
                mech.setTranslationX(0);
                eee.setTranslationX(0);


                general.setGravity(Gravity.CENTER | Gravity.RIGHT);
                eee.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                it.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                ec.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                mech.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                cs.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                break;
        }
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}
