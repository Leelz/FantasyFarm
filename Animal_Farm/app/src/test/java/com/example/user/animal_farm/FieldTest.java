package com.example.user.animal_farm;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 18/12/2016.
 */
public class FieldTest {

    private Field field;
    private Cow dairyCow1;
    private Cow dairyCow2;

    @Before
    public void Before()    {
        field = new Field(EnclosureType.FIELD, 1);
        dairyCow1 = new Cow("Daisy", "Cow", 3);
        dairyCow2 = new Cow("Jane", "Cow", 5);
    }

    @Test
    public void testGetEnclosureType(){
        assertEquals(EnclosureType.FIELD, field.getEnclosureType());
    }

    @Test
    public void testEnclosureStartsEmpty(){
        assertEquals(0, field.getSize());
    }

    @Test
    public void testCanAddAnimalToEnclosure(){
        field.addAnimalToEnclosure(dairyCow1);
        field.addAnimalToEnclosure(dairyCow2);
        assertEquals(2, field.getSize());
    }

    @Test
    public void canFindAnimalByName(){
        field.addAnimalToEnclosure(dairyCow1);
        field.addAnimalToEnclosure(dairyCow2);
        assertEquals(dairyCow2, field.findAnimalByName("Jane"));
    }

    @Test
    public void testRemoveAnimalFromEnclosure(){
        field.addAnimalToEnclosure(dairyCow1);
        field.addAnimalToEnclosure(dairyCow2);
        field.removeAnimalByName("Jane");
        assertEquals(1, field.getSize());
    }


}
