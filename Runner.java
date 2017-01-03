import Farm.*;
import java.util.ArrayList;

public class Runner {
  public static void main(String[] args) {
    System.out.println("What are you going to call your farm? ");
    String farmName = System.console().readLine();
    Farm farm = new Farm(farmName);
    System.out.println("Welcome to " + farm.getName());
    Game game = new Game(farm);

    Field field = new Field(EnclosureType.FIELD, 1);
    farm.addNewEnclosure(field);

    Pigsty pigsty = new Pigsty(EnclosureType.PIGSTY, 1);
    farm.addNewEnclosure(pigsty);

    Coop coop = new Coop(EnclosureType.COOP, 1);
    farm.addNewEnclosure(coop);

/////////
    Pig pig1 = new Pig("Porky", "Pig", 5);
    farm.addPigToPigsty(pig1, pigsty);

    Cow cow1 = new Cow("Patty", "Cow", 1);
    farm.addCowToField(cow1, field);

    Chicken chicken1 = new Chicken("Ralph", "Chicken", 10);
    farm.addChickenToCoop(chicken1, coop);

    game.run();

  }
}