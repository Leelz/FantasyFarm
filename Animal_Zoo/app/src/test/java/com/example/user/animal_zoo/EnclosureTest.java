package com.example.user.animal_zoo;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by user on 18/12/2016.
 */
public class EnclosureTest {

    private Enclosure enclosure;
    private Animal animal1;
    private Animal animal2;

    @Before
    public void Before()    {
        enclosure = new Enclosure("AQUARIUM");
        animal1 = new Animal("Frank", "Piranha", 6);
        animal2 = new Animal("Sammy", "Trout", 5);
    }

    @Test
    public void testGetEnclosureType(){
        assertEquals("AQUARIUM", enclosure.getType());
    }

    @Test
    public void testCanAddAnimalToEnclosure(){
        enclosure.addAnimalToEnclosure(animal1);
        enclosure.addAnimalToEnclosure(animal2);
        assertEquals(2, enclosure.numberOfAnimalsInEnclosure());
    }

    @Test
    public void testRemoveAnimalFromEnclosure(){
        enclosure.addAnimalToEnclosure(animal1);
        enclosure.addAnimalToEnclosure(animal2);
        enclosure.removeAnimalByName("Sammy");
        assertEquals(1, enclosure.numberOfAnimalsInEnclosure());
    }


}
