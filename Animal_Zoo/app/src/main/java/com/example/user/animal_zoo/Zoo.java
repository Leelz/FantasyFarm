package com.example.user.animal_zoo;
import java.util.ArrayList;

/**
 * Created by user on 18/12/2016.
 */

public class Zoo {

    private ArrayList<Enclosure> allEnclosures;
    private String name;


    public Zoo(String name) {
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

    public int numberOfEnclosuresInZoo()    {
        return allEnclosures.size();
    }

}
