package com.example.user.animal_zoo;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by user on 18/12/2016.
 */
public class AnimalTest {

    private Animal animal;

    @Before
    public void Before(){
        animal = new Animal("Hank", "Tiger", 10);
    }

    @Test
    public void testGetAnimalName(){
        assertEquals("Hank", animal.getName());
    }

    @Test
    public void testGetAnimalType()   {
        assertEquals(100, animal.getHunger());
    }

    @Test
    public void testGetFoodChainLevel()   {
        assertEquals(10, animal.getFoodChainLevel());
    }

}
