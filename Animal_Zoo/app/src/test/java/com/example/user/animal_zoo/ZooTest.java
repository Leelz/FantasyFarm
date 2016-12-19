package com.example.user.animal_zoo;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by user on 18/12/2016.
 */
public class ZooTest {

    private Zoo zoo;
    private Enclosure enclosure;

    @Before
    public void Before(){
        zoo = new Zoo("Adams Zoo");
        enclosure = new Enclosure(EnclosureType.AQUARIUM);
    }

//    @Test
//    public void testGetZooName() {
//        assertEquals("Adam's Zoo", zoo.getName());
//    }

    @Test
    public void testGetEnclosureList() {
        assertNotNull(zoo.getAllEnclosures());
    }


}