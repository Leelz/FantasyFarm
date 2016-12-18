package com.example.user.animal_zoo;

/**
 * Created by user on 18/12/2016.
 */
public class Animal {

    String name;
    String animalType;
    int hunger;
    int foodChainLevel;

    public Animal(String name, String animalType, int foodChainLevel){
        this.name = name;
        this.animalType = animalType;
        this.hunger = 100;
        this.foodChainLevel = foodChainLevel;
    }

    public int getHunger() {
        return hunger;
    }

    public String getName() {
        return name;
    }

    public String getAnimalType()   { return animalType; }

    public int getFoodChainLevel() {
        return foodChainLevel;
    }


}
