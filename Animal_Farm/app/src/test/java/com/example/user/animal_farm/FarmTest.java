package com.example.user.animal_farm;

import com.example.user.animal_farm.Enclosure;
import com.example.user.animal_farm.EnclosureType;
import com.example.user.animal_farm.Farm;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 18/12/2016.
 */
public class FarmTest {
    private Farm farm;
    private Farm farm2;
    private Field field;
    private Field field2;
    private Cow daisy;


    @Before
    public void Before()    {
        farm = new Farm("Adam's Farm");
        field = new Field(EnclosureType.FIELD, 1);
        farm2 = new Farm("Gino's Farm");
        field2 = new Field(EnclosureType.FIELD, 2);
        daisy = new Cow("Daisy", "Cow", 12);
    }

    @Test
    public void testGetFarmName() {
        assertEquals("Adam's Farm", farm.getName());
    }

    @Test
    public void testFarmStartsEmpty(){
        assertEquals(0, farm.numberOfEnclosuresInFarm());
    }

    @Test
    public void addEnclosuresToFarm() {
        farm.addNewEnclosure(field);
        assertEquals(1, farm.numberOfEnclosuresInFarm());
    }

    @Test
    public void sellCow() {
        farm.addNewEnclosure(field);
        farm2.addNewEnclosure(field2);
        farm.addCowToField(daisy, field);
        farm.sellCow(farm2, daisy, field, field2);
        assertEquals(1, farm.numberOfEnclosuresInFarm());
    }


}