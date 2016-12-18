package com.example.user.animal_zoo;
import java.util.ArrayList;

/**
 * Created by user on 18/12/2016.
 */

public class Zoo {

    private ArrayList<Enclosure> allEnclosures;

    public Zoo(ArrayList<Enclosure> allEnclosures) {
        this.allEnclosures = new ArrayList<Enclosure>(allEnclosures);
    }

    public ArrayList<Enclosure> getAllEnclosures() {
        return allEnclosures;
    }

    public void addEnclosureToZoo(Enclosure enclosure) {
        allEnclosures.add(enclosure);
    }


}
