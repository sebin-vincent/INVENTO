package com.example.sebinvincent.invento;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class acti_call_coordi extends AppCompatActivity {
    TextView shaji, soza, arathy, vinitha, soumya, sabik, afsal, sabin, mahesh, rakshith;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acti_call_coordi);

        shaji = (TextView) findViewById(R.id.shaji);
        soza = (TextView) findViewById(R.id.soza);
        arathy = (TextView) findViewById(R.id.arathi);
        vinitha = (TextView) findViewById(R.id.vinitha);
        soumya = (TextView) findViewById(R.id.soumya);
        sabik = (TextView) findViewById(R.id.sabik);
        afsal = (TextView) findViewById(R.id.afsal);
        sabin = (TextView) findViewById(R.id.sabin);
        mahesh = (TextView) findViewById(R.id.mahesh);
        rakshith = (TextView) findViewById(R.id.rakshith);




    }



}
