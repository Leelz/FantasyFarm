package com.example.user.animal_farm;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 18/12/2016.
 */
public class FieldTest {

    private Enclosure enclosure;
    private Animal dairyCow1;
    private Animal dairyCow2;

    @Before
    public void Before()    {
        enclosure = new Field(EnclosureType.FIELD);
        dairyCow1 = new Cow("Daisy", "Cow", 3);
        dairyCow2 = new Cow("Jane", "Cow", 5);
    }

    @Test
    public void testGetEnclosureType(){
        assertEquals(EnclosureType.FIELD, enclosure.getEnclosureType());
    }

    @Test
    public void testEnclosureStartsEmpty(){
        assertEquals(0, enclosure.numberOfAnimalsInEnclosure());
    }

    @Test
    public void testCanAddAnimalToEnclosure(){
        enclosure.addAnimalToEnclosure(dairyCow1);
        enclosure.addAnimalToEnclosure(dairyCow2);
        assertEquals(2, enclosure.numberOfAnimalsInEnclosure());
    }

    @Test
    public void canFindAnimalByName(){
        enclosure.addAnimalToEnclosure(dairyCow1);
        enclosure.addAnimalToEnclosure(dairyCow2);
        assertEquals(dairyCow2, enclosure.findAnimalByName("Jane"));
    }

    @Test
    public void testRemoveAnimalFromEnclosure(){
        enclosure.addAnimalToEnclosure(dairyCow1);
        enclosure.addAnimalToEnclosure(dairyCow2);
        enclosure.removeAnimalByName("Jane");
        assertEquals(1, enclosure.numberOfAnimalsInEnclosure());
    }

    @Test
    public void testRemoveAnimalByIndex()   {
        enclosure.addAnimalToEnclosure(dairyCow1);
        enclosure.addAnimalToEnclosure(dairyCow2);
        enclosure.removeAnimalByIndex(1);
        assertEquals(1, enclosure.numberOfAnimalsInEnclosure());
    }


}
