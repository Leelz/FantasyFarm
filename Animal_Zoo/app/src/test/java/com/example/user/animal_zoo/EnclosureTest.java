package com.example.user.animal_zoo;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by user on 18/12/2016.
 */
public class EnclosureTest {

    private Enclosure enclosure;

    @Before
    public void Before()    {
        enclosure = new Enclosure("AQUARIUM");
    }

    @Test
    public void testGetEnclosureType(){
        assertEquals("AQUARIUM", enclosure.getType());
    }

    
}
