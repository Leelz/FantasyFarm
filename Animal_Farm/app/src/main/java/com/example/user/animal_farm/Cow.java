package com.example.user.animal_farm;

/**
 * Created by user on 19/12/2016.
 */
public class Cow extends Animal {

    String animalType;

    public Cow(String name, String animalType){
        super(name, animalType);
    }

    public String getAnimalType()   {
        return animalType;
    }
}
