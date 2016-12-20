package com.example.user.animal_farm;

/**
 * Created by user on 19/12/2016.
 */
public class Pig extends Animal implements Trampleable {

    String animalType;

    public Pig(String name, String animalType, int age){
        super(name, animalType, age);
    }

    public String Oink() {
        useEnergy();
        return "Oiiiiink";
    }



}
