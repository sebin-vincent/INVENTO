package com.example.sebinvincent.invento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 04-03-2018.
 */

public class ece_comp_array {

    public List<String> title=new ArrayList<>();
    public List<String> description=new ArrayList<>();
    public List<Integer> prize=new ArrayList<>();
    public List<Integer> day=new ArrayList<>();
    public List<Integer> pk=new ArrayList<>();

    public  String responses="";


    public ece_comp_array() {

        this.title.add("CRUSADE 3.0");
        this.title.add("QUADRA 2.0");
        this.title.add("AERIAL ENVISION 2.0");
        this.title.add("FOLLOW ME 3.0");
        this.title.add("LOGICA");
        this.title.add("ARDUINALIN");
        this.title.add("TANGLE");
        this.title.add("ARDUINO GAMES");
        this.title.add("ILLUMINA");
        this.title.add("GAMING ZONE");
        this.title.add("DO YOU KNOW B B ROY");
        this.title.add("SOLDRON");
        this.title.add("ROBOWAR");

        //--------------------------------------------------

        this.description.add("Aloha folks!!!!!  The wait is over!!!!\n" +
                "Obliviate the kiddy squabbles and petty conflicts! Energize yourself to witness our" +
                " mighty robos wage against the robots of other squads in combat.. As we sharpen our" +
                " fly wheels,bar spinners and circular saws, book your spectatorship to perceive the" +
                " biggest robo war in the history of GEC PKD!!!\n" +
                "Oh yeah!!! Let's invento.");
        this.description.add("Goal that's right it's time for the exigent and energizing game of all" +
                " times,Soccer to be played by the best of our players. And those players are Invento's" +
                " very own..... Robots!!! Be hypnotized and staggered by the immense talent that these" +
                " robots posses at playing a game so complex and strenous. Invento18 is paving way to the" +
                " grant season of RoboSoccer  litting off on March.");
        this.description.add("Invento18 reintroduces the rivalry of flying machines on March 17 where" +
                " drones of indisputable design compare against each other to get hold of the ultimate" +
                " prize and honour. Thousands are joining us to be a part of this vigorous awe striking" +
                " experience. Come lets fly miles with the exclusive DRONE PARKING, only on Invento.");
        this.description.add("Languid and listless??\n" +
                " None to follow your roads???\n" +
                "Hola folks!!! Time to bid cheerio to all monotones cuz invento 18 is at hand!! U name" +
                " it; we have it!!!\n" +
                "Ever wondered if u can get someone to stride along the trails you opt!? If yes, u r at " +
                "the infalliable piaza!!!\n" +
                "Watch our stunning robots pace past the paths prescribed with precision and chivalry...\n" +
                "Watch our stunning robots pace past the paths prescribed with precision and chivalry...");
        this.description.add("logica");
        this.description.add("An exhilarating opportunity to marvel your senses, an enigmatic contention" +
                " that spells the techno enthusiasts into a cutting edge creativity. Here is Arduinaline" +
                " which envisages creating a circuit utilizing Arduino, every technological tinkerer's" +
                " unsung friend that transforms unchartered designs into reality. Join hands to test" +
                " the untested, innovate a dragon of mystery and most of all incite your adrenaline.");
        this.description.add("TANGLE");
        this.description.add("Tired of the traditional games???\n" +
                "Wanna take a stab at something cooler than the classic snake&ladder or the hide&seek???\n" +
                "Hurray!!!!! You are at the perfect plaza!!! Invento 18 puts forth an astounding collection\n" +
                " of some super cool ardino games!!! Hurry up gamers! 500+ contestants are already in the queue !!!\n" +
                "C'mon, participate ,use your wits and bag frabjous prizes");
        this.description.add("ILLUMINA");
        this.description.add("GAMING ZONE");
        this.description.add("B B ROY");
        this.description.add("SOLDRON");
        this.description.add("ROBOWAR");

        //--------------------------------------------------

        this.prize.add(30000);
        this.prize.add(15000);
        this.prize.add(15000);
        this.prize.add(3000);
        this.prize.add(3000);
        this.prize.add(3000);
        this.prize.add(3000);
        this.prize.add(1500);
        this.prize.add(1500);
        this.prize.add(1500);
        this.prize.add(1500);
        this.prize.add(3000);
        this.prize.add(30000);

        //--------------------------------------------------

        this.day.add(2);
        this.day.add(3);
        this.day.add(2);
        this.day.add(2);
        this.day.add(1);
        this.day.add(2);
        this.day.add(2);
        this.day.add(1);
        this.day.add(1);
        this.day.add(1);
        this.day.add(1);
        this.day.add(2);
        this.day.add(2);

        //--------------------------------------------------

        this.pk.add(6);
        this.pk.add(27);
        this.pk.add(24);
        this.pk.add(32);
        this.pk.add(74);
        this.pk.add(20);
        this.pk.add(67);
        this.pk.add(12);
        this.pk.add(68);
        this.pk.add(69);
        this.pk.add(70);
        this.pk.add(71);
        this.pk.add(54);

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
