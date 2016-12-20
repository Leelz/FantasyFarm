package com.example.user.animal_farm;

import java.util.ArrayList;

/**
 * Created by user on 19/12/2016.
 */
public class Field extends Enclosure  {

    private EnclosureType type;
    private int enclosureID;
    private ArrayList<Cow> cattleList;

    public Field(EnclosureType type, int enclosureID){
        super(type, enclosureID);
        cattleList = new ArrayList<>();
    }

    public Animal findAnimalByName(String searchName)   {
        String searchLower = searchName.toLowerCase();
        for (Animal animal : cattleList){
            String animalName = animal.getName().toLowerCase();
            if (animalName.equals(searchLower)){
                return animal;
            }
        }
        return null;
    }

    //
    public int getAnimalIndex(Animal animal) {
        return cattleList.indexOf(animal);
    }

    //
    public Animal removeAnimalByName(String searchName)    {
        Animal animal = findAnimalByName(searchName);
        int index = getAnimalIndex(animal);
        Animal removedAnimal = cattleList.remove(index);
        return removedAnimal;
    }

    //
    public void removeAnimalByIndex(int index)   {
        cattleList.remove(index);
    }

    //
    public void addAnimalToEnclosure(Cow cow) {
        cattleList.add(cow);
    }


    public int numberOfAnimalsInEnclosure()    {
        return cattleList.size();
    }

    //

}
