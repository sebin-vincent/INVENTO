package com.example.sebinvincent.invento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 04-03-2018.
 */

public class ece_talk_array {


    public List<String> title = new ArrayList<>();
    public List<String> description = new ArrayList<>();
    public List<Integer> prize = new ArrayList<>();
    public List<Integer> day = new ArrayList<>();
    public List<Integer> pk = new ArrayList<>();

    public String responses = "";


    public ece_talk_array() {

        this.title.add("GRAPHICAL WATER DISPLAY");
        this.title.add("LIGHT SHOW");
        this.title.add("COLLEGE RADIO");
        this.title.add("ROBOT");

        //--------------------------------------------------

        this.description.add("Hola!!!! Ever chewed over if water droplets could convey graphical forms," +
                "logos and words with remarkable clarity??\n" +
                "Well, get away all your perplexities and have a birds eye view over our GRAPHICAL " +
                "WATERFALLS. Watch our illuminated water shapes sparkle and captivate!! Our exquisite" +
                " water falls await your advent! ");
        this.description.add("Invento 18' presents Evince de Dazzle that transports you to a new " +
                "world of modern day ignis fatuus. This picturesque luminous show vivifies the " +
                "cavernous depths of your imagination. Watch our nation, the cradle of human race " +
                "come into life with radiant vibes amid the gloom that's been encircling our cosmos." +
                " Venture into the intriguing possibility of conquering the fury of darkness and " +
                "bring forth the effulgence of undying light.\n" +
                "Get ready to set ablaze your imagination in the forthcoming symphony of lights. " +
                "Allume tes rÃªves.");
        this.description.add("RADIO");
        this.description.add("WALLIE");

        //--------------------------------------------------

        this.prize.add(0);
        this.prize.add(0);
        this.prize.add(0);
        this.prize.add(0);

        //--------------------------------------------------

        this.day.add(1);
        this.day.add(1);
        this.day.add(2);
        this.day.add(2);

        //--------------------------------------------------

        this.pk.add(16);
        this.pk.add(35);
        this.pk.add(72);
        this.pk.add(73);

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