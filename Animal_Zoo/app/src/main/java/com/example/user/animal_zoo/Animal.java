package com.example.user.animal_zoo;

/**
 * Created by user on 18/12/2016.
 */
public class Animal {

    String name;
    String animal;
    int hunger;
    int foodChainLevel;

    public Animal(String name, String animal, int FoodChainLevel){
        this.name = name;
        this.animal = animal;
        this.hunger = 50;
        this.foodChainLevel = foodChainLevel;
    }

    public int getHunger() {
        return hunger;
    }

    public String getName() {
        return name;
    }

    public int getFoodChainLevel() {
        return foodChainLevel;
    }


}
