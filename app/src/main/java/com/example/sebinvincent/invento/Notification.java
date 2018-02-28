package com.example.sebinvincent.invento;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Notification extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private List<String> listDataDesc;
    public int count=0;
    private HashMap<String,String> listHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);


        final ProgressDialog progressDialog =new ProgressDialog(this);
        progressDialog.setMessage("Loading Notifications....");
        progressDialog.show();


        listView = (ExpandableListView)findViewById(R.id.lvExpNotification);

        listDataHeader = new ArrayList<>();
        listDataDesc = new ArrayList<>();
        listHash = new HashMap<>();

        listAdapter = new ExpandableListAdapter(Notification.this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);


        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://invento-75627.firebaseio.com/notifications");




        databaseReference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {

                progressDialog.dismiss();

                String key=dataSnapshot.getKey();

                String value=dataSnapshot.getValue(String.class);

                listDataHeader.add(key);
                listDataDesc.add(value);

                listHash.put(listDataHeader.get(count),listDataDesc.get(count));

                listAdapter.notifyDataSetChanged();

                count++;



                //String result=key+":\n"+value;

                //mProductList.add(new Product(count++,key,value));



                //mUsername.add(result);
                //arrayAdapter.notifyDataSetChanged();

                //adapter.notifyDataSetChanged();

            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {




            }
        });



    }

}
