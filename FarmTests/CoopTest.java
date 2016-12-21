import Farm.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by user on 19/12/2016.
 */
public class CoopTest {

    private Coop coop;
    private Chicken chicken1;
    private Chicken chicken2;

    @Before
    public void Before()    {
        coop = new Coop(EnclosureType.COOP, 1);
        chicken1 = new Chicken("Daisy", "Chicken", 2);
        chicken2 = new Chicken("Jane", "Chicken", 2);
    }

    @Test
    public void testGetEnclosureType(){
        assertEquals(EnclosureType.COOP, coop.getEnclosureType());
    }

    @Test
    public void testEnclosureStartsEmpty(){
        assertEquals(0, coop.getSize());
    }

    @Test
    public void testCanAddAnimalToEnclosure(){
        coop.addAnimalToEnclosure(chicken1);
        coop.addAnimalToEnclosure(chicken2);
        assertEquals(2, coop.getSize());
    }

    @Test
    public void canFindAnimalByName(){
        coop.addAnimalToEnclosure(chicken1);
        coop.addAnimalToEnclosure(chicken2);
        assertEquals(chicken2, coop.findAnimalByName("Jane"));
    }

    @Test
    public void testRemoveAnimalFromEnclosure(){
        coop.addAnimalToEnclosure(chicken1);
        coop.addAnimalToEnclosure(chicken2);
        coop.removeAnimalByName("Jane");
        assertEquals(1, coop.getSize());
    }



}

