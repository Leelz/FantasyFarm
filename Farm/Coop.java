package Farm;

import java.util.ArrayList;

/**
 * Created by user on 19/12/2016.
 */
public class Coop extends Enclosure {
    
    public ArrayList<Chicken> chickenList;

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

    public ArrayList<Animal> returnAnimals() {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        for (Chicken chicken : chickenList) {
          Animal animal = (Animal)chicken;
          animals.add(animal);
        }
        return animals;
      }

}

