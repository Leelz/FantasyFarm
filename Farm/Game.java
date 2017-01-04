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
    System.out.println("This is Farmville");

    System.out.println("What would you like to do? Write: \n'A' to see all the Zoo's Enclosures \n'B' to see all the animals in the Farm \n 'C' to feed an animal \n 'exit' to leave the Zoo app");

    String nav = System.console().readLine();

    switch (nav) {
      case "A":
        showFarmDetails();
        index(); 
      case "B":
        showAnimalDetails();
        index();
      case "C":
        feedAnimal();
        index();
      case"exit":
        exit();
    }
    return "Error";    
  }

  public void showFarmDetails(){
    for (Enclosure enclosure : farm.allEnclosures) {
          System.out.println("\n---------------------");
            System.out.println("Enclosure Name: " + enclosure.getEnclosureType() + "\nNumber of animals: " + enclosure.getSize() + "\n");
            ArrayList<Animal> animals = enclosure.returnAnimals();
            for (Animal animal : animals) {
              System.out.println(animal.getInfo());
            }
          }
        }

  public void showAnimalDetails(){
    for (Enclosure enclosure : farm.allEnclosures) {
            ArrayList<Animal> animals = enclosure.returnAnimals();
            for (Animal animal : animals) {
              System.out.println(animal.getInfo());
            }
          }
        }

  public void feedAnimal()  {
    System.out.println("Which animal would you like to feed? ");
    String animalToFeed = System.console().readLine();
    for (Enclosure enclosure : farm.allEnclosures) {
            ArrayList<Animal> animals = enclosure.returnAnimals();
            for (Animal animal : animals) {
              if (animalToFeed.equals(animal.getName())) {
                animal.eat();
              }
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
