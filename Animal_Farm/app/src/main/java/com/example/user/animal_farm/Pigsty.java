package com.example.user.animal_farm;

import java.util.ArrayList;

/**
 * Created by user on 19/12/2016.
 */
public class Pigsty extends Enclosure {
    private ArrayList<Pig> pigList;

    public Pigsty(EnclosureType type, int enclosureID){
        super(type, enclosureID);
        pigList = new ArrayList<>();
    }

    public void addAnimalToEnclosure(Pig pig) {
        pigList.add(pig);
    }

    public int getSize(){
        return pigList.size();
    }

    public void removeAnimal(Pig pig){
        pigList.remove(pig);
    }

    public Animal findAnimalByName(String searchName)   {
        String searchLower = searchName.toLowerCase();
        for (Animal animal : pigList){
            String animalName = animal.getName().toLowerCase();
            if (animalName.equals(searchLower)){
                return animal;
            }
        }
        return null;
    }


    public int getAnimalIndex(Animal animal) {
        return pigList.indexOf(animal);
    }

    public Animal removeAnimalByName(String searchName)    {
        Animal animal = findAnimalByName(searchName);
        int index = getAnimalIndex(animal);
        Animal removedAnimal = pigList.remove(index);
        return removedAnimal;
    }
}
