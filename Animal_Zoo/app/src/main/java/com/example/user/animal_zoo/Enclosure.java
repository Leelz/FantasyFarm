package com.example.user.animal_zoo;

/**
 * Created by user on 18/12/2016.
 */

import java.util.ArrayList;

public class Enclosure {
    private String type;
    private ArrayList<Animal> animals;

    public Enclosure(String type){
        this.type = type;
        animals = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public void addAnimalToEnclosure(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimalFromEnclosure(Animal animal)    {

    }

    public void numberOfAnimalsInEnclosure()    {
        animals.size();
    }

    public Animal findAnimalByName(String searchName) throws NullStringException{
        if (searchName == null){
            throw new NullStringException("Cannot search for a pet with null instead of a name String");
        }
        String searchLower = searchName.toLowerCase();
        for (Animal animal : animals){
            String animalName = animal.getName().toLowerCase();
            if (animalName.equals(searchLower)){
                return animal;
            }
        }
        return null;
    }


}

