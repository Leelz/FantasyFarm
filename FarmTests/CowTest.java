import Farm.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by user on 18/12/2016.
 */
public class CowTest {

    private Cow daisy;
    private Cow jane;
    private Cow patty;

    @Before
    public void Before(){
        daisy = new Cow("Daisy", "Cow", 12);
        jane = new Cow("Jane", "Cow", 10);
        patty = new Cow("Patty", "Cow", 1);
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

    @Test
    public void testAnimalCanEat() {
        patty.useEnergy();
        patty.eat();
        assertEquals(100, patty.getEnergy());
    }

    @Test
    public void testAnimalCannotEatWhenFull() {
        patty.eat();
        assertEquals(100, patty.getEnergy());
    }

    @Test
    public void testUseEnergy() {
        patty.useEnergy();
        assertEquals(90, patty.getEnergy());
    }

    @Test
    public void testCannotUseEnergy() {
        patty.setEnergy(5);
        patty.useEnergy();
        assertEquals("Cannot use any more energy", daisy.useEnergy());
    }
}
