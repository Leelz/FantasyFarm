package Farm;

import java.util.ArrayList;

/**
 * Created by user on 19/12/2016.
 */
public class Field extends Enclosure  {

    public ArrayList<Cow> cattleList;

    public Field(EnclosureType type, int enclosureID){
        super(type, enclosureID);
        cattleList = new ArrayList<>();
    }

    public void addAnimalToEnclosure(Cow cow) {
        cattleList.add(cow);
    }

    public int getSize(){
        return cattleList.size();
    }

    public Cow removeAnimal(Cow cow){
        cattleList.remove(cow);
        return cow;
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

    public int getAnimalIndex(Animal animal) {
        return cattleList.indexOf(animal);
    }

    public Animal removeAnimalByName(String searchName)    {
        Animal animal = findAnimalByName(searchName);
        int index = getAnimalIndex(animal);
        Animal removedAnimal = cattleList.remove(index);
        return removedAnimal;
    }

}
