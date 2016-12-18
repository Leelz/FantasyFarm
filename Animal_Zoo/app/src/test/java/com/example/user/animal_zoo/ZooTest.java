package com.example.user.animal_zoo;
import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 18/12/2016.
 */
public class ZooTest {

    private Zoo zoo;
    private Enclosure Enclosure1;


    @Before
    public void Before() {
        zoo = new Zoo("Adam's Zoo");
        Enclosure1 = new Enclosure("Lion Cage");
    }

    @Test
    public void testGetZooName() {
        assertEquals("Adam's Zoo", zoo.getName());
    }

    @Test
    public void testGetEnclosureList() {
        assertNotNull(zoo.getAllEnclosures());
    }
    

}