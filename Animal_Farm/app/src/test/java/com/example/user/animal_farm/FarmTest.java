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
    private Field field;

    @Before
    public void Before()    {
        farm = new Farm("Adam's Farm");
        field = new Field(EnclosureType.FIELD);
    }

    @Test
    public void testGetZooName() {
        assertEquals("Adam's Farm", farm.getName());
    }

    @Test
    public void testZooStartsEmpty(){
        assertEquals(0, farm.numberOfEnclosuresInFarm());
    }


    @Test
    public void addEnclosuresToZoo() {
        farm.addNewEnclosure(field);
        assertEquals(1, farm.numberOfEnclosuresInFarm());
    }


}