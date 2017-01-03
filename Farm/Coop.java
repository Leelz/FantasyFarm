package Farm;

import java.util.ArrayList;

/**
 * Created by user on 19/12/2016.
 */
public class Coop extends Enclosure {
    
    private ArrayList<Chicken> chickenList;

    public Coop(EnclosureType type, int enclosureID){
        super(type, enclosureID);
        chickenList = new ArrayList<>();
    }

    public void getChickenDetails() {
        for (Chicken chicken : chickenList)   {
            System.out.println(chicken.getName());
        }
    }
    
    public void addAnimalToEnclosure(Chicken chicken) {
        chickenList.add(chicken);
    }

    public int getSize(){
        return chickenList.size();
    }

    public void removeAnimal(Chicken chicken){
        chickenList.remove(chicken);
    }

    public Animal findAnimalByName(String searchName)   {
        String searchLower = searchName.toLowerCase();
        for (Animal animal : chickenList){
            String animalName = animal.getName().toLowerCase();
            if (animalName.equals(searchLower)){
                return animal;
            }
        }
        return null;
    }


    public int getAnimalIndex(Animal animal) {
        return chickenList.indexOf(animal);
    }

    public Animal removeAnimalByName(String searchName)    {
        Animal animal = findAnimalByName(searchName);
        int index = getAnimalIndex(animal);
        Animal removedAnimal = chickenList.remove(index);
        return removedAnimal;
    }

}

