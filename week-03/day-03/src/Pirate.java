import java.util.Random;

public class Pirate {
  String name;
  int intToxication = 0;
  boolean passOut = false;
  boolean dead = false;

  public Pirate(String name, int intToxication, boolean passOut, boolean dead) {
    this.name = name;
    this.intToxication = intToxication;
    this.passOut = passOut;
    this.dead = dead;
  }

  public Pirate(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Pirate{" +
            "intToxication=" + intToxication +
            ", passOut=" + passOut +
            ", dead=" + dead +
            '}';
  }

  public void drinkSomeRum() {
    if (this.dead) {
      System.out.println("he's dead");
    } else {
      intToxication++;
    }
  }

  public void howsItGoingMate() {
    if (this.dead) {
      System.out.println("he's dead");
    } else if (this.intToxication < 4) {
      System.out.println("Pour me anudder!");
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      this.passOut = true;
    }
  }

  public static boolean die(Pirate pirate) {
    return pirate.dead = true;
  }

  public void brawl(Pirate pirate) {
    System.out.println("###" + this.name + " got into a fist fight with " + pirate.name + "###");
    Random n = new Random();
    int ranNum = n.nextInt(3) + 1;

    if (pirate.dead) {
      System.out.println("I win yaarrr, u already dead mate!! ~attacked pirate already dead~");
    } else {
      if (ranNum == 1) {
        this.dead = true;
        System.out.println("I got hit! Scurvy dog! ~attacker dies~");
      } else if (ranNum == 2) {
        pirate.dead = true;
        System.out.println("Who is the strong pirate now? Aye!! I win! ~atacker wins~");
      } else if (ranNum == 3) {
        this.passOut = true;
        pirate.passOut = true;
        System.out.println("Both of our brave pirates pass out.");
      }
    }
  }


}
