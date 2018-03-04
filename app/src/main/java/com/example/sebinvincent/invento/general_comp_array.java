package com.example.sebinvincent.invento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 04-03-2018.
 */

public class general_comp_array {

    public List<String> title = new ArrayList<>();
    public List<String> description = new ArrayList<>();
    public List<Integer> prize = new ArrayList<>();
    public List<Integer> day = new ArrayList<>();
    public List<Integer> pk = new ArrayList<>();

    public String responses = "";


    public general_comp_array() {

        this.title.add("BATTLE OF BANDS");
        this.title.add("INFOCUS PAPER PRESENTATION");
        this.title.add("PROJECT EXPO");
        this.title.add("NATYA");
        this.title.add("GENERAL QUIZ");
        this.title.add("GEC ROADIES");
        this.title.add("EL EMPERADOR");

        //--------------------------------------------------

        this.description.add("Battle of bands");
        this.description.add("Voila techies...It's time to fill your arteries with ideas!! IEEE SB " +
                "GEC Palakkad presents you a platform to express yourself,portray your views,explore" +
                " your ideas and make the best Paper Presentation ever and  bag â\u0082¹10k!! And who" +
                " knows?? Your ideas could make a breakthrough in the history of technology..ð\u009F\u0098\u0089\n" +
                "IEEE Certificates will be provided to the participants\n" +
                "RULES AND REGULATIONS\n" +
                "*The paper must be in IEEE format\n" +
                "*Maximum of two members per team is allowed.\n" +
                "*Maximum of two members per team is allowed.\n" +
                "*Inter college teams are allowed to present paper.\n" +
                "*Time is limited. There will be 10 minutes for presentation and 5 minutes for queries\n" +
                "*Medium of communication should be in English\n" +
                "*Abstract should be sent to the email address invento18paper@gmail.com on or before 07/03/18\n" +
                "*Spot entries are not allowed.\n" +
                "*Selected participants will be informed and must bring two hard copies of documentation\n" +
                "*Paper presentation is conducted as a general event. It is not on the basis of branches\n" +
                "*Participants can select any advanced topics \n" +
                "*Only a projector will be provided. Other required equipment is to be brought by the participant.\n" +
                "*All participants must carry their identity card.");
        this.description.add("Engineering is the closest thing to magic that exists in this world. " +
                "IEEE SB GEC Palakkad in association with Team Invento '18 brings you a unique platform" +
                " to redesign your intellectual thoughts. The Project Expo 2k18.\n" +
                "This event is going to be an exemplary platform which let the cagey engineers to put" +
                " their brain beyond the precincts of the technology. It's your turn now...Think out" +
                " of the box. Come and explore.......\n" +
                "RULES AND REGULATIONS\n" +
                "#Competition will be conducted in 2 categories:\n" +
                "1. Circuit\n" +
                "2. Non-Circuit \n" +
                "#The team may consist of maximum 5 members. \n" +
                "#The abstract should be mailed to invento18project@gmail.com (Last Date:  12nd March). \n" +
                "#Any requirements such as plug points, projectors, computers etc. must be communicated" +
                " to the coordinators in prior. \n" +
                "#Judges' decision will be final.");
        this.description.add("Have you ever noticed that the vibrant moves and the magic of tantamount" +
                " steps leave us in great despair. No! not at all! The myriad of dance forms have always" +
                " astonished us with their beauty and culture.\n" +
                "So here is a chance to display your talents and take us to the peak of ecstasy.Bring" +
                " out your deepest emotions and etch your name through our dance fest NATYA. Reveal" +
                " the mystery that dance conceals and unleash the hidden language of your body and soul" +
                " by whipping a potion of passion, talent, precision, and synchronization. Choose your" +
                " own style to charm us with your amazing skill and dance your way to victory.\n" +
                "RULES\n" +
                "1)Only one team is allowed from each college.\n" +
                "2)The time limit is 10-15 minutes for each team including stage preparations.\n" +
                "3)Each team can include about 7-20 members\n" +
                "4)The vulgarity of any form is strictly prohibited.\n" +
                "5)Usage of other properties or equipment will be awarded bonus points \n" +
                "6)Usage of dangerous materials such as flame, fluid etc is strictly prohibited.Â \n" +
                "7)The soundtrack is to be submitted in mp3 format. \n" +
                "8)Each member must carry a valid college id card.Â\n" +
                "9)The decision of the judges will be final.");
        this.description.add("\"Liberty cannot be preserved without general knowledge among the people.\"\n" +
                "Quiz competition is a pursuit of trivial Knowledge, encourage students to achieve " +
                "academic excellence and Increase their awareness of the world around them.\n" +
                "It actually tests studentâ\u0080\u0099s retention and accumulation of knowledge in " +
                "a real-life situation also encourages independent study and academic excellence, " +
                "recognize and appreciate non-traditional values for competition.\n" +
                "We bring you an opportunity to test your general knowledge and build self-esteem and pride.\n" +
                "Come and join us for this test of your knowledge and win Exciting prizes.");
        this.description.add("Do you dare yourself to take on the ultimate battle of guts?\n" +
                "Are you ready to say 'YES' to the next adventure?\n" +
                "Then Let's Begin with a Bang!!\n" +
                "GEC Roadies is coming here looking for you.\n" +
                "\"You are your own superhero. Reveal that you still stand strong. And grab a prize worth 10K.â\u0080\u009D");
        this.description.add("Whatâ\u0080\u0099s common between Steve Jobs, Ratan Tata and a Mother?\n" +
                "They are all great managersâ\u0080¦.\n" +
                "Management is doing things right; Leadership is doing the right things.\n" +
                "If you have what it takes to lead these managers, Then here is your chance to " +
                "showcase your managerial competency skills and take home prizes worth 15k.\n" +
                "Here passion meets Beauty, Brain and Brawnâ\u0080¦..\n" +
                "Beat the three Bâ\u0080\u0099s and be the next El Emperador");

        //--------------------------------------------------

        this.prize.add(0);
        this.prize.add(10000);
        this.prize.add(15000);
        this.prize.add(50000);
        this.prize.add(3000);
        this.prize.add(10000);
        this.prize.add(10000);

        //--------------------------------------------------

        this.day.add(1);
        this.day.add(2);
        this.day.add(2);
        this.day.add(1);
        this.day.add(1);
        this.day.add(2);
        this.day.add(2);

        //--------------------------------------------------

        this.pk.add(3);
        this.pk.add(65);
        this.pk.add(66);
        this.pk.add(43);
        this.pk.add(40);
        this.pk.add(38);
        this.pk.add(41);

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
