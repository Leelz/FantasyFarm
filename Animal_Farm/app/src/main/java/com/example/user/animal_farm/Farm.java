package com.example.user.animal_farm;
import java.util.ArrayList;

/**
 * Created by user on 18/12/2016.
 */

public class Farm {

    private ArrayList<Enclosure> allEnclosures;
    private String name;


    public Farm(String name) {
        allEnclosures = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNewEnclosure(Enclosure enclosure)   {
        allEnclosures.add(enclosure);
    }

    public Enclosure selectEnclosureByIndex(int index){
        return allEnclosures.get(index);
    }

    public void removeEnclosureByIndex(int index)   {
        allEnclosures.remove(index);
    }

    public int numberOfEnclosuresInFarm()    {
        return allEnclosures.size();
    }

    /////

    public Animal getAnimal(Animal animal, Enclosure enclosure) {
        return enclosure.findAnimalByName(animal.getName());
    }

    public Animal canSellAnimal(Animal animal) {
        if (animal.age <= 1) {
            return animal;
        }
        return null;
    }

    public void sellAnimal(Farm farm, Farm farm2)   {
        farm.getAnimal(Animal animal, Enclosure enclosure)
        int index = enclosure.getANimal(animal);
    }



}

