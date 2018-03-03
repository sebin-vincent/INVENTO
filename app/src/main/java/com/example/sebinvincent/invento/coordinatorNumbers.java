package com.example.sebinvincent.invento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anoop on 3/3/18.
 */

public class coordinatorNumbers {

    public List<String> Name=new ArrayList<>();
    public List<String> Number=new ArrayList<>();

    public coordinatorNumbers() {

        this.Name.add("CODE RELAY");
        this.Name.add("ENIGMA");
        this.Name.add("BAROQUE");
        this.Name.add("INSPECTRA");


        //-----------------------------------------------------------

        this.Number.add("8289820401");
        this.Number.add("8943452113");
        this.Number.add("8281870445");
        this.Number.add("8156938271");



    }

    public int getLength(){

        return Name.size();
    }
    public String getName(int i){

        return Name.get(i);
    }
    public String getNumber(int i){

        return Number.get(i);
    }
}
