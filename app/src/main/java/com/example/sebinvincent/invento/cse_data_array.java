package com.example.sebinvincent.invento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anoop on 2/28/18.
 */

public class cse_data_array {

    public List<String> programs=new ArrayList<>();
    public List<String> names=new ArrayList<>();
    public List<String> prize=new ArrayList<>();


    public cse_data_array() {

        this.names.add("Captain America");
        this.names.add("Iron Man");
        this.names.add("Wolvarine");
        this.names.add("Spiderman");
        this.names.add("Thor");





        this.programs.add("Steven Rogers was born in the Lower East Side " +
                "of Manhattan, New York City, in 1925 to poor Irish immigrants, " +
                "Sarah and Joseph Rogers.[54] Joseph died when Steve was a child, " +
                "and Sarah died of pneumonia while Steve was a teen. By early 1940," +
                " before America's entry into World War II, Rogers is a tall, scrawny " +
                "fine arts student specializing in illustration and a comic book writer " +
                "and artist.");

        this.programs.add("Anthony Edward Stark, the son of wealthy industrialist and head " +
                "of Stark Industries, Howard Stark, and Maria Stark. A boy genius, he enters" +
                " MIT at the age of 15 to study electrical engineering and later receives " +
                "master's degrees in electrical engineering and physics. After his parents " +
                "are killed in a car accident, he inherits his father's company.");

        this.programs.add("Wolverine was born James Howlett in northern Alberta, Canada, during" +
                " the late 1880s, purportedly to rich farm owners John and Elizabeth Howlett," +
                "[27] though he is actually the illegitimate son of the Howletts' groundskeeper," +
                " Thomas Logan.[28] After Thomas is thrown off the Howletts' property for an " +
                "attempted rape perpetrated by his other son, named simply Dog, he returns to " +
                "the Howlett manor and kills John Howlett. In retaliation, young James kills " +
                "Thomas with bone claws that emerge from the back of his hands, as his mutation " +
                "manifests.[29] He flees with his childhood companion, Rose, and grows into " +
                "manhood on a mining colony in the Yukon, adopting the name \\\"Logan\\\".[30] " +
                "When Logan accidentally kills Rose with his claws, he flees the colony and " +
                "lives in the wilderness among wolves,[31] until he is captured and placed in a " +
                "circus.[32] Saul Creed, brother of Victor Creed, frees Logan, but after he" +
                " betrays Logan and Clara Creed to Nathaniel Essex, Logan drowns Creed in " +
                "Essex's potion.[33] Logan returns to civilization, residing with the Blackfoot " +
                "people. Following the death of his Blackfoot lover, Silver Fox, at the hands " +
                "of Victor Creed, now known as Sabretooth,[34] he is ushered into the Canadian " +
                "military during World War I. Logan spends time in Madripoor before settling " +
                "in Japan, where he marries Itsu and has a son, Daken. Logan is unaware of his" +
                " son for many years.");
        this.programs.add("In Forest Hills, Queens, New York,[43] Midtown High School student" +
                " Peter Parker is a science-whiz orphan living with his Uncle Ben and Aunt May." +
                " As depicted in Amazing Fantasy #15 (Aug. 1962), he is bitten by a radioactive" +
                " spider (erroneously classified as an insect in the panel) at a science exhibit" +
                " and \\\"acquires the agility and proportionate strength of an arachnid\\\".[44] Along with super strength, " +
                "Parker gains the ability to adhere to walls and ceilings. Through his native knack for " +
                "science, he develops a gadget that lets him fire adhesive webbing of his own design through" +
                " small, wrist-mounted barrels.");
        this.programs.add("Thor's father Odin decides his son needed to be " +
                "taught humility and consequently places Thor (without memories of " +
                "godhood) into the body and memories of an existing, partially disabled " +
                "human medical student, Donald Blake.[52] After becoming a doctor and on " +
                "vacation in Norway, Blake witnesses the arrival of an alien scouting party. " +
                "Blake flees from the aliens into a cave. After discovering Thor's hammer" +
                " Mjolnir (disguised as a walking stick) and striking it against a rock, " +
                "he transforms into the thunder god.[53] Later, in Thor #159, Blake is " +
                "revealed to have always been Thor, Odin's enchantment having caused him " +
                "to forget his history as The Thunder God and believe himself mortal.");

    }
    public int getLength(){

        return programs.size();
    }
    public String getProgram(int i){

        return programs.get(i);
    }
    public String getNmaes(int i){

        return names.get(i);
    }
}
