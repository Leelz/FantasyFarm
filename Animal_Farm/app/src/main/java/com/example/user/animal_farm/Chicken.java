package com.example.user.animal_farm;

/**
 * Created by user on 19/12/2016.
 */
public class Chicken extends Animal implements Trampleable, Edible {

    public Chicken(String name, String animalType){
        super(name, animalType);
    }

    public String getAnimalType()   {
        return animalType;
    }

    public String fly() {
        spendEnergy();
        return "I do not like to fly in this enclosure, I want to be free!";
    }
}

