package com.example.sebinvincent.invento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sebin vincent on 04-03-2018.
 */

public class eee_talk_array {

    public List<String> title = new ArrayList<>();
    public List<String> description = new ArrayList<>();
    public List<Integer> prize = new ArrayList<>();
    public List<Integer> day = new ArrayList<>();
    public List<Integer> pk = new ArrayList<>();

    public String responses = "";


    public eee_talk_array() {

        this.title.add("P.O.V");
        this.title.add("HOLOGRAPHY");
        this.title.add("INFINITY WELL");
        this.title.add("TESLA COIL");
        this.title.add("JACOB'S LADDER");
        this.title.add("MAGLEV");

        //--------------------------------------------------

        this.description.add("Persistence Of Vision is not as simple as you think....\n" +
                "Your eye can do wonders when needed.....\n" +
                "And this is one of them.... If you think your head can handle it...\n" +
                "Then be there to watch the  P.O.V Display...\n" +
                "Where you decode electrical pulse with the power of your Eye");
        this.description.add("Where the Imagination meets Reality.....\n" +
                "3D Projections of the 2D pictures and animations are sure to leave the audience spell bound....\n" +
                "Silly Doodles and Animated Characters Come to Life,Floating in the air...\n" +
                "Be Ready to be Vowed.......!!!!!!!!!");
        this.description.add("Some infinities are bigger than other infinities.....\n" +
                "This Well is a bottomless pit created by Electrical Magic on solid ground.....\n" +
                "The longer you look,the deeper the Well goes...\n" +
                "So watch out for the endless Well...Who knows what's in store at the other end of Infinity..!!!!!");
        this.description.add("When Brains meet the Science,Magic like Tesla Coil occurs....\n" +
                "This phenomenon is sure to astound the audience with its sheer Intensity and Brilliance........");
        this.description.add("Yet another Infinity that is Watched and Pondered over a million times.....\n" +
                "Ever heard of an Electrical ladder which apparently never ends.....\n" +
                "If you have heard,but not experienced......\n" +
                "Then,What are you waiting for......????\n" +
                "Be There...!!!!!");
        this.description.add("The Dream of all Techies.....\n" +
                "Magnetic Levitation.....\n" +
                "A floating mechanism which fuels the fastest train on Earth...\n" +
                "Bullet Train is no longer a Mystery,but a simple Science fact....!!!!!");

        //--------------------------------------------------

        this.prize.add(0);
        this.prize.add(0);
        this.prize.add(0);
        this.prize.add(0);
        this.prize.add(0);
        this.prize.add(0);

        //--------------------------------------------------

        this.day.add(1);
        this.day.add(1);
        this.day.add(1);
        this.day.add(1);
        this.day.add(1);
        this.day.add(1);

        //--------------------------------------------------

        this.pk.add(59);
        this.pk.add(60);
        this.pk.add(61);
        this.pk.add(62);
        this.pk.add(63);
        this.pk.add(64);

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
