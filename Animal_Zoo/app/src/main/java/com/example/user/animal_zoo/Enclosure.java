package com.example.user.animal_zoo;

/**
 * Created by user on 18/12/2016.
 */

import java.util.ArrayList;

public class Enclosure {
    private String type;
    private ArrayList<Animal> animals;

    public Enclosure(String type){
        this.type = type;
        animals = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

}

