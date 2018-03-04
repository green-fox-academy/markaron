import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  List<Pirate> pirateCrew = new ArrayList<>();
  private int shipScore;
  String name;

  public Ship (String name){
    this.name = name;
  }

  public void add(Pirate pirate) {
    pirateCrew.add(pirate);
  }

  public void fillShip() {
    Pirate captain = new Pirate("Captain Moby");
    this.pirateCrew.add(captain);

    Random n = new Random();
    int ranNum = n.nextInt(15) + 4;
    for (int i = 0; i < ranNum; i++) {
      String name = "Lad " + i;
      Pirate pirate = new Pirate(name);
      this.pirateCrew.add(pirate);
    }
    this.getNumberOfConsumedRum();
    this.calculateShipScore();
//    System.out.println("~~~ Ahoy! The " + name +" has " + this.numberOfAlivePirates() + " living pirates!!! Aye!");
//    System.out.println("~~~ The captain has already drank " + pirateCrew.get(0).intToxication + " bottles of rum.");
//    System.out.println("~~~ This ships score is " + calculateShipScore());
  }

  public int numberOfAlivePirates (){
    int alivePirates = 0;
    for (int i = 0; i <this.pirateCrew.size() ; i++) {
      if(!this.pirateCrew.get(i).dead){
        alivePirates++;
      }
    }
    return alivePirates;
  }

  public void getNumberOfConsumedRum (){
    Random m = new Random();
    int ranRum = m.nextInt(8);
    this.pirateCrew.get(0).intToxication = ranRum;
  }

  public int calculateShipScore(){
    shipScore = this.numberOfAlivePirates() - this.pirateCrew.get(0).intToxication;
    return shipScore;
  }

  public boolean battle (Ship ship){
    System.out.println("The " + this.name + " and the " + ship.name + " engage in battle!");
    if (this.shipScore > ship.shipScore){
      int howManyPirateDies = new Random().nextInt(ship.pirateCrew.size());
      for (int i = 0; i < howManyPirateDies; i++) {
        int whichPirateDies = new Random().nextInt(howManyPirateDies);
        ship.pirateCrew.get(whichPirateDies).dead = true;
      }
      for (int i = 0; i < this.pirateCrew.size(); i++) {
        int pirateRumConsum = new Random().nextInt(5);
        this.pirateCrew.get(i).intToxication = pirateRumConsum;
      }
      System.out.println(this.name + " Wins!");
      return true;
    } else {
      int howManyPirateDies = new Random().nextInt(this.pirateCrew.size());
      for (int i = 0; i < howManyPirateDies; i++) {
        int whichPirateDies = new Random().nextInt(howManyPirateDies);
        this.pirateCrew.get(whichPirateDies).dead = true;
      }
      for (int i = 0; i < ship.pirateCrew.size() ; i++) {
        int pirateRumCinsum = new Random().nextInt(5);
        ship.pirateCrew.get(i).intToxication = pirateRumCinsum;
      }
      System.out.println(ship.name + "Wins!");
      return false;
    }
  }

  @Override
 public String toString() {
    return "The " + this.name + " crew briefing: The captain has already drank " + this.pirateCrew.get(0).intToxication +
            " bottles of rum. There are " + this.numberOfAlivePirates() + " alive pirates on board. The score is: "
            + this.calculateShipScore() +
            '.';
  }
}
