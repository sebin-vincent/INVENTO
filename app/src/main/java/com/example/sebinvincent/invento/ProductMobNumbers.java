package com.example.sebinvincent.invento;


/**
 * Created by anoop on 9/10/16.
 */
//import java.util.List;

public class ProductMobNumbers {

    private int id;
    private String name;
    private String time;

    //constructor


    public ProductMobNumbers(int id, String name, String time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }

    //setter,getter


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
