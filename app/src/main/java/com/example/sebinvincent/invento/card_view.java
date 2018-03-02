package com.example.sebinvincent.invento;

/**
 * Created by sebin vincent on 21-02-2018.
 */

public class card_view {

    private  String head;
    private  String desc;
    private String image_url;

    private int prize;
    private int day;
    private int pk;

    private String time;


    public card_view(String head, String desc, String image_url,int prize,int day,int pk) {
        this.head = head;
        this.desc = desc;
        this.image_url = image_url;

        this.prize=prize;
        this.day=day;
        this.pk=pk;

    }

    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }

    public String getImage_url() {
        return image_url;
    }

    public int getPrize(){return prize;}
    public int getDay(){return day;}
    public int getPk(){return pk;
    }
}
