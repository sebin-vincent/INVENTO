package com.example.sebinvincent.invento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 04-03-2018.
 */

public class eee_comp_array {


    public List<String> title = new ArrayList<>();
    public List<String> description = new ArrayList<>();
    public List<Integer> prize = new ArrayList<>();
    public List<Integer> day = new ArrayList<>();
    public List<Integer> pk = new ArrayList<>();

    public String responses = "";


    public eee_comp_array() {

        this.title.add("ALOHOMORA");
        this.title.add("GRAND MASTER");
        this.title.add("ULTIMATE ENGINEER");
        this.title.add("BLITZKRIEG");

        //--------------------------------------------------

        this.description.add("To all the aspirants in the arena of EEE,Welcome All !!!!\n" +
                "We have few challenges lined up for you.....We are ready with the tasks.." +
                "If you have it to win it...then,Bring it on !!!!!\n" +
                "RULES AND REGULATIONS\n" +
                "* The event comprises of 2 rounds\n" +
                "*  Team of 3 members is mandatory\n" +
                "*  No electronic gadgets are allowed\n" +
                "*  Teams need to submit their entries online before the deadline\n" +
                "*  Spot Registration will be available,if necessary.\n" +
                "Round 1:   PRELIMS\n" +
                "                       It mainly emphasizes on the basic knowledge about electrical" +
                " and electronics related topics.Question booklet will be provided to each team," +
                "comprising  MCQ and other relevant interpretation problems.No negative marks.Team " +
                "with least marks will be eliminated.\n" +
                "Round  2:\n" +
                "                      Technical cross words will be provided to each team.Those top\n" +
                " teams completing successfully in minimum time will be eligible for finals.\n" +
                "The teams with shortest time for completion will move forward to the finals.");
        this.description.add("Survival of the fittest...Darvin's theory of evolution is put to test....\n" +
                "If you are one of those crowd pullers,who are insanely good at Manipulating and Charming" +
                " the crowd, along with a sound mind and quick wits....Then this is for you....\n" +
                "The Master of masters,The Grand MAster is a title for the Champion who prove " +
                "himself/herself in series of physical,intellectual and psychological rounds....\n" +
                "Be there.....!!!!");
        this.description.add("NO DESCRIPTION");
        this.description.add("Electrical skills are often labelled easy,yet an uncharted arena...\n" +
                "So EEE department of GEC Palakkad presents you with the ultimate circuit race..\n" +
                "Are you a skilled Electrician..??Do You think you have what it takes to wire the \n" +
                "heck out of circuits and come out as champions???\n" +
                "If you are confident in your firm hands and working tester,then this is for you...\n" +
                "The Ultimate wiring competition...\n" +
                "The fastest team to solve the clues,figure out the circuit and show the output,gets" +
                " to take home prize worth 3K.Team. Each team consist of two participants.");

        //--------------------------------------------------

        this.prize.add(3000);
        this.prize.add(6000);
        this.prize.add(10000);
        this.prize.add(3000);

        //--------------------------------------------------

        this.day.add(2);
        this.day.add(2);
        this.day.add(2);
        this.day.add(1);

        //--------------------------------------------------

        this.pk.add(56);
        this.pk.add(58);
        this.pk.add(46);
        this.pk.add(53);

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
