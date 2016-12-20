package com.example.user.animal_farm;

/**
 * Created by user on 18/12/2016.
 */

import java.util.ArrayList;

public abstract class Enclosure {
    private EnclosureType type;
    private ArrayList<Animal> animalList;
//    private int enclosureID;

//    int EnclosureID
    public Enclosure(EnclosureType type){
        this.type = type;
        animalList = new ArrayList<>();
//        enclosureID = enclosureID;
    }

    //
    public EnclosureType getEnclosureType() {
        return this.type;
    }

    public ArrayList<Animal> getAnimalList() {
        return animalList;
    }

    //
    public void addAnimalToEnclosure(Animal animal) {
        animalList.add(animal);
    }


    public int numberOfAnimalsInEnclosure()    {
        return animalList.size();
    }

    //
    public Animal findAnimalByName(String searchName)   {
        String searchLower = searchName.toLowerCase();
        for (Animal animal : animalList){
            String animalName = animal.getName().toLowerCase();
            if (animalName.equals(searchLower)){
                return animal;
            }
        }
        return null;
    }

    //
    public int getAnimalIndex(Animal animal) {
        return animalList.indexOf(animal);
    }

    //
    public void removeAnimalByName(String searchName)    {
        Animal animal = findAnimalByName(searchName);
        int index = getAnimalIndex(animal);
        animalList.remove(index);
    }

    //
    public void removeAnimalByIndex(int index)   {
        animalList.remove(index);
    }
}

