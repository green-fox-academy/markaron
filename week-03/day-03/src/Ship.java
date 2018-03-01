import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  List<Pirate> ship = new ArrayList<>();
  //Pirate Captain;
  Pirate pirate;
  int alivePirates = 0;
  int numberOfConsumedRum;

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
    System.out.println("~~~ Ahoy! The ship has " + this.numberOfAlivePirates() + " living pirates!!! Aye!");
    System.out.println("~~~ The captain has already drank " + this.getNumberOfConsumedRum() + " bottles of rum.");
  }

  public int numberOfAlivePirates (){
    alivePirates = 0;
    for (int i = 0; i <ship.size() ; i++) {
      if(!ship.get(i).dead){
        alivePirates++;
      }
    }
    return alivePirates;
  }

  public int getNumberOfConsumedRum (){
    Random m = new Random();
    int ranRum = m.nextInt(10) + 1;
    return numberOfConsumedRum = ranRum;

  }



  @Override
  public String toString() {
    return "This ships crew briefing: " + ship +
            '.';
  }
}
