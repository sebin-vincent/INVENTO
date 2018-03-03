package com.example.sebinvincent.invento;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.firebase.auth.FirebaseAuth;

public class acti_profile extends AppCompatActivity {


    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthlistener;
    GoogleSignInAccount account;
    TextView Name,mail,pic;
    ImageView imageView;

    @Override
    protected void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthlistener);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acti_profile);


        pic = (TextView) findViewById(R.id.logout);
        Name = (TextView) findViewById(R.id.name);
        mail = (TextView) findViewById(R.id.info);

        imageView = (ImageView) findViewById(R.id.profile_pic);
        account = GoogleSignIn.getLastSignedInAccount(getApplicationContext());
        if (account != null )
        {
            String pname = account.getDisplayName();
            Uri pphoto = account.getPhotoUrl();
            String pmail = account.getEmail();
            String image=pphoto.toString();



            Name.setText(pname);


            ImageRequest imageRequest=new ImageRequest(image, new Response.Listener<Bitmap>() {
                @Override
                public void onResponse(Bitmap response) {
                    imageView.setImageBitmap(response);
                }
            }, 0, 0, ImageView.ScaleType.CENTER_CROP, null, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(getApplicationContext(),"switch on network....",Toast.LENGTH_LONG).show();
                    error.printStackTrace();                       }
            });
            Mysingleton.getMinstance(getApplicationContext()).addToRequestQue(imageRequest);


        }

        mAuth = FirebaseAuth.getInstance();

        mAuthlistener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if (firebaseAuth.getCurrentUser() == null){
                    startActivity(new Intent(acti_profile.this,acti_google_signin.class));
                    finish();
                }
            }
        };

        pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAuth.signOut();

            }
        });

    }
}
