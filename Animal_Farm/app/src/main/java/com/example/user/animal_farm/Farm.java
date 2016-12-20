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

    public Enclosure getEnclosureName(String name){
        for( Enclosure enclosure : allEnclosures){
            if (enclosure.getEnclosureType() == type){
                return enclosure;
            }

        }
        return null;
    }

    public int numberOfEnclosuresInFarm()    {
        return allEnclosures.size();
    }

    ////



    public void addAnimaltoMysticalAnimals(MysticalAnimal animal){
        mysticalAnimals.add(animal);
    }

    public void removeAnimalFromMysticalAnimals(MysticalAnimal animal){
        mysticalAnimals.remove(animal);
    }

    public void addAnimalToEnclosures(String name, Mermeid mermeid){
        PoolEnclosure enclosure = (PoolEnclosure)getEnclosureName(name);
        enclosure.addAnimal(mermeid);
    }

    public void addAnimalToEnclosures(String name, Unicorn unicorn){
        UnicornFenceEnclosure enclosure = (UnicornFenceEnclosure )getEnclosureName(name);
        enclosure.addAnimal(unicorn);
    }

    public void addAnimalToEnclosures(String name, Dragon dragon){
        DragonFenceEnclosure enclosure = (DragonFenceEnclosure)getEnclosureName(name);
        enclosure.addAnimal(dragon);
    }

    public void removeAnimalsFromEnclosures(String name, Mermeid mermeid){
        PoolEnclosure enclosure = (PoolEnclosure)getEnclosureName(name);
        enclosure.removeAnimal(mermeid);
    }

    public void removeAnimalsFromEnclosures(String name, Unicorn unicorn){
        UnicornFenceEnclosure enclosure = (UnicornFenceEnclosure )getEnclosureName(name);
        enclosure.removeAnimal(unicorn);
    }


    public void removeAnimalsFromEnclosures(String name, Dragon dragon){
        DragonFenceEnclosure enclosure = (DragonFenceEnclosure)getEnclosureName(name);
        enclosure.removeAnimal(dragon);
    }

    /////

    public Animal canSellAnimal(Animal animal) {
        if (animal.age <= 1) {
            return animal;
        }
        return null;
    }

    public Animal removeAnimalFromEnclosure(Animal animal, Enclosure enclosure) {
        return enclosure.removeAnimalByName(animal.getName());
    }


    public void sellCow(Farm farm1, Farm farm2, Animal animal, Enclosure enclosure)   {
        Animal animalToSell = farm1.getAnimal(animal, enclosure);
        farm2
    }



}

