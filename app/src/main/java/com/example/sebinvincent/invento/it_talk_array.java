package com.example.sebinvincent.invento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 04-03-2018.
 */

public class it_talk_array {

    public List<String> title = new ArrayList<>();
    public List<String> description = new ArrayList<>();
    public List<Integer> prize = new ArrayList<>();
    public List<Integer> day = new ArrayList<>();
    public List<Integer> pk = new ArrayList<>();

    public String responses = "";


    public it_talk_array() {

        this.title.add("VR EXPO");

        //--------------------------------------------------

        this.description.add("\"There is no universe larger and greater than our imagination\".\n" +
                "                                                                                                                    -John Milt\n" +
                "Have you had a wish to live in those fantasy world of Harry Potter, Lord of rings " +
                "and other stories? We will help you to reach that world beyond your imagination and" +
                " let you feel this virtual world. Invento'18 multifest GEC Palakkad brings VR Expo " +
                "to make your dreams to be truly felt like you feel in reality.\n" +
                "Be part of this magical experience of this new technology with us in Invento'18 and" +
                " let's create our own universe.\n" +
                "Hurry up and register now.");

        //--------------------------------------------------

        this.prize.add(0);

        //--------------------------------------------------

        this.day.add(2);

        //--------------------------------------------------

        this.pk.add(22);

    }

    //--------------------------------------------------
    //--------------------------------------------------

    public int getLength(){

        return title.size();
    }
    public String getTitle(int i){

        return title.get(i);
    }
    public String getDesc(int i){

        return description.get(i);
    }

    public int getPrize(int i){

        return prize.get(i);
    }
    public int getDay(int i){

        return day.get(i);
    }
    public int getPk(int i){

        return pk.get(i);
    }
}
