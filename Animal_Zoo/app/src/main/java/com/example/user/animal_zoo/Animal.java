package com.example.user.animal_zoo;

/**
 * Created by user on 18/12/2016.
 */
public class Animal {

    String name;
    int hunger;
    int foodChainLevel;

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoodChainLevel() {
        return foodChainLevel;
    }

    public void setFoodChainLevel(int foodChainLevel) {
        this.foodChainLevel = foodChainLevel;
    }
}
