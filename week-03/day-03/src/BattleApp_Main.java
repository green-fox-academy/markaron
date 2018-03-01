import java.util.List;

public class BattleApp_Main {
  public static void main(String[] args) {
    Ship ship1 = new Ship();

    Pirate Joe = new Pirate("Joe");
    Pirate Frank = new Pirate("Frank");
    Pirate Hanz = new Pirate("Hanz");
    Pirate Ubba = new Pirate("Ubba");

    ship1.add(Joe);
    ship1.add(Frank);

    System.out.println(ship1);
  }

}
