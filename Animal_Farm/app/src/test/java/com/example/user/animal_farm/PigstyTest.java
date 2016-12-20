package com.example.user.animal_farm;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/12/2016.
 */
public class PigstyTest {

    private Enclosure enclosure;
    private Animal pig1;
    private Animal pig2;

    @Before
    public void Before()    {
        enclosure = new Pigsty(EnclosureType.PIGSTY);
        pig1 = new Pig("Daisy", "Pig", 5);
        pig2 = new Pig("Jane", "Pig", 4);
    }

    @Test
    public void testGetEnclosureType(){
        assertEquals(EnclosureType.PIGSTY, enclosure.getEnclosureType());
    }

    @Test
    public void testEnclosureStartsEmpty(){
        assertEquals(0, enclosure.numberOfAnimalsInEnclosure());
    }

    @Test
    public void testCanAddAnimalToEnclosure(){
        enclosure.addAnimalToEnclosure(pig1);
        enclosure.addAnimalToEnclosure(pig2);
        assertEquals(2, enclosure.numberOfAnimalsInEnclosure());
    }

    @Test
    public void canFindAnimalByName(){
        enclosure.addAnimalToEnclosure(pig1);
        enclosure.addAnimalToEnclosure(pig2);
        assertEquals(pig2, enclosure.findAnimalByName("Jane"));
    }

    @Test
    public void testRemoveAnimalFromEnclosure(){
        enclosure.addAnimalToEnclosure(pig1);
        enclosure.addAnimalToEnclosure(pig2);
        enclosure.removeAnimalByName("Jane");
        assertEquals(1, enclosure.numberOfAnimalsInEnclosure());
    }

    @Test
    public void testRemoveAnimalByIndex()   {
        enclosure.addAnimalToEnclosure(pig1);
        enclosure.addAnimalToEnclosure(pig2);
        enclosure.removeAnimalByIndex(1);
        assertEquals(1, enclosure.numberOfAnimalsInEnclosure());
    }


}

