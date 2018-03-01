import java.util.List;

public class BattleApp_Main {
  public static void main(String[] args) {
    Ship ship1 = new Ship();

    Pirate Joe = new Pirate("Joe");
    Pirate Frank = new Pirate("Frank");
    Pirate Hanz = new Pirate("Hanz");
    Pirate Ubba = new Pirate("Ubba");

    ship1.fillShip();

    System.out.println(ship1);
    //ship1.numberOfAlivePirates();

    System.out.println(ship1.alivePirates);
    System.out.println(ship1.numberOfConsumedRum);
  }

}
