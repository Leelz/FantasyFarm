import Farm.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by user on 19/12/2016.
 */
public class ChickenTest {

  private Chicken chicken1;
  private Chicken chicken2;
  private Chicken chicken3;

  @Before
  public void Before(){
      chicken1 = new Chicken("Luke", "Chicken", 12);
      chicken2 = new Chicken("Han", "Chicken", 10);
      chicken3 = new Chicken("Vader", "Chicken", 1);
  }

  @Test
  public void testGetAnimalName(){
      assertEquals("Luke", chicken1.getName());
  }

  @Test
  public void testGetChickenEnergy()   {
      assertEquals(60, chicken1.getEnergy());
  }

  @Test
  public void testGetAnimalType() {
      assertEquals("Chicken", chicken1.getAnimalType());
  }

  @Test
  public void testAnimalCanEat() {
      chicken2.eat();
      assertEquals(70, chicken2.getEnergy());
  }

  @Test
  public void testAnimalCannotEatWhenFull() {
      chicken2.eat();
      assertEquals(100, chicken2.getEnergy());
  }

  @Test
  public void testUseEnergy() {
      chicken2.useEnergy();
      assertEquals(90, chicken2.getEnergy());
  }

  @Test
  public void testCannotUseEnergy() {
      chicken2.setEnergy(5);
      chicken2.useEnergy();
      assertEquals("Cannot use any more energy", chicken2.useEnergy());
  }
}
