package Farm;

import java.util.ArrayList;

/**
 * Created by user on 18/12/2016.
 */
public abstract class Animal {

    private String name;
    public int energy;
    public String animalType;
    public int age;

    public Animal(String name, String animalType, int age){
        this.name = name;
        this.energy = 100;
        this.animalType = animalType;
        this.age = age;
    }

    //
    public String getAnimalType()   {
        return animalType;  }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    //
    public String getName() {
        return name;
    }


    public boolean bellyFull(){
        return this.energy >= 100;
    }

    public String useEnergy(){
        if(this.energy >= 9) {
            this.energy -= 10;
        }
        return "Cannot use any more energy";
    }

    public void eat() {
        if (!bellyFull()){
            this.energy += 10;
        }
    }


}
