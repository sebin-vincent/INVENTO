package com.example.sebinvincent.invento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 04-03-2018.
 */

public class mech_comp_array {

    public List<String> title = new ArrayList<>();
    public List<String> description = new ArrayList<>();
    public List<Integer> prize = new ArrayList<>();
    public List<Integer> day = new ArrayList<>();
    public List<Integer> pk = new ArrayList<>();

    public String responses = "";


    public mech_comp_array() {

        this.title.add("MR. CAD");
        this.title.add("AQUA ROCKET");
        this.title.add("THE MECHANIC");
        this.title.add("LATHE MASTER");
        this.title.add("AUTO QUIZ");
        this.title.add("ROBO RACE");
        this.title.add("MUD RACE");

        //--------------------------------------------------

        this.description.add("description: â\u0080\u0098â\u0080\u0099Design is not just what it looks" +
                " like and feel like design is how it worksâ\u0080\u0099â\u0080\u0099\n" +
                "                                                                                                      STEVE JOBS\n" +
                "The search for the ultimate machine designer has propelled. We prove you, the most " +
                "interesting description and transform simple dimension into a structure of machinery\n" +
                "#Join the design hunt\n" +
                "#be the Mr. CAD");
        this.description.add("Aqua Rocket\n" +
                "Flying into mystery and bringing forth history to the deep caverns of water, aqua " +
                "rockets captures our attention. Here is a platform forÂ  the aqua pura trajectile " +
                "enthusiasts, to model a lasting water rocket that can overcome the fury of water.");
        this.description.add("To check your maniac intense on here we have THE MECHANIC organized by" +
                " mechanical department of GEC SKP. Let us know how much you know about motorcycle. " +
                "Each team will be given the task of assembling of parts involving collaboration of " +
                "high skill and patience. Donâ\u0080\u0099t miss the chance to be a real engineer.");
        this.description.add("LATHE MASTER\n" +
                "Tired of using the conventional stuffs?? Wanna build a better mouse trap?\n" +
                "Hurray!!! You are the best case scenario !!!\n" +
                "LATHE MASTER session of invento 18 let  you have stunning control over the lathe " +
                "machine and design bang-up products!!\n" +
                "Awaken the machining master in you, fiddle with your lathe and fill your pockets " +
                "with prizes worth 6k!!!\n");
        this.description.add("A smooth sea never made a skillful sailor. Itâ\u0080\u0099s a battle of" +
                " skillful sailors, the competition involving the acceleration of the development of" +
                " automobile. We present the quirky and most interesting event, AUTO QUIZ.\n" +
                "Get ready to test your auto quotient and prove the world that you are a born autoholic.");
        this.description.add("As a part of INVENTO 2K18 , Mechanical Department of GEC SKP is organizing" +
                " a ROBORACE under the tagline â\u0080\u0098â\u0080\u0099 obstacles arenâ\u0080\u0099t" +
                " road blocks they are simple steeping stonesâ\u0080\u0099â\u0080\u0099. ROBORACE is" +
                " a simple and entry level robotics competition where couple of robots compete with " +
                "each other in speed and accurate control. Scoop your brain to create your monster " +
                "on track to win a prize of 15k.");
        this.description.add("If mud ainâ\u0080\u0099t flying, you ainâ\u0080\u0099t trying.\n" +
                "An event for cycling enthusiasts is being made by the Mechanical Department of GEC SKP.\n" +
                "A peek into the unknown track and the fastest finisher set as the title winner\n" +
                "Accept the challenge and be the winner. The mud will wash off, but memories lasts for a lifetime.\n" +
                "#meet the moment\n" +
                "#bicycle mud race");

        //--------------------------------------------------

        this.prize.add(6000);
        this.prize.add(7000);
        this.prize.add(7000);
        this.prize.add(6000);
        this.prize.add(3000);
        this.prize.add(15000);
        this.prize.add(7000);

        //--------------------------------------------------

        this.day.add(3);
        this.day.add(1);
        this.day.add(2);
        this.day.add(2);
        this.day.add(2);
        this.day.add(3);
        this.day.add(1);

        //--------------------------------------------------

        this.pk.add(10);
        this.pk.add(45);
        this.pk.add(44);
        this.pk.add(18);
        this.pk.add(7);
        this.pk.add(21);
        this.pk.add(47);

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
