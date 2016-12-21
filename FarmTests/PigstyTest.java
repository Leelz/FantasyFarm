import Farm.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/12/2016.
 */
public class PigstyTest {

    private Pigsty pigsty;
    private Pig pig1;
    private Pig pig2;

    @Before
    public void Before()    {
        pigsty = new Pigsty(EnclosureType.PIGSTY, 1);
        pig1 = new Pig("Daisy", "Pig", 5);
        pig2 = new Pig("Jane", "Pig", 4);
    }

    @Test
    public void testGetEnclosureType(){
        assertEquals(EnclosureType.PIGSTY, pigsty.getEnclosureType());
    }

    @Test
    public void testEnclosureStartsEmpty(){
        assertEquals(0, pigsty.getSize());
    }

    @Test
    public void testCanAddAnimalToEnclosure(){
        pigsty.addAnimalToEnclosure(pig1);
        pigsty.addAnimalToEnclosure(pig2);
        assertEquals(2, pigsty.getSize());
    }

    @Test
    public void canFindAnimalByName(){
        pigsty.addAnimalToEnclosure(pig1);
        pigsty.addAnimalToEnclosure(pig2);
        assertEquals(pig2, pigsty.findAnimalByName("Jane"));
    }

    @Test
    public void testRemoveAnimalFromEnclosure(){
        pigsty.addAnimalToEnclosure(pig1);
        pigsty.addAnimalToEnclosure(pig2);
        pigsty.removeAnimalByName("Jane");
        assertEquals(1, pigsty.getSize());
    }


}

