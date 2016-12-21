import Farm.*;
import java.util.ArrayList;

public class Runner {
  public static void main(String[] args) {
    System.out.println("What are you going to call your farm? ");
    String farmName = System.console().readLine();
    Farm farm = new Farm(farmName);
    System.out.println("Welcome to " + farm.getName());
    Game game = new Game(farm);

    field1 = new Field(EnclosureType.FIELD, 1);
    farm.allEnclosures.add(field1);

    Pigsty pigsy1 = new Pigsty(EnclosureType.PIGSTY, 1);
    farm.allEnclosures.add(pigsy1);

    COOP coop1 = new COOP(EnclosureType.COOP, 1);
    farm.allEnclosures.add(coop1);

/////////
    Pig pig1 = new Pig("Daisy", "Pig", 5);
    farm.addPigToPigsty(pig1, pigsty1)

    Cow cow1 = new Cow("Patty", "Cow", 1);
    farm.addCowToField(cow1, field1);

    Chicken chicken1 = new Chicken("Ralph", 10);
    farm.addChickenToCoop(chicken1, coop1)


    commandLine.run();

  }
}