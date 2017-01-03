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

    public void getCowDetails() {
        for (Cow cow : cattleList)   {
            System.out.println(cow.getName());
        }
    }

    public ArrayList<Animal> returnAnimals() {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        for (Cow cow : cattleList) {
          Animal animal = (Animal)cow;
          animals.add(animal);
        }
        return animals;
      }

}
