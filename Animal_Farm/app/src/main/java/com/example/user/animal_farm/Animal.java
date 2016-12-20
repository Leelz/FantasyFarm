package com.example.user.animal_farm;

/**
 * Created by user on 18/12/2016.
 */
public abstract class Animal {

    private String name;
    public int energy;
    public String animalType;

    public Animal(String name, String animalType){
        this.name = name;
        this.energy = 100;
        this.animalType = animalType;
    }

    public int getEnergy() {
        return energy;
    }

    public String getName() {
        return name;
    }

    public boolean bellyFull(){
        return this.energy >= 100;
    }

    public String spendEnergy(){
        if(this.energy >= 9) {
            this.energy -= 10;
        }
        return "Cannot use any more energy";
    }

}
