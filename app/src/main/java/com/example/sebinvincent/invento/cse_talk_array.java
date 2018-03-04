package com.example.sebinvincent.invento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 04-03-2018.
 */

public class cse_talk_array {

    public List<String> title = new ArrayList<>();
    public List<String> description = new ArrayList<>();
    public List<Integer> prize = new ArrayList<>();
    public List<Integer> day = new ArrayList<>();
    public List<Integer> pk = new ArrayList<>();

    public String responses = "";


    public cse_talk_array() {

        this.title.add("HOLOMANIACS");

        //--------------------------------------------------

        this.description.add("MARCH 16,17 & 18\n" +
                "Watching jungle book in an above average radius glass is kind of old-fashioned, " +
                "donâ\u0080\u0099t you think? Why stick to the classic when we have a brand new " +
                "show to put up.  Get ready for the experience of a lifetime when we CSEians present" +
                " you the ultimate 3D show with an exciting turn of events. Remember folks, " +
                "itâ\u0080\u0099s no ordinary. So buckle up your seats for the adventure within four" +
                " walls. Be sure to mark the dates!  We are here the whole INVENTO time!!!");

        //--------------------------------------------------

        this.prize.add(0);

        //--------------------------------------------------

        this.day.add(1);

        //--------------------------------------------------

        this.pk.add(52);

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