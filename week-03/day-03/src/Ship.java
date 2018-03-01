import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  List<Pirate> ship = new ArrayList<>();
  Pirate Captain;
  Pirate pirate;

  public void add(Pirate pirate){
    ship.add(pirate);
  }

  public void fillShip(){
    Random n = new Random();
    int ranNum = n.nextInt(10) + 1;
    for (int i = 0; i < ranNum; i++) {
      String name = "Lad " + i;
      Pirate pirate = new Pirate(name);
      ship.add(pirate);
    }

  }

  @Override
  public String toString() {
    return "Ship{" +
            "ship=" + ship +
            ", Captain=" + Captain +
            '}';
  }
}
