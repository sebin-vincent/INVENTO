package com.example.sebinvincent.invento;

import android.annotation.SuppressLint;
import android.content.Context;
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

    public void click(View view) {

        Intent intent = new Intent(Intent.ACTION_CALL);
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }

        switch (view.getId()) {

            case R.id.shaji:


                intent.setData(Uri.parse("tel:" + "8086781913"));

                startActivity(intent);
                break;

            case R.id.soza:


                intent.setData(Uri.parse("tel:" + "8086781913"));

                startActivity(intent);
                break;

            case R.id.arathi:


                intent.setData(Uri.parse("tel:" + "8086781913"));

                startActivity(intent);
                break;



        }



    }



}
