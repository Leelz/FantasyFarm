package com.example.user.animal_farm;

import java.util.ArrayList;

/**
 * Created by user on 19/12/2016.
 */
public class Coop extends Enclosure {
    private EnclosureType type;
    private ArrayList<Chicken> chickenList;

    public Coop(EnclosureType type){
        super(type);
        chickenList = new ArrayList<>();
    }



}

