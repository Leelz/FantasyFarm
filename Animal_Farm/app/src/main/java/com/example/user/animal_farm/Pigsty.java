package com.example.user.animal_farm;

import java.util.ArrayList;

/**
 * Created by user on 19/12/2016.
 */
public class Pigsty extends Enclosure {
    private EnclosureType type;
    private ArrayList<Pig> pigList;

    public Pigsty(EnclosureType type){
        super(type);
        pigList = new ArrayList<>();
    }


}
