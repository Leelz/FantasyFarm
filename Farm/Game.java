package Farm;

import java.util.ArrayList;
import java.util.Scanner;


public class Game {

  private Farm farm;
  Pigsty pigsty;
  Field field;
  Coop coop;

  public Game(Farm farm) {
    this.farm = farm;
  }

  public String index(){
    System.out.println("Hello there, so you're interested in managing your own farm! Check out the commands below");

    System.out.println("What would you like to do? Write: \n'A' to see all the Zoo's Enclosures \n'B' to see all the Zoo's Animals, ");

    String nav = System.console().readLine();

    switch (nav) {
      case "A":
        showFarmDetails();
        index();
      case"exit":
        exit();
    }
    return "Error";    
  }

    public void showFarmDetails(){
      for (Enclosure enclosure : park.enclosures) {
            System.out.println("\n---------------------");
              System.out.println("Enclosure Name: " + enclosure.getName() + "\nNumber of Dinosaurs: " + enclosure.getSize() + "\n");
              ArrayList<Dinosaur> dinosaurs = enclosure.returnDinosaurs();
              for (Dinosaur dinosaur : dinosaurs) {
                System.out.println(dinosaur.getInfo());
              }
            }
          }

  //   public void showAllAnimals(){
  //   index();
  // }

  // public void addAnimal() {
    
  // }

  public void exit(){
      System.out.println("Thank you for visiting us.");
      System.exit(0);
    }


  public void run(){
      index();
    }

}
