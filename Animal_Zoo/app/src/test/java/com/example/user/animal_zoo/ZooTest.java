package com.example.user.animal_zoo;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 18/12/2016.
 */
public class ZooTest {
    private Zoo zoo;
    private Enclosure enclosure;

    @Before
    public void Before()    {
        zoo = new Zoo("Adam's Zoo");
        enclosure = new Enclosure(EnclosureType.AQUARIUM);
    }

    @Test
    public void testGetZooName() {
        assertEquals("Adam's Zoo", zoo.getName());
    }

    @Test
    public void testZooStartsEmpty(){
        assertEquals(0, zoo.numberOfEnclosuresInZoo());
    }


    @Test
    public void addEnclosuresToZoo() {
        zoo.addNewEnclosure(enclosure);
        assertEquals(1, zoo.numberOfEnclosuresInZoo());
    }


}