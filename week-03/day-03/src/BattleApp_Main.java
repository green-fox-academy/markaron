import java.util.List;

public class BattleApp_Main {
  public static void main(String[] args) {
    Ship ship01 = new Ship("Red Skull");
    Ship ship02 = new Ship("Black Water");

    ship01.fillShip();
    ship02.fillShip();

    System.out.println(ship01);
    System.out.println(ship02);

    ship01.battle(ship02);

    System.out.println(ship01);
    System.out.println(ship02);

  }

}
