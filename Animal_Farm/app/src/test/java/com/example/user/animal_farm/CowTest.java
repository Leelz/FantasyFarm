package com.example.user.animal_farm;

import com.example.user.animal_farm.Animal;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by user on 18/12/2016.
 */
public class CowTest {

    private Cow daisy;
    private Cow jane;
    private Cow patty;

    @Before
    public void Before(){
        daisy = new Cow("Daisy", "Cow");
        jane = new Cow("Jane", "Cow");
        patty = new Cow("Patty", "Cow");
    }

    @Test
    public void testGetAnimalName(){
        assertEquals("Daisy", daisy.getName());
    }

    @Test
    public void testGetCowEnergy()   {
        assertEquals(100, daisy.getEnergy());
    }

    @Test
    public void testGetAnimalType() {
        assertEquals("Cow", daisy.getAnimalType());
    }


}
