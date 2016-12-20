package com.example.user.animal_farm;

/**
 * Created by user on 19/12/2016.
 */
public class Chicken extends Animal implements Trampleable, Edible {

    public Chicken(String name, String animalType, int age){
        super(name, animalType, age);
    }

    public String getAnimalType()   {
        return animalType;
    }

    public String Squawk() {
        useEnergy();
        return "Squawwwwk";
    }
}

