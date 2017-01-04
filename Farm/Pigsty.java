package Farm;

import java.util.ArrayList;

/**
 * Created by user on 19/12/2016.
 */
public class Pigsty extends Enclosure {
    public ArrayList<Pig> pigList;

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

    public void getPigDetails() {
        for (Pig pig : pigList)   {
            System.out.println(pig.getName());
        }
    }

    public void removeAnimal(Pig pig){
        pigList.remove(pig);
    }

    public ArrayList<Animal> returnAnimals() {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        for (Pig pig : pigList) {
          Animal animal = (Animal)pig;
          animals.add(animal);
        }
        return animals;
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

}
