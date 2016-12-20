package com.example.user.animal_farm;

/**
 * Created by user on 19/12/2016.
 */
public class Cow extends Animal {

    public Cow(String name, String animalType, int age){
        super(name, animalType, age);
    }

    public String getAnimalType()   {
        return animalType;
    }

    public String Moo() {
        useEnergy();
        return "Moooooo";
    }
}
