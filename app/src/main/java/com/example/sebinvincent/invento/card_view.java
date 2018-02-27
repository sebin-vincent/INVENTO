package com.example.sebinvincent.invento;

/**
 * Created by sebin vincent on 21-02-2018.
 */

public class card_view {

    private  String head;
    private  String desc;
    private String image_url;
    private String venue;
    private String time;
    private String date;


    public card_view(String head, String desc, String image_url) {
        this.head = head;
        this.desc = desc;
        this.image_url = image_url;
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
}
