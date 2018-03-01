import java.util.List;

public class Ship {
  List<Pirate> ship;
  Pirate Captain;
  Pirate pirate;

  public void add(Pirate pirate){
    ship.add(pirate);
  }

  @Override
  public String toString() {
    return "Ship{" +
            "ship=" + ship +
            ", Captain=" + Captain +
            '}';
  }
}
