package com.example.sebinvincent.invento;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.Normalizer;
import java.util.Calendar;
import java.util.regex.Pattern;

/**
 * Created by sebin vincent on 23-02-2018.
 */

public class frag_event_detail extends Fragment {

    TextView eventname;
    TextView prize_reset;
    TextView date_reset;
    TextView time_reset;
    TextView eventdet;
    ImageView picture;
    TextView reminder;
    TextView register;


    String imager;
    String eventdetail;
    public String event_name;
    public String dates;
    public String time;
    public String prizemoney;
    public String weburl;

    public  int prize;
    public int date;
    public int pk;


    public frag_event_detail() {

        //empty constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.frag_event_detail, container, false);
        eventname=(TextView)view.findViewById(R.id.even_name);
        eventdet=(TextView)view.findViewById(R.id.event_detail);
        picture=(ImageView) view.findViewById(R.id.imageView3);
        reminder=(TextView)view.findViewById(R.id.reminder);
        date_reset=(TextView)view.findViewById(R.id.date_detail);
        register=(TextView)view.findViewById(R.id.showingmore);
        prize_reset=(TextView)view.findViewById(R.id.prize_detail);



        eventname.setText(event_name);
        eventdet.setText(eventdetail);
        date_reset.setText(dates);
        prize_reset.setText(prizemoney);

        ImageRequest imageRequest=new ImageRequest(imager, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                picture.setImageBitmap(response);
            }
        }, 0, 0, ImageView.ScaleType.CENTER_CROP, null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getActivity(),"switch on network....",Toast.LENGTH_LONG).show();
                error.printStackTrace();                       }
        });
        Mysingleton.getMinstance(getActivity()).addToRequestQue(imageRequest);

        reminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String beginTime=time.split("to")[0];
                int beginHours = Integer.valueOf(beginTime.split(":")[0]);
                int beginMinutes = Integer.valueOf(beginTime.split(":")[1]);

                String endTime;

                try{endTime=time.split("to")[1];}
                catch(ArrayIndexOutOfBoundsException e){
                    endTime=beginTime;
                }

                int endHours = Integer.valueOf(endTime.split(":")[0]);
                int endMinutes = Integer.valueOf(endTime.split(":")[1]);


                int year = Integer.valueOf(dates.split("/")[2]);
                int month = Integer.valueOf(dates.split("/")[1]) - 1;
                int day = Integer.valueOf(dates.split("/")[0].split("\\+")[0]);

                Calendar cal = Calendar.getInstance();
                cal.set(year, month, day, beginHours, beginMinutes);

                Intent intent = new Intent(Intent.ACTION_EDIT);
                intent.setType("vnd.android.cursor.item/event");
                intent.putExtra("beginTime", cal.getTimeInMillis());
                intent.putExtra("allDay", false);

                cal.set(year, month, day, endHours, endMinutes);
                intent.putExtra("endTime", cal.getTimeInMillis());
                intent.putExtra("title",event_name );
                startActivity(intent);



            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserintent=new Intent(Intent.ACTION_VIEW,Uri.parse(weburl));
                startActivity(browserintent);
            }
        });



        return view;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        event_name = getArguments().getString("NAME");
        eventdetail=getArguments().getString("DETAIL");
        imager=getArguments().getString("IMAGE");
        time=getArguments().getString("TIME");
        date=getArguments().getInt("DATE");
        prize=getArguments().getInt("PRIZE");
        pk=getArguments().getInt("PK");


        String s1 = Normalizer.normalize(eventdetail, Normalizer.Form.NFKD);
        String regex = Pattern.quote("[\\p{InCombiningDiacriticalMarks}\\p{IsLm}\\p{IsSk}]+");

        Charset ascii = StandardCharsets.US_ASCII;


        eventdetail = new String(s1.replaceAll(regex, "").getBytes(ascii), ascii);
        eventdetail=eventdetail.replace("a???","-");


        switch (date){

            case 1: dates="16/03/2018";
                    break;

            case 2: dates="17/03/2018";
                    break;
            case 3: dates="18/03/2018";

        }

        prizemoney="Rs"+Integer.toString(prize);

        weburl="https://inventogec.org/events/"+Integer.toString(pk)+"/";


    }

}

