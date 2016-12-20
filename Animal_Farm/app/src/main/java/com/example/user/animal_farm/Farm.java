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

    //Enclosure Functions
    public void addNewEnclosure(Enclosure enclosure)   {
        allEnclosures.add(enclosure);
    }

    public Enclosure selectEnclosureByIndex(int index){
        return allEnclosures.get(index);
    }

    public Enclosure getEnclosureByID(int id){
        for( Enclosure enclosure : allEnclosures){
            if (enclosure.getEnclosureID() == id){
                return enclosure;
            }
        }
        return null;
    }

    public int numberOfEnclosuresInFarm()    {
        return allEnclosures.size();
    }

    public int getEnclosureIndex(Enclosure enclosure) {
        return allEnclosures.indexOf(enclosure);
    }

/// Adding Animals

    public void addCowToField(Cow cow, Field field){
        field.addAnimalToEnclosure(cow);
    }

    /////

    public Boolean canSellAnimal(Animal animal) {
        return animal.age <= 1;
    }

    public void sellCow(Farm farm2, Cow cow, Field field, Field field2)   {
        if (canSellAnimal(cow)) {
            Cow cowToSell = field.removeAnimal(cow);
            farm2.addCowToField(cowToSell, field2);
        }
    }


}

