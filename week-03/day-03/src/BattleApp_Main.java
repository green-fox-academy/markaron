import java.util.List;
import java.util.Scanner;

public class BattleApp_Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println(" ### WELCOME TO PIRATE BAY BATTLE ARENA ### ");
    System.out.println("You play as the captain of your ship. Choose a name for your ship, then press enter.");
    String yourShipName = input.nextLine();

    Ship ship01 = new Ship(yourShipName);
    ship01.fillShip();
    System.out.println(ship01);
    System.out.println("Press enter to continue.");
    input.nextLine();
    Ship ship02 = new Ship("Black Water");
    System.out.println("There is a ship coming on the horizon. They are turning their ship towards yours.");

    ship02.fillShip();
    System.out.println("They are catching up, and start to engage.");
    System.out.println("Press enter to continue.");
    input.nextLine();


    System.out.println(ship01);
    System.out.println(ship02);

    if (ship01.battle(ship02)){
      System.out.println(" Nice! You won! ");
    } else {
      System.out.println("The other ship had a better captain, or something. Unfortunately you lose! ");
    }

  }

}
