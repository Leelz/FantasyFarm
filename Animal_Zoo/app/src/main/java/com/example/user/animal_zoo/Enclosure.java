package com.example.user.animal_zoo;

/**
 * Created by user on 18/12/2016.
 */

import java.util.ArrayList;

public class Enclosure {
    private EnclosureType type;
    private ArrayList<Animal> animalList;

    public Enclosure(EnclosureType type){
        this.type = type;
        animalList = new ArrayList<>();
    }

    public EnclosureType getEnclosureType() {
        return this.type;
    }

    public void addAnimalToEnclosure(Animal animal) {
        animalList.add(animal);
    }

    public ArrayList<Animal> getAnimalsList() {
        return animalList;
    }

    public int numberOfAnimalsInEnclosure()    {
        return animalList.size();
    }


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

    public int getAnimalPosition(Animal animal) {
        return animalList.indexOf(animal);
    }

    public void removeAnimalByName(String searchName)    {
        Animal animal = findAnimalByName(searchName);
        int index = getAnimalPosition(animal);
        animalList.remove(index);
    }

    public void removeAnimalByIndex(int index)   {
        animalList.remove(index);
    }
}

//throws NullStringException{
//        if (searchName == null){
//        throw new NullStringException("Cannot search for a pet with null instead of a name String");
//        }

