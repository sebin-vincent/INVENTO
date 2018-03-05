package com.example.sebinvincent.invento;

import android.*;
import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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

        if(!runtime_permissions()){
            //Intent i =new Intent(getApplicationContext(),GPS_Service.class);
            //startService(i);
            enable_buttons();

        }





    }
    private boolean runtime_permissions() {

        try {
            if (Build.VERSION.SDK_INT >= 23 && ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

                requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 100);

                return true;
            }


        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        try {

            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
            if (requestCode == 100) {
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED) {
                    enable_buttons();
                } else {
                    runtime_permissions();
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public  void enable_buttons(){
        //nothing to do
    }

    public void click(View view) {

        try {

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


                    try {

                        intent.setData(Uri.parse("tel:9061842389"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getApplicationContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;


                case R.id.soza:


                    try {

                        intent.setData(Uri.parse("tel:7736118919"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getApplicationContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.arathi:


                    try {

                        intent.setData(Uri.parse("tel:9744331073"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getApplicationContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.sabik:
                    try {

                        intent.setData(Uri.parse("tel:8891284053"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getApplicationContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.sabin:
                    try {

                        intent.setData(Uri.parse("tel:9744560260"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getApplicationContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.mahesh:
                    try {

                        intent.setData(Uri.parse("tel:9037687128"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getApplicationContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.afsal:
                    try {

                        intent.setData(Uri.parse("tel:8943436303"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getApplicationContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.rakshith:
                    try {

                        intent.setData(Uri.parse("tel:7356162825"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getApplicationContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.vinitha:

                    try {

                        intent.setData(Uri.parse("tel:9495070478"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getApplicationContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.soumya:
                    try {

                        intent.setData(Uri.parse("tel:9447954991"));
                        startActivity(intent);
                    } catch (SecurityException se) {
                        se.printStackTrace();
                        Toast.makeText(getApplicationContext(), "Permission Error", Toast.LENGTH_SHORT).show();
                    }
                    break;


            }
        }
        catch(Exception e){

            e.printStackTrace();
        }



    }



}
