package com.example.user.animal_zoo;
import java.util.ArrayList;

/**
 * Created by user on 18/12/2016.
 */

public class Zoo {

    private ArrayList<Enclosure> allEnclosures;
    private String name;

    public Zoo(String name) {
        this.allEnclosures = new ArrayList<Enclosure>(allEnclosures);
        this.name = name;
    }

    public ArrayList<Enclosure> getAllEnclosures() {
        return allEnclosures;
    }

    public void addEnclosureToZoo(Enclosure enclosure) {
        allEnclosures.add(enclosure);
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Enclosure selectEnclosureByIndex(int index){
        return allEnclosures.get(index);
    }
}
