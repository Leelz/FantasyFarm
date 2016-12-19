package com.example.user.animal_zoo;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 18/12/2016.
 */
public class FarmTest {
    private Farm farm;
    private Enclosure enclosure;

    @Before
    public void Before()    {
        farm = new Farm("Adam's Farm");
        enclosure = new Enclosure(EnclosureType.PADDOCK);
    }

    @Test
    public void testGetZooName() {
        assertEquals("Adam's Zoo", farm.getName());
    }

    @Test
    public void testZooStartsEmpty(){
        assertEquals(0, farm.numberOfEnclosuresInFarm());
    }


    @Test
    public void addEnclosuresToZoo() {
        farm.addNewEnclosure(enclosure);
        assertEquals(1, farm.numberOfEnclosuresInFarm());
    }


}