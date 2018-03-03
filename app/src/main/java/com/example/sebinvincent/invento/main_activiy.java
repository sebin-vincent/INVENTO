package com.example.sebinvincent.invento;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Thread.sleep;

public class main_activiy extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    Point size;

    Button it,cs,eee,mech,ec,general;
    TextView textView;
    TextView showmore;
    String department;
    private int count = 0;
    //new comment

    ImageView deptIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        department="cse";

        it=findViewById(R.id.it);
        cs=findViewById(R.id.cse);
        eee=findViewById(R.id.eee);
        ec=findViewById(R.id.ece);
        mech=findViewById(R.id.mech);
        general=findViewById(R.id.general);
        textView=(TextView)findViewById(R.id.dprtmntname);
        showmore=(TextView)findViewById(R.id.showmore);
        deptIcon=(ImageView)findViewById(R.id.imageView2);


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

        deptIcon.setImageURI(Uri.parse("android.resource://com.example.sebinvincent.invento/drawable/cse_app"));


        showmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                switch (department) {

                    case "cse":


                        Toast.makeText(main_activiy.this,"Welcome to Cse Virus",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(getApplicationContext(), acti_dprt_cse.class);
                        startActivity(intent);




                        break;
                    case "it":

                        Toast.makeText(main_activiy.this,"Welcome to Itianz",Toast.LENGTH_LONG).show();

                        intent=new Intent(getApplicationContext(),acti_dprt_it.class);
                         startActivity(intent);

                        break;

                    case "mech":

                        Toast.makeText(main_activiy.this,"Welcome to Royal Mech",Toast.LENGTH_LONG).show();

                        intent=new Intent(getApplicationContext(),acti_dprt_mech.class);
                        startActivity(intent);
                        break;

                    case "ece":

                        Toast.makeText(main_activiy.this,"Welcome to Terror Ec",Toast.LENGTH_LONG).show();


                        intent=new Intent(getApplicationContext(),acti_dprt_ece.class);
                        startActivity(intent);
                        break;

                    case "eee":

                        Toast.makeText(main_activiy.this,"Welcome to Power Eee",Toast.LENGTH_LONG).show();


                        intent=new Intent(getApplicationContext(),acti_dprt_eee.class);
                        startActivity(intent);
                        break;
                    case "general":

                        Toast.makeText(main_activiy.this,"Welcome to Generals",Toast.LENGTH_LONG).show();


                        intent=new Intent(getApplicationContext(),acti_dprt_general.class);
                        startActivity(intent);
                        break;
                }
            }
        });





    }
    public void click(View view){

        ViewGroup.LayoutParams params;

        switch (view.getId()){

            case R.id.cse :
                department = "cse";

                textView.setText("COMPUTER SCIENCE \nAND \nENGINEERING");
                deptIcon.setImageURI(Uri.parse("android.resource://com.example.sebinvincent.invento/drawable/cse_app"));

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

                cs.setPadding(10,0,10,0);

                break;

            case R.id.it :

                department="it";

                textView.setText("INFORMATION\nTECHNOLOGY");
                deptIcon.setImageURI(Uri.parse("android.resource://com.example.sebinvincent.invento/drawable/it_app"));


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


                it.setGravity(Gravity.CENTER |Gravity.RIGHT);
                cs.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                ec.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                mech.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                eee.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                general.setGravity(Gravity.CENTER | Gravity.BOTTOM);

                break;

            case R.id.ece :

                department="ece";

                textView.setText("ELECTRONICS AND \nCOMMUNICATION \nENGINEERING");
                deptIcon.setImageURI(Uri.parse("android.resource://com.example.sebinvincent.invento/drawable/ece_app"));


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


                ec.setGravity(Gravity.CENTER |Gravity.RIGHT);
                cs.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                it.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                mech.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                eee.setGravity(Gravity.CENTER | Gravity.BOTTOM);
                general.setGravity(Gravity.CENTER | Gravity.BOTTOM);


                break;
            case R.id.mech :

                department="mech";

                textView.setText("MECHANICAL\nENGINEERING");
                deptIcon.setImageURI(Uri.parse("android.resource://com.example.sebinvincent.invento/drawable/mech_app"));


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
            case R.id.eee :

                department="eee";
                textView.setText("ELECTRICAL AND \nELECTRONICS \nENGINEERING");
                deptIcon.setImageURI(Uri.parse("android.resource://com.example.sebinvincent.invento/drawable/eee_app"));


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


            case R.id.general :

                department="general";

                textView.setText("GENERAL\nEVENTS");
                deptIcon.setImageURI(Uri.parse("android.resource://com.example.sebinvincent.invento/drawable/cse_drawing"));



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

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        MenuItem menuItem = menu.findItem(R.id.notifications);
        menuItem.setIcon(buildCounterDrawable(count, R.drawable.ic_stat_notifications));
        return true;
    }
    private Drawable buildCounterDrawable(int count, int backgroundImageId) {
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.counter_menuitem_layout, null);
        view.setBackgroundResource(backgroundImageId);

        if (count == 0) {
            View counterTextPanel = view.findViewById(R.id.counterValuePanel);
            counterTextPanel.setVisibility(View.GONE);
        } else {
            TextView textView = (TextView) view.findViewById(R.id.count);
            textView.setText("" + count);
        }

        view.measure(
                View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED),
                View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());

        view.setDrawingCacheEnabled(true);
        view.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);
        Bitmap bitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);

        return new BitmapDrawable(getResources(), bitmap);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {

            Intent intent =new Intent(main_activiy.this,AboutUS.class);
            startActivity(intent);
            return true;
        }
        else if (id == R.id.notifications) {

            Intent intent =new Intent(main_activiy.this,Notification.class);
            startActivity(intent);
            return true;
        }
        else if (id==R.id.reachus){

            Intent intent=new Intent(main_activiy.this,MapsActivity.class);
            startActivity(intent);
            return true;

        }

        else if(id==R.id.profile){

            Intent intent=new Intent(main_activiy.this,acti_profile.class);
            startActivity(intent);
            return true;
        }

        else if(id==R.id.coordinators){

            Intent intent=new Intent(main_activiy.this,acti_coordinators.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("INVENTO")
                .setMessage("കൊറച്ചു കഴിഞ്ഞ് പോവാം ഗഡി ?")
                .setNegativeButton("എന്നാ ശെരി ..", null)
                .setPositiveButton("പിന്നെ വരാം bro", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {
                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        startActivity(intent);
                    }
                }).create().show();
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}
