import Farm.*;
import java.util.ArrayList;

public class Runner {
  public static void main(String[] args) {
    System.out.println("What are you going to call your farm? ");
    String farmName = System.console().readLine();
    Farm farm = new Farm(farmName);
    System.out.println("Welcome to " + farm.getName());
    Game game = new Game(farm);

    field = new Field(EnclosureType.FIELD, 1);
    farm.add(field);

    Pigsty pigsy1 = new Pigsty(EnclosureType.PIGSTY, 1);
    farm.add(pigsy);

    COOP coop = new COOP(EnclosureType.COOP, 1);
    farm.add(coop);

/////////
    Pig pig1 = new Pig("Daisy", "Pig", 5);
    farm.addPigToPigsty(pig1, pigsty)

    Cow cow1 = new Cow("Patty", "Cow", 1);
    farm.addCowToField(cow1, field);

    Chicken chicken1 = new Chicken("Ralph", 10);
    farm.addChickenToCoop(chicken1, coop)


    Game.run();

  }
}