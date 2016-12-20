package com.example.user.animal_farm;

import java.util.ArrayList;

/**
 * Created by user on 19/12/2016.
 */

public class Farmer {

    public Farmer() {
    }

    public void feedAnimal(Animal animal){
        if(animal.bellyFull()) return;
        int energy = animal.getEnergy();
        energy += 10;
    }


}


