package com.example.sebinvincent.invento;


public class DataModel {


    String name;
    String email;
    String version;
    int id_;
    int image;

    public DataModel(String name, String version, int id_, int image,String email) {
        this.name = name;
        this.version = version;
        this.id_ = id_;
        this.image=image;
        this.email=email;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


    public String getVersion() {
        return version;
    }

    public int getImage() {
        return image;
    }

    public int getId() {
        return id_;
    }
}