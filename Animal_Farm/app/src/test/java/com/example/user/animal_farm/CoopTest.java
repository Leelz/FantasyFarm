package com.example.user.animal_farm;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/12/2016.
 */
public class CoopTest {

    private Enclosure enclosure;
    private Animal chicken1;
    private Animal chicken2;

    @Before
    public void Before()    {
        enclosure = new Coop(EnclosureType.COOP);
        chicken1 = new Chicken("Daisy", "Chicken", 2);
        chicken2 = new Chicken("Jane", "Chicken", 2);
    }

    @Test
    public void testGetEnclosureType(){
        assertEquals(EnclosureType.COOP, enclosure.getEnclosureType());
    }

    @Test
    public void testEnclosureStartsEmpty(){
        assertEquals(0, enclosure.numberOfAnimalsInEnclosure());
    }

    @Test
    public void testCanAddAnimalToEnclosure(){
        enclosure.addAnimalToEnclosure(chicken1);
        enclosure.addAnimalToEnclosure(chicken2);
        assertEquals(2, enclosure.numberOfAnimalsInEnclosure());
    }

    @Test
    public void canFindAnimalByName(){
        enclosure.addAnimalToEnclosure(chicken1);
        enclosure.addAnimalToEnclosure(chicken2);
        assertEquals(chicken2, enclosure.findAnimalByName("Jane"));
    }

    @Test
    public void testRemoveAnimalFromEnclosure(){
        enclosure.addAnimalToEnclosure(chicken1);
        enclosure.addAnimalToEnclosure(chicken2);
        enclosure.removeAnimalByName("Jane");
        assertEquals(1, enclosure.numberOfAnimalsInEnclosure());
    }

    @Test
    public void testRemoveAnimalByIndex()   {
        enclosure.addAnimalToEnclosure(chicken1);
        enclosure.addAnimalToEnclosure(chicken2);
        enclosure.removeAnimalByIndex(1);
        assertEquals(1, enclosure.numberOfAnimalsInEnclosure());
    }


}

