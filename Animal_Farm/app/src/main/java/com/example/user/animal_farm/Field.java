package com.example.user.animal_farm;

import java.util.ArrayList;

/**
 * Created by user on 19/12/2016.
 */
public class Field extends Enclosure  {

    private EnclosureType type;
    private ArrayList<Cow> cattleList;

    public Field(EnclosureType type){
        super(type);
        cattleList = new ArrayList<>();
    }


}
