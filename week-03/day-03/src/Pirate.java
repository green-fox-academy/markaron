public class Pirate {
  int intToxication;
  boolean passOut;
  boolean dead;

  public Pirate(int intToxication, boolean passOut, boolean dead) {
    this.intToxication = intToxication;
    this.passOut = passOut;
    this.dead = dead;
  }

  public static void drinkSomeRum(Pirate pirate, int intToxication) {
    if (pirate.dead) {
      System.out.println("he's dead");
    } else {
      intToxication++;
    }
  }

  public static void howsItGoingMate(Pirate pirate){
    if(pirate.dead){
      System.out.println("he's dead");
    } else if (pirate.intToxication < 4) {
      System.out.println("Pour me anudder!");
    }else{
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      pirate.passOut = true;
    }
  }

  public static boolean die(Pirate pirate){
    return pirate.dead = true;
  }

  public static void brawl (Pirate pirate){
    if 
  }
}
