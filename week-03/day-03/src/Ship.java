import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  List<Pirate> ship = new ArrayList<>();
  //Pirate Captain;
  Pirate pirate;
  int alivePirates = 0;

  public void add(Pirate pirate) {
    ship.add(pirate);
  }

  public void fillShip() {
    Pirate Captain = new Pirate("Captain Moby");
    ship.add(Captain);

    Random n = new Random();
    int ranNum = n.nextInt(10) + 1;
    for (int i = 0; i < ranNum; i++) {
      String name = "Lad " + i;
      Pirate pirate = new Pirate(name);
      ship.add(pirate);
    }
    this.numberOfAlivePirates();
  }

  public void numberOfAlivePirates (){
    alivePirates = 0;
    for (int i = 0; i <ship.size() ; i++) {
      if(!ship.get(i).dead){
        alivePirates++;
      }
    }
    System.out.println("~~~ Ahoy! The ship has " + alivePirates + " living pirates!!! Aye!");
  }



  @Override
  public String toString() {
    return "This ships crew briefing: " + ship +
            '.';
  }
}
